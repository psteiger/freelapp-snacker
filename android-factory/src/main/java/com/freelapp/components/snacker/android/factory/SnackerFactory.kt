package com.freelapp.components.snacker.android.factory

import android.app.Activity
import com.freelapp.components.android.impl.SnackerImpl
import com.freelapp.components.snacker.domain.Snacker

object SnackerFactory {
    fun create(activity: Activity): Snacker = SnackerImpl(activity)
}