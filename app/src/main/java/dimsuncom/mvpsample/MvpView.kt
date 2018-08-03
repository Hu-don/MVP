package dimsuncom.mvpsample

import android.widget.ProgressBar

interface MvpView {

    fun showLoading(progress: ProgressBar)

    fun hideLoading()
}