package com.example.demo.reddit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
    throws Exception {
    //        weird? new Spring Security https://docs.spring.io/spring-security/reference/migration-7/configuration.html#_use_the_lambda_dsl
    return httpSecurity
      .authorizeHttpRequests(authorize ->
        authorize
          .requestMatchers("/actuator/**")
          .permitAll()
          .anyRequest()
          .authenticated()
      )
      .formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
      .build();
  }
}
