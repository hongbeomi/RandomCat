package github.hongbeomi.randomcat.ui.detail

import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.hongbeomi.randomcat.R
import github.hongbeomi.randomcat.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_URL = "key_url"
    }

    private val url: String by lazy {
        intent.getStringExtra(KEY_URL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityDetailBinding>(
            this,
            R.layout.activity_detail
        ).apply {
            url = this@DetailActivity.url
        }
        doFullScreen()
    }

    private fun doFullScreen() {
        val decorView: View = window.decorView
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                View.SYSTEM_UI_FLAG_FULLSCREEN
    }

}