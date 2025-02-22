package com.zerobase.api.aop

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch

@Component
@Aspect
class LogAspect {

    val logger = KotlinLogging.logger {   }

    @Pointcut("execution(* com.zerobase.api..*(..))")
    fun isApi(): Unit {
    }

    @Around("isApi()")
    fun loggingAspect(joinPoint: ProceedingJoinPoint): Any {
        val stopWatch = StopWatch()
        stopWatch.start()

        val result = try {
            joinPoint.proceed()
        } catch (ex: Exception) {
            logger.error(ex) { "Exception in method: ${joinPoint.signature.name}" }
            throw ex
        }

        stopWatch.stop()

        // args가 비어있지 않을 경우에만 로깅
        val argsString = if (joinPoint.args.isNotEmpty()) joinPoint.args.joinToString() else "No Arguments"
        logger.info { "${joinPoint.signature.name} $argsString ${stopWatch.totalTimeMillis}" }

        return result
    }
}
