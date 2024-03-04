package com.spring.boot.security.springbootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity                   // enable method base security for @PreAuthorize("hasRole('ADMIN')")
public class RoleBaseSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails adminUser = User
                .withUsername("Prasad")
                .password(passwordEncoder().encode("abc"))
                .roles("ADMIN")
                .build();
        UserDetails normalUser = User
                .withUsername("ABC")
                .password(passwordEncoder().encode("abc"))
                .roles("NORMAL")
                .build();
        return new InMemoryUserDetailsManager(adminUser,normalUser);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/users/admin")
                .hasRole("ADMIN")
                .requestMatchers("/users/normal")
                .hasRole("NORMAL")
                .requestMatchers("/users/public")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
        return http.build();
    }
}
