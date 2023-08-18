package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.springboot.helper.JwtAuthEntryPoint;
import com.springboot.helper.JwtAuthFilter;
import com.springboot.security.CustomUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @Autowired
    private JwtAuthFilter joAuthFilter;

    @Autowired
    private JwtAuthEntryPoint jwtAuthEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .cors().disable()
            .authorizeRequests()
            .antMatchers("/login").permitAll()
            .antMatchers("/about").permitAll()
            .antMatchers("/token").permitAll()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .loginProcessingUrl("/dologin")
            .defaultSuccessUrl("/home")
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .exceptionHandling().authenticationEntryPoint(jwtAuthEntryPoint);

        http
            .addFilterBefore(joAuthFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
        .ignoring()
        .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/img/**", "/icon/**");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth
            .userDetailsService(customUserDetailService)
            .passwordEncoder(this.passwordEncoder());
    }


    @Bean
    BCryptPasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder(10);
    }

    @Bean
    AuthenticationManager getAuthenticationManager() throws Exception
    {
        return super.authenticationManagerBean();
    }
    
    
}
