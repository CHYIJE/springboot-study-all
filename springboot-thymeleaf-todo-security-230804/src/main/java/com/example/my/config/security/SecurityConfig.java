package com.example.my.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.example.my.config.security.auth.CustomAuthenticationFailureHandler;
import com.example.my.config.security.auth.CustomAuthenticationSuccessHandler;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
    private final CustomAuthenticationFailureHandler customAuthenticationFailureHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        // csrf 보안 해제 (실무에서는 보안 적용 권장)
        httpSecurity.csrf(
            config -> config.disable()
        );

        // 요청 주소 인증 및 인가 세팅
        httpSecurity.authorizeHttpRequests(
            config -> config
                .requestMatchers("/css/**", "/js/**", "/img/**")
                .permitAll()
                .requestMatchers("/auth/**", "/api/*/auth/**")
                .permitAll()
                .requestMatchers("/admin/**", "/api/*/auth/**")
                .hasRole("ADMIN")
                .anyRequest()
                .authenticated()
        );

        httpSecurity.formLogin(
            config -> config
                // 실제 로그인 컨트롤러 메소드 경로를 넣는다
                .loginPage("/auth/login")
                // 가상의 주소를 넣는다
                .loginProcessingUrl("/api/v1/auth/login")
                .usernameParameter("id")
                .passwordParameter("password")
                .successHandler(customAuthenticationSuccessHandler)
                .failureHandler(customAuthenticationFailureHandler)
                .permitAll()
        );
        
        return httpSecurity.getOrBuild();
    }
    
}
