package com.praveen.restservices;

import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBootRestfulWebservice {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulWebservice.class, args);
	}

	@Bean
	public Docket configDock() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(basePackage("com.praveen.restservices.controller"))
				.paths(regex("/rest.*")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("PRAVEEN ORUGANTI SPRING BOOT SWAGGER")
				.description("WELCOME TO SWAGGER CLIENT")
				.contact(new Contact("PRAVEEN ORUGANTI", "https://praveenoruganti.blogspot.com/", "mnp3pk@gmail.com"))
				.license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").version("1.0.0")
				.build();
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
