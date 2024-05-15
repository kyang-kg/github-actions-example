package com.kg.ghaexample.helper

fun String.isDouble(): Boolean {
    val regex = "^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?\$".toRegex()
    return regex.matches(this)
}