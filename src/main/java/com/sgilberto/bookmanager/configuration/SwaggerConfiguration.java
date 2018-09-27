package com.sgilberto.bookmanager.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sgilberto.bookmanager.controller"))
				.paths(PathSelectors.ant("/book-manager/api/v1/**")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Book Manager API", "Book Manager provides information about books", "1.0", "urn:tos",
				contactInfo(), "GNU General Public License v3.0", "https://www.gnu.org/licenses/gpl-3.0",
				Collections.emptyList());
	}

	private Contact contactInfo() {
		return new Contact("Sebastian Gilberto", "https://github.com/sgilberto", "sebastiananibalgilberto@gmail.com");
	}
}