package com.example.learningapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main() {
    println(hasRepeatedCharacter("abc")) // false"

    println(hasRepeatedCharacter("aabc")) // true

    println(hasRepeatedCharacter("aabcc")) // true
}

fun hasRepeatedCharacter (string : String): Boolean {
    val chars: List<Char> = string.toList()

    var character = chars[0]

    chars.forEach { param ->
        val result = string.count {
            it == param
        } > 1
        if(result) return result
    }

    return false
}

