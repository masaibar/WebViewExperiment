package webviewexperiment.masaibar.com.webviewexperiment

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_normal_web_view.*

class NormalWebView : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            Intent(context, NormalWebView::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }.let { context.startActivity(it) }
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_web_view)

        web_view_normal.apply {
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()

            settings.apply {
                javaScriptEnabled = true
            }
        }

        button_reload.setOnClickListener {
            web_view_normal.loadUrl(MainActivity.getUrl())
        }
    }
}
