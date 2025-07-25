package com.digitalinnovatione.personapi.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.digitalinnovatione.personapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());

    }
    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                .title("Api person")
                .description("Rest API person para gerenciamento")
                .version("1")
                .contact(new Contact("Edson victor", "https://github.com/cruzmenezes/Exemplo-dio-springbootweb.git",null))
                .build();


    }

}
