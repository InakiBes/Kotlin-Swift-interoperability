package com.religada.kmpinteroperability

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform