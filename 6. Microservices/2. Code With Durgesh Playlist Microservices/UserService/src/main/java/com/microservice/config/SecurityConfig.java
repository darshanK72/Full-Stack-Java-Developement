package com.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityWebFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
				.authorizeHttpRequests()
				.anyRequest()
				.authenticated()
				.and()
				.oauth2ResourceServer()
				.jwt();
		
		return httpSecurity.build();
				
	}
	
	@Bean
	public OAuth2AuthorizedClientManager getClientManager(
			ClientRegistrationRepository registrationRepository,
			OAuth2AuthorizedClientRepository clientRepository
	)
	{
		OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder().clientCredentials().build();
		
		DefaultOAuth2AuthorizedClientManager manager =  new DefaultOAuth2AuthorizedClientManager(registrationRepository, clientRepository);
		
		manager.setAuthorizedClientProvider(provider);
		
		return manager;
	}

}
