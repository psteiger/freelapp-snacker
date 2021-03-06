package com.freelapp.components.android.impl

import android.app.Activity
import android.view.View
import com.freelapp.components.snacker.domain.Snacker
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class SnackerImpl @Inject constructor(private val activity: Activity) : Snacker {

    override fun invoke(message: String) {
        showSnackBar(message, Snackbar.LENGTH_LONG, "OK") {
            snackBar?.dismiss()
        }
    }

    override fun invoke(messageStringResId: Int) {
        showSnackBar(messageStringResId, Snackbar.LENGTH_LONG, "OK") {
            snackBar?.dismiss()
        }
    }

    private var snackBar: Snackbar? = null

    private fun showSnackBar(
        resId: Int,
        duration: Int,
        actionText: String,
        action: (View) -> (Unit)
    ) = showSnackBar(activity.getString(resId), duration, actionText, action)

    private fun showSnackBar(
        message: String,
        duration: Int,
        actionText: String,
        action: (View) -> (Unit)
    ) {
        snackBar = Snackbar
            .make(activity.findViewById(android.R.id.content), message, duration)
            .setAction(actionText, action)
            .apply { show() }
    }
}