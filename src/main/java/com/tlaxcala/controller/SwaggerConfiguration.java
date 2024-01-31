
package com.tlaxcala.controller;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    
    /**
     * @return
     */
	
    @Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.tlaxcala.controller"))
				.paths(PathSelectors.any())
				.build().apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Order Service API",
				"Order Service API Description",
				"1.0",
				"https://www.tlaxcala.gob.mx/",
				new Contact("Finanzas", "https://www.tlaxcala.gob.mx/", "hugo_cocat@finanzastlax.gob.mx"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}
