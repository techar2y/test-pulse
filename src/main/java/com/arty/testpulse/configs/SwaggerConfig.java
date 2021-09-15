package com.arty.testpulse.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig
{
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();

        /*return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();*/
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("TestPulse API")
                .description("TestPulse API reference for developers")
                .contact(new Contact("name", "url", "email"))
                .licenseUrl("a.yurchenko.r@gmail.com").version("1.0").build();
    }
}
