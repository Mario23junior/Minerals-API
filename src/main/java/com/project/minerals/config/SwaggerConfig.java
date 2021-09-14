package com.project.minerals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
	private static final String BASE_PACKAGE = "com.project.minerals";
	private static final String TITLE_API = "Minerais API";
	private static final String DESCRICAO_API = "Consulta de dados minerais";
	private static final String NAME_AUTHOR = "Mário Junior";
	private static final String VERSION_API = "1.0.0";
	private static final String ENDERECO_GITHUB = "https://github.com/Mario23junior/Minerals-API";
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				.basePackage(BASE_PACKAGE))
				.build()
				.apiInfo(selecInfo());
 	}
	
	private ApiInfo selecInfo() {
		return new ApiInfoBuilder()
				    .title(TITLE_API)
				    .description(DESCRICAO_API)
				    .version(VERSION_API)
				    .contact(new Contact(NAME_AUTHOR, ENDERECO_GITHUB, BASE_PACKAGE))
				    .build();
	}
} 
