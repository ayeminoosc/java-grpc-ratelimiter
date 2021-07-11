package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.DescriptorLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ayemin.ratelimit.util.functions.wrap;

public class YamlDescriptorLoader implements DescriptorLoader {

    private static final String DOMAIN_CONFIG_FOLDER_PATH = "DOMAIN_CONFIG_FOLDER_PATH";
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.{yaml,yml}");

    @Override
    public List<Root> loadConfig(Properties properties){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        System.out.println(Paths.get(properties.getProperty(DOMAIN_CONFIG_FOLDER_PATH, "src/main/resources/domain-configs/")).toAbsolutePath());
        try (Stream<Path> paths = Files.walk(Paths.get(properties.getProperty(DOMAIN_CONFIG_FOLDER_PATH, "src/main/resources/domain-configs/")))) {
            return paths.filter(Files::isRegularFile)
                    .filter(p->{String ps = p.toString(); return ps.endsWith(".yaml") || ps.endsWith(".yml");})
                    .map(wrap(p -> mapper.readValue(p.toFile(), Root.class))).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
