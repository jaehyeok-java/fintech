package com.zerobase.consumer.dto

import com.zerobase.domain.domain.LoanReview

data class ReviewResponseDto(
    val userKey: String,
    //대출 금리
    val loanInterest: Double,
    //대출 한도 총액
    val limitAmount: Long
){
    fun toLoanReviewEntity(): LoanReview =
        LoanReview(
            userKey = userKey,
            loanInterest = loanInterest,
            loanLimitedAmount = limitAmount
        )
}