package com.zerobase.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication//(scanBasePackages = ["com.zerobase.api", "com.zerobase.domain"])
@EntityScan(basePackages = ["com.zerobase.domain.domain"])
@ComponentScan(basePackages = ["com.zerobase"])
@EnableCaching
class ApiApplication

    fun main(args: Array<String>) {
        runApplication<ApiApplication>(*args)
    }
