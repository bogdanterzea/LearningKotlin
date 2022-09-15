package com.example.learningapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main() {
    println(squareEquals(listOf(1, 2, 3), listOf(9, 1, 4)))
    squareEquals(listOf(1, 2, 3), listOf(9, 1, 4))
}

fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
    var result = true

    if (list1.size != list2.size)
        result = false
    val list3: List<Int> = list1.map {
        it * it
    }

    if (!list3.containsAll(list2) || !list2.containsAll(list3)) {
        result = false
    }

    return result

}