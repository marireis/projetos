package com.teste.swagger.config;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig {

    public void configure(WebSecurity web) throws Exception {//configuracao basica do swagger
        web.ignoring().antMatchers(//ignorar url dos recursos carregados pelo swagger - para nao passar pelo filtro de segurança
                "/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui.html",
                "/webjars/**");
    }

}
