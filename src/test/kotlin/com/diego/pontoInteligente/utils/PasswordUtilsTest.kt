package com.diego.pontoInteligente.utils

import org.junit.Assert
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {

    private val password = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashPassword() {
        val hash = PasswordUtils().generateBcrypt(password)
        Assert.assertTrue(bCryptEncoder.matches(password, hash))
    }

}