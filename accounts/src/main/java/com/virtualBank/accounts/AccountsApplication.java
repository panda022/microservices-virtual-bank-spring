package com.virtualBank.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "virtualBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pan Gong",
						email = "Pan.Gong@dal.ca",
						url = "https://pangong.dev/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/panda022"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "virtualBank Accounts microservice REST API Documentation",
				url = "https://github.com/panda022"
		)

)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
