package com.example.springsecurity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("api/v1/hello").permitAll();
        http.authorizeRequests().antMatchers("api/v1/user").hasAnyAuthority("user");
        http.authorizeRequests().antMatchers("api/v1/admin").hasAnyAuthority("admin");
    }
}
