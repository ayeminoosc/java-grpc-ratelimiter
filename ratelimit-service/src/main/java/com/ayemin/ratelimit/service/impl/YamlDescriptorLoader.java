package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.DescriptorLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ayemin.ratelimit.util.functions.wrap;

public class YamlDescriptorLoader implements DescriptorLoader {

    private static final String DOMAIN_CONFIG_FOLDER_PATH = "DOMAIN_CONFIG_FOLDER_PATH";
    @Override
    public List<Root> loadConfig(Properties properties){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try (Stream<Path> paths = Files.walk(Paths.get(properties.getProperty(DOMAIN_CONFIG_FOLDER_PATH, "src/resources/domain-configs/")))) {
            return paths.filter(Files::isRegularFile)
                    .filter(p->p.endsWith(".yaml") | p.endsWith(".yml"))
                    .map(wrap(p -> mapper.readValue(p.toFile(), Root.class))).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
