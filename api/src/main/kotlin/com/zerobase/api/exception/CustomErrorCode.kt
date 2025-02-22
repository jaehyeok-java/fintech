package com.zerobase.api.exception

import org.springframework.http.HttpStatus

enum class CustomErrorCode(
    val statusCode: HttpStatus,
    val errorMessage:String,
    val errorCode: String

) {
    RESULT_NOT_FOUND(HttpStatus.BAD_REQUEST,"result not found", "E001")

}