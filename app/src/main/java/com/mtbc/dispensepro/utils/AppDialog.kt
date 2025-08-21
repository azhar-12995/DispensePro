package com.mtbc.dispensepro.utils

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import com.mtbc.dispensepro.R

object AppDialog {

    fun showMessage(context: Context, message: String) {
        val dialogView = LayoutInflater.from(context).inflate(R.layout.app_dialog, null)

        val dialog = AlertDialog.Builder(context)
            .setView(dialogView)
            .create()

        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent) // make bg transparent

        val tvMessage = dialogView.findViewById<TextView>(R.id.tvMessage)
        val btnOk = dialogView.findViewById<Button>(R.id.btnOk)

        tvMessage.text = message

        btnOk.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}