package com.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/home")
	public ResponseEntity<String> home(@AuthenticationPrincipal OidcUser user)
	{
		return ResponseEntity.ok("This is Home Page : " + user.getFullName());
	}

}
