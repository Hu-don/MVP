package dimsuncom.mvpsample

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ProgressBar

open abstract class BaseActivity : AppCompatActivity(), MvpView {

    private var mProgressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun showLoading() {
        hideLoading()
        mProgressBar?.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        if (mProgressBar?.visibility == ProgressBar.VISIBLE) {
            mProgressBar?.visibility = View.GONE
        }
    }
}
