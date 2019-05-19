package ru.sergjav.touchtest

import android.view.View

fun View.makeClickable(tag: String) {
    isClickable = true
    setOnClickListener { println("$tag clicked") }
}