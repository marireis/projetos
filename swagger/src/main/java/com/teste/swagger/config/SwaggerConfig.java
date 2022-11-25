package com.teste.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {//configuração basica do swagger
        return new Docket(DocumentationType.SWAGGER_2)//coloca as informaçoes na api
                .useDefaultResponseMessages(false)//respostas padrao - 403, 402...
                .select()//metodo select para colocar as apis
                .apis(RequestHandlerSelectors//busca as api pelo pacote
                        .basePackage("com.curso.springboot.rest.controller"))//todas as apis que estao dentro desse pacote, vao esta scaneadas pelo swagger e gera documentacao
                .paths(PathSelectors.any())//
                .build();
    }
}
