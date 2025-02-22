package com.zerobase.domain.domain

import jakarta.persistence.*

@Entity
@Table(name = "USR_INFO")
class UserInfo(
    //유저 키 값
    @Column(name = "usr_key")
    val userKey: String,
    //유저 주민번호
    @Column(name = "usr_reg_num")
    val userRegistrationNumber: String,
    //유저 이름
    @Column(name = "usr_nm")
    val userName: String,
    //유저 총 수입
    @Column(name = "usr_icm_amt")
    val userIncomeAmount: Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}