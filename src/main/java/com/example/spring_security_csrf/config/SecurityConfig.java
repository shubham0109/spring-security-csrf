package com.example.spring_security_csrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests()
                .anyRequest().permitAll();

        //http.csrf().disable(); // disables csrf for all routes, bad idea
        //http.csrf().ignoringRequestMatchers("/insert"); // better way to disable csrf for some routes


        return http.build();
    }



}
