package com.zerobase.css.dto

class LoanResultDto {
    data class ResponseDto(
        val userKey: String,
        //대출 금리
        val loanInterest: Double,
        //대출 한도 총액
        val limitAmount: Long

    )
}