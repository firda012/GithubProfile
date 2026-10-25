package com.example.githubprofile.helpers

import com.example.githubprofile.BuildConfig

class Config {
    companion object {
        const val SPLASH_SCREEN_DELAY: Long = 3000
        const val BASE_URL = "https://api.github.com/"
        const val DEFAULT_USER_LOGIN = "firda012"
        const val DEBUG = true

        val PERSONAL_ACCESS_TOKEN: String? = if (BuildConfig.ACCESS_TOKEN.isNotBlank()) "token ${BuildConfig.ACCESS_TOKEN}" else null
    }
}
