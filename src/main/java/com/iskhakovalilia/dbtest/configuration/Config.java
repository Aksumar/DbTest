package com.iskhakovalilia.dbtest.configuration;

import org.db.Algo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Algo algo() {
        return new Algo();
    }
}
