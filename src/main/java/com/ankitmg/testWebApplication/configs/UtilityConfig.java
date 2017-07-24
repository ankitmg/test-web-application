package com.ankitmg.testWebApplication.configs;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

/**
 * Created by iankitgupta on 7/24/2017.
 */

@Configuration
public class UtilityConfig {
    @Bean
    public Supplier<DateTime> dateTimeSupplier() {

        return () -> new DateTime();
    }
}