package com.Project.Colancer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity (optional for development)
            .authorizeHttpRequests()
            .requestMatchers("/signup", "/login", "/public/**").permitAll() // Allow unauthenticated access to these
            .anyRequest().authenticated() // Require authentication for other endpoints
            .and()
            .formLogin().loginPage("/login").permitAll(); // Optional custom login page
        return http.build();
    }
}