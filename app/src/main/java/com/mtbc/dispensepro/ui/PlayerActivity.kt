package com.mtbc.dispensepro.ui

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mtbc.dispensepro.R

class PlayerActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        webView = findViewById(R.id.webView)

        // enable JS
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webChromeClient = WebChromeClient()

        val videoId = "dQw4w9WgXcQ"
        val html = """
        <html>
          <body style="margin:0">
            <iframe width="100%" height="100%" 
              src="https://www.youtube.com/embed/$videoId?enablejsapi=1&rel=0" 
              frameborder="0" allow="autoplay; encrypted-media" allowfullscreen>
            </iframe>
          </body>
        </html>
        """.trimIndent()

        webView.loadDataWithBaseURL("https://www.youtube.com", html, "text/html", "utf-8", null)
    }

    override fun onPause() {
        super.onPause()
        webView.onPause()
    }
    override fun onResume() {
        super.onResume()
        webView.onResume()
    }
    override fun onDestroy() {
        webView.loadUrl("about:blank")
        webView.removeAllViews()
        webView.destroy()
        super.onDestroy()
    }
}
