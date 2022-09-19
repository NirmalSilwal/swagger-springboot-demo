package com.api.doc.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

// note - in big application put swagger class in another swagger config class
@SpringBootApplication
@EnableSwagger2
public class SwaggerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerdemoApplication.class, args);
    }

    // to configure which method you wanna expose in documentation, customize using Docket
    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.api.doc"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Contact Address Book API",
                "Simple API for Swagger demo in spring boot application",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Nirmal Silwal", "https://nirmalsilwal.github.io/", "nsilwal@mail.com"),
                "Address API License",
                "https://swagger.io/",
                Collections.emptyList()
        );
    }
}
