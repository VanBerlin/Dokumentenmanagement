package com.dokuman.dokumentenmangement.config;

import com.dokuman.dokumentenmangement.mapper.RechnungMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public RechnungMapper rechnungMapper() {
        return Mappers.getMapper(RechnungMapper.class);
    }
}

