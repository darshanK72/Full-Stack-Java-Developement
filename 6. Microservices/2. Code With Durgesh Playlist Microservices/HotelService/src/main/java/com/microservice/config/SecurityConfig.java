package com.microservice.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableEurekaClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
				.authorizeRequests()
				.anyRequest()
				.authenticated()
				.and()
				.oauth2ResourceServer()
				.jwt();
		
		return httpSecurity.build();
		
	}
}
