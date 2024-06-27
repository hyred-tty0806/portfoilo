package com.example.shop.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ViewPathFilter> loggingFilter(){
        FilterRegistrationBean<ViewPathFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new ViewPathFilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }
}
