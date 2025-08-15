package com.mtbc.dispensepro
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

fun Context.moveToNextActivity(activity: Class<*>) {
    val intent = Intent(this, activity)
    if (this !is Activity) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // required for non-Activity context
    }
    startActivity(intent)
}


fun Context.showYesNoDialog(
    message: String,
    yesText: String = "Yes",
    noText: String = "No",
    onYes: () -> Unit = {},
    onNo: () -> Unit = {}
) {
    val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_yes_no, null)

    val tvMessage = dialogView.findViewById<TextView>(R.id.tv_message)
    val btnYes = dialogView.findViewById<TextView>(R.id.tv_ok)
    val btnNo = dialogView.findViewById<TextView>(R.id.tv_cancel)

    tvMessage.text = message
    btnYes.text = yesText
    btnNo.text = noText

    val alertDialog = AlertDialog.Builder(this,R.style.CustomDialogTheme)
        .setView(dialogView)
        .setCancelable(false)
        .create()

    btnYes.setOnClickListener {
        onYes()
        alertDialog.dismiss()
    }

    btnNo.setOnClickListener {
        onNo()
        alertDialog.dismiss()
    }

    alertDialog.show()
}


fun getColorFromDateString(dateStr: String): Int {
    val formatter = SimpleDateFormat("dd/M/yyyy", Locale.getDefault())
    return try {
        val date = formatter.parse(dateStr)
        val calendar = Calendar.getInstance()
        calendar.time = date!!
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)

        when (dayOfWeek) {
            Calendar.MONDAY    -> Color.parseColor("#F44336") // Red
            Calendar.TUESDAY   -> Color.parseColor("#FF9800") // Orange
            Calendar.WEDNESDAY -> Color.parseColor("#FFC107") // Amber
            Calendar.THURSDAY  -> Color.parseColor("#4CAF50") // Green
            Calendar.FRIDAY    -> Color.parseColor("#009688") // Teal
            Calendar.SATURDAY  -> Color.parseColor("#2196F3") // Blue
            Calendar.SUNDAY    -> Color.parseColor("#9C27B0") // Purple
            else -> Color.GRAY
        }
    } catch (e: Exception) {
        Color.GRAY // fallback
    }
}
fun getDayAndFormattedDate(dateString: String): Pair<String, String>? {
    return try {
        val inputFormat = SimpleDateFormat("dd/M/yyyy", Locale.getDefault())
        val date = inputFormat.parse(dateString)

        val dayFormat = SimpleDateFormat("EEEE", Locale.getDefault()) // Full day name
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()) // e.g., 27 July 2025

        val dayName = dayFormat.format(date!!)
        val formattedDate = dateFormat.format(date)

        Pair(dayName, formattedDate)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}
fun AppCompatActivity.setUpHeader(toolbarTitle: TextView, btnBack: ImageButton, title: String,showBackBtn:Boolean) {
    toolbarTitle.text = title
    if(showBackBtn){
        btnBack.visibility = View.VISIBLE
    }else{
        btnBack.visibility = View.GONE
    }
    btnBack.setOnClickListener {
        onBackPressedDispatcher.onBackPressed()
    }
}
// 4. Auto Slider Extension Function
fun ViewPager2.setupAutoSlider(interval: Long = 3000L) {
    val handler = Handler(Looper.getMainLooper())
    val runnable = object : Runnable {
        override fun run() {
            val nextItem = currentItem + 1
            setCurrentItem(nextItem, true)
            handler.postDelayed(this, interval)
        }
    }

    registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            handler.removeCallbacks(runnable)
            handler.postDelayed(runnable, interval)
        }
    })

    handler.postDelayed(runnable, interval)
}

// 5. PageTransformer Extension (Optional for animation)
fun ViewPager2.applyTransformer() {
    val transformer = CompositePageTransformer().apply {
        addTransformer(MarginPageTransformer(40))
        addTransformer { page, position ->
            val r = 1 - kotlin.math.abs(position)
            page.scaleY = 0.85f + r * 0.15f
        }
    }
    setPageTransformer(transformer)
}
fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}



