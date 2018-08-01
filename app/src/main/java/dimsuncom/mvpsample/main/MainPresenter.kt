package dimsuncom.mvpsample.main

import android.util.Log
import android.widget.Toast

/**
 * Listens to user actions from the UI (MainActivity), retrieves the data and updates
 * the UI as required.
 */

class MainPresenter (
        private val mainView: MainContract.View
) : MainContract.Presenter {

    init {
        mainView.presenter = this
    }

    override fun testPresenter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun start() {
    }
}