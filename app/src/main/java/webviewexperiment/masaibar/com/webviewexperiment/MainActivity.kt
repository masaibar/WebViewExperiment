package webviewexperiment.masaibar.com.webviewexperiment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val URL = "https://m.yahoo.co.jp"
        fun getUrl(): String {
            return URL
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG)

        button_normal.setOnClickListener {
            NormalWebView.start(this)
        }
    }
}
