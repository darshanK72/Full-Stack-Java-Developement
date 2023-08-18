package com.microservice.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Component
@Configuration
public class FeignClientIntercepter implements RequestInterceptor{

	@Autowired
	private OAuth2AuthorizedClientManager clientManager;
	
	@Override
	public void apply(RequestTemplate template) {
		
		@SuppressWarnings("null")
		String token = this.clientManager
				.authorize(OAuth2AuthorizeRequest.withClientRegistrationId("internalClient").principal("internal").build())
				.getAccessToken().getTokenValue();
		
		template.header("Authorization", "Bearer "+token);
				
	}

}
