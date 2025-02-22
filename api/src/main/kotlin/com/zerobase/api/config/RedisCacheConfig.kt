package com.zerobase.api.config

import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.cache.RedisCacheConfiguration
import org.springframework.data.redis.cache.RedisCacheManager
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import org.springframework.data.redis.serializer.StringRedisSerializer
import java.time.Duration

@Configuration
@EnableCaching
class RedisCacheConfig {

    @Bean
    fun redisCacheManager(cacheFactory: RedisConnectionFactory): CacheManager {
        val redisCacheConfig = RedisCacheConfiguration.defaultCacheConfig()                                             //기본 캐시설정을 가져옴
            .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(StringRedisSerializer()))     // key 를 문자열로 저장하도록 설정
            .serializeValuesWith(                                                                                       // value 를 json 으로 저장하도록 설정
                RedisSerializationContext.SerializationPair.fromSerializer(
                    GenericJackson2JsonRedisSerializer()
                )
            )
            .entryTtl(Duration.ofMinutes(10))

        return RedisCacheManager
            .RedisCacheManagerBuilder
            .fromConnectionFactory(cacheFactory)        // Redis 와 연결정보를 적용
            .cacheDefaults(redisCacheConfig)            // 캐시를 json 으로 저장하는 설정 적용
            .build()                                    // 최종적으로 CacheManager 를 반환

    }
}