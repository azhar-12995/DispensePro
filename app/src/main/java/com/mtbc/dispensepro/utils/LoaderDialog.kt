package com.mtbc.dispensepro.utils

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.Window
import com.mtbc.dispensepro.databinding.DialogLoaderBinding

class LoaderDialog(context: Context) {

    private val dialog: Dialog
    private val binding: DialogLoaderBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = DialogLoaderBinding.inflate(inflater)

        dialog = Dialog(context).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(binding.root)
            setCancelable(false)
            window?.setBackgroundDrawableResource(android.R.color.transparent)
        }
    }

    fun show() {
        if (!dialog.isShowing) dialog.show()
    }

    fun hide() {
        if (dialog.isShowing) dialog.dismiss()
    }
    fun isShowing(): Boolean {
        return dialog.isShowing == true
    }
}
