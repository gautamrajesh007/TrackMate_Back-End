package org.backend.trackmate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public interface WebSecurityConfig {
    @Bean
    default BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    };

    void configure(AuthenticationManagerBuilder auth) throws Exception;

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception;
}
