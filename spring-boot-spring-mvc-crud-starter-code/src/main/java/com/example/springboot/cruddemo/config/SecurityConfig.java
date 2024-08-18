package com.example.springboot.cruddemo.config; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails praveen = User.builder()
                .username("praveen")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails virat = User.builder()
                .username("virat")
                .password("{noop}virat123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails dhoni = User.builder()
                .username("dhoni")
                .password("{noop}dhoni123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(praveen, virat, dhoni);
    }
}












