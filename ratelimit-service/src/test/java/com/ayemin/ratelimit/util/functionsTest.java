package com.ayemin.ratelimit.util;

import com.ayemin.ratelimit.domain.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.ayemin.ratelimit.util.functions.convertToDescriptorCacheKey;
import static org.junit.jupiter.api.Assertions.*;

class functionsTest {

    private static Root testConfigRoot;

    @BeforeAll
    public static void init() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        File file = new File("src/test/resources/test-config.yaml");
        testConfigRoot = mapper.readValue(file, Root.class);
    }

    @Test
    void testGetAllRateLimitFromDescriptorWithLimitOnParent() throws IOException {
        List<Descriptor> descriptors = testConfigRoot.getDescriptors();
        List<Pair<String, RateLimit>> pairList = functions.getAllRateLimitFromDescriptor(descriptors.get(0));

        Pair<String, RateLimit> p1 = new Pair<>("org:rhovg", new RateLimit(20, Unit.MINUTE));
        Pair<String, RateLimit> p2 = new Pair<>("org:rhovg_user:tester1", new RateLimit(10, Unit.MINUTE));
        Pair<String, RateLimit> p3 = new Pair<>("org:rhovg_user:tester2", new RateLimit(5, Unit.MINUTE));

        assertEquals(3, pairList.size());
        assertTrue(pairList.contains(p1));
        assertTrue(pairList.contains(p2));
        assertTrue(pairList.contains(p3));
    }

    @Test
    void testGetAllRateLimitFromDescriptorWithoutLimitOnParent() throws IOException {
        List<Descriptor> descriptors = testConfigRoot.getDescriptors();
        List<Pair<String, RateLimit>> pairList = functions.getAllRateLimitFromDescriptor(descriptors.get(1));

        Pair<String, RateLimit> p2 = new Pair<>("org:rhovg_user:tester1", new RateLimit(10, Unit.MINUTE));
        Pair<String, RateLimit> p3 = new Pair<>("org:rhovg_user:tester2", new RateLimit(5, Unit.MINUTE));

        assertEquals(2, pairList.size());
        assertTrue(pairList.contains(p2));
        assertTrue(pairList.contains(p3));
    }

    @org.junit.jupiter.api.Test
    void testGetAllRateLimitFromDescriptorForOther() throws IOException {
        List<Descriptor> descriptors = testConfigRoot.getDescriptors();
        List<Pair<String, RateLimit>> pairListForAllOrg = functions.getAllRateLimitFromDescriptor(descriptors.get(2));
        List<Pair<String, RateLimit>> pairListForAllUsers = functions.getAllRateLimitFromDescriptor(descriptors.get(3));
        List<Pair<String, RateLimit>> pairListForBannedUser = functions.getAllRateLimitFromDescriptor(descriptors.get(4));

        //checking for allOrg config
        assertEquals(1, pairListForAllOrg.size());
        Pair<String, RateLimit> pair = new Pair<>("org", new RateLimit(100, Unit.MINUTE));
        assertTrue(pairListForAllOrg.contains(pair));

        //checking for allUser config
        assertEquals(1, pairListForAllUsers.size());
        pair = new Pair<>("user", new RateLimit(3, Unit.MINUTE));
        assertTrue(pairListForAllUsers.contains(pair));

        //checking for ban_user config
        assertEquals(1, pairListForBannedUser.size());
        pair = new Pair<>("user:ban_user", new RateLimit(0, Unit.MINUTE));
        assertTrue(pairListForBannedUser.contains(pair));
    }

    @Test
    void testConvertToDescriptorCacheKeyGivenOneOrgAndTwoUserShouldThrowIllegalArgumentException() {
        Descriptor org = new Descriptor();
        org.setKey("org");
        org.setValue("rhovg");
        Descriptor user1 = new Descriptor();
        user1.setKey("user");
        user1.setValue("tester1");
        user1.setRateLimit(new RateLimit(20, Unit.MINUTE));
        Descriptor user2 = new Descriptor();
        user2.setKey("user");
        user2.setValue("tester2");
        org.setDescriptors(Arrays.asList(user1, user2));

        assertThrows(IllegalArgumentException.class,()-> convertToDescriptorCacheKey(org));
    }

    @Test
    void testConvertToDescriptorCacheKeyGivenOneOrg() {
        Descriptor org = new Descriptor();
        org.setKey("org");
        org.setValue("rhovg");
        Descriptor user1 = new Descriptor();
        user1.setKey("user");
        user1.setValue("tester1");
        user1.setRateLimit(new RateLimit(20, Unit.MINUTE));
        org.setDescriptors(Arrays.asList(user1));

        assertEquals("org:rhovg_user:tester1", convertToDescriptorCacheKey(org));
    }

    @Test
    void testConvertToDescriptorCacheKeyGivenOrgWithoutValue() {
        Descriptor org = new Descriptor();
        org.setKey("org");
        Descriptor user1 = new Descriptor();
        user1.setKey("user");
        user1.setValue("tester1");
        user1.setRateLimit(new RateLimit(20, Unit.MINUTE));
        org.setDescriptors(Arrays.asList(user1));

        assertEquals("org_user:tester1", convertToDescriptorCacheKey(org));
    }

}