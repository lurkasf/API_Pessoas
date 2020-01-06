package com.testacion.RestApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2

public class SwaggerConfig {
    @Bean
    public Docket pessoaApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.testacion.RestApi"))
                .paths(PathSelectors.ant("/api/*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("API REST PESSOAS")
                .description("Uma API REST para gerenciamento de pessoas")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .contact(new Contact("Luska","http://www.google.com", "brgs886@gmail.com"))
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")

                .build();
        return  apiInfo;
    }


}
