package com.zerobase.api.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.servers.Server
import org.springframework.context.annotation.Configuration

//  http://localhost:8080/swagger-ui/index.html
@OpenAPIDefinition(
    info = Info(
        title = "My API",
        version = "1.0",
        description = "API 설명"
    ),
    servers = [
        Server(url = "http://localhost:8080", description = "Local Server")
    ]
)
@Configuration
class OpenAPIConfig{

}