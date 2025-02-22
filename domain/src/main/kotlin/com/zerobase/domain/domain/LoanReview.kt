package com.zerobase.domain.domain

import jakarta.persistence.*

@Entity
@Table(name = "LOAN_REVIEW")
class LoanReview(
    //유저 키 값
    @Column(name = "usr_key")
    val userKey: String,
    //대출 한도 총액
    @Column(name = "loan_lmt_amt")
    val loanLimitedAmount: Long,
    //대출 금리
    @Column(name = "loan_intrt")
    val loanInterest: Double
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? =null
}