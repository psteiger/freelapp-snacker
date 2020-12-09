package com.freelapp.components.snacker.domain

interface Snacker {
    operator fun invoke(messageStringResId: Int)
    operator fun invoke(message: String)
}