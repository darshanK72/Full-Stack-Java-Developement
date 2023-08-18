package com.springboot.helper;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.springboot.security.CustomUserDetailService;

@Component
public class JwtAuthFilter extends OncePerRequestFilter{

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println("Inside Filter");
        String token = request.getHeader("Authorization");
        String username = null;
        System.out.println(token);
        if(token != null && token.startsWith("Bearer"))
        {
            token = token.substring(7);
            System.out.println(token);
            try {
                username = jwtUtil.extractUsername(token);
                System.out.println(username);
            } catch (Exception e) {
               e.printStackTrace();
            }

            UserDetails userDetails = this.customUserDetailService.loadUserByUsername(username);

            if(username != null && SecurityContextHolder.getContext().getAuthentication() == null)
            {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =  new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
            else
            {
                System.out.println("Token is not validated");
            }

        }

        filterChain.doFilter(request, response);
        
    }


    
}
