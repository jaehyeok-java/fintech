
/**
 * 이 코드는 springfox를 사용할수있는 스프링버전의 경우에 필요한 코드.
 * 따라서 OpenApiConfig.kt로 대신함
 */

//package com.zerobase.api.config
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class SwaggerConfig {
//    //http://localhost:8080/swagger-ui/index.html
//    @Bean
//    fun api(): Docket {
//        return Docket(DocumentationType.OAS_30)
//            .useDefaultResponseMessages(false)
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.zerobase.api"))
//            .paths(PathSelectors.any())
//            .build()
//            .apiInfo(apiInfo())
//    }
//
//    private fun apiInfo(): ApiInfo {
//        return ApiInfoBuilder()
//            .tutle("Swagger")
//            .description("fintech")
//            .version("1.0")
//            .build()
//    }
//
//
//}