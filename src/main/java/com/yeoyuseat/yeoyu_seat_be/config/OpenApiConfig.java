package com.yeoyuseat.yeoyu_seat_be.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Yeoyu Seat API")
                        .version("0.0.1")
                        .description("API documentation for the Yeoyu Seat project"));
    }
}
