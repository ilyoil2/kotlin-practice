package com.example.kotlinpractice.domain.auth.dto.response

import java.time.LocalDateTime

data class TokenResponse(
    val accessToken: String,
    val accessTokenExp: LocalDateTime,
    val refreshToken: String
)