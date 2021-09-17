package com.leizhou.autoconfiguration;

import com.leizhou.dto.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MySeamlessConfig {

    @Bean
    @ConditionalOnProperty("leizhou")
    public Person person(){
        return new Person("周磊", 18);
    }
}
