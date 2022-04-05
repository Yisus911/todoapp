package com.spring.todoapp.context;

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
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//Se indica los objetos que se van a documentar en este caso son los que esten dentro de controller
				.apis(RequestHandlerSelectors.basePackage("com.spring.todoapp.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfo("Todo API",   
							"La api rest de todo app",   
							"v1",   
							"Terms of Service",   
							//new Contact("todo API", "www.example.com", "jesus.perez@ids.com.mx"),   
							"",
							"License of api",   
							"Api license url");
	}

}
