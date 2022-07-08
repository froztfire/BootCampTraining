package com.bootcamp.w6.miniProj.RestAPIminiProj.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class SwaggerConfiguration {

  public static final String AUTHORIZATION_HEADER = "Authorization";

  private ApiInfo apiInfo() {
    return new ApiInfo("Employee REST API",
        "Some custom description of API.",
        "1.0",
        "Terms of service",
        new Contact("Jerome Garcia", "", "jerome.garcia@softvision.com"),
        "License of API",
        "API license URL",
        Collections.emptyList());
  }

  //++++++++++++++++++++++++++++++++++++++ Configured Swagger UI ++++++++++++++++++++++++++++++++++++++++++++
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
        .apiInfo(apiInfo())
        .securityContexts(Arrays.asList(securityContext()))
        .securitySchemes(Arrays.asList(apiKey()))
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiKey apiKey() {
    return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
  }

  private SecurityContext securityContext() {
    return SecurityContext.builder()
        .securityReferences(defaultAuth())
        .build();
  }

  List<SecurityReference> defaultAuth() {
    AuthorizationScope authorizationScope
        = new AuthorizationScope("global", "accessEverything");
    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
    authorizationScopes[0] = authorizationScope;
    return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
  }

}