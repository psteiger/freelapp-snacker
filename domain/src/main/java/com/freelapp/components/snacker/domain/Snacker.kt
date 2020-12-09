package com.freelapp.components.snacker.domain

interface Snacker {
    fun showSnackBar(messageStringResId: Int)
    fun showSnackBar(message: String)
}