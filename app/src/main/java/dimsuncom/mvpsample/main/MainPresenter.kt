package dimsuncom.mvpsample.main

import android.util.Log

/**
 * Listens to user actions from the UI (MainActivity), retrieves the data and updates
 * the UI as required.
 *
 * Interface for the presenter class
 */


class MainPresenter : MainPresenterImpl<MainView> {
    override fun onAttach(mvpView: MainView) {
        Log.d("ZOU", "onAttach")
    }

    override fun onDetach() {
        Log.d("ZOU", "onDetach")
    }

    override fun myMainPresenterSpecialMethod() {
        Log.d("ZOU", "myMainPresenterSpecialMethod")
    }
}
