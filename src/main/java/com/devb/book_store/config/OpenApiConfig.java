package com.devb.book_store.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "Balduino Mendes",
						email = "baldhuino@gmail.com",
						url = "https://wwww.github.com/devbmendes"
						),
				description = "Book Store API Documentation",
				title = "Book Store ",
				version = "1.0"
				)
		
		)

public class OpenApiConfig {

}
