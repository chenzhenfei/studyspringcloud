package com.study.serviceremeber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.awt.*;

/**
 * swagger 集成
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().
                apis(RequestHandlerSelectors.basePackage("com.study.serviceremeber")).
                paths(PathSelectors.any()).build();
    }

    /**
     * @return
     */
    private ApiInfo apiInfo() {
        /**
         * 采用建造者设计模式创建
         */
        return new ApiInfoBuilder().title("SpringBoot with Swagger Documentation")
                .description("for the Application")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact(new Contact("chenzhenfei", "com.xx.xxx", "916927902@qq.com"))
                .version("1.0")
                .build();
    }

}
