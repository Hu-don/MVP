package dimsuncom.mvpsample.main

import android.util.Log
import dimsuncom.mvpsample.MvpPresenter

/**
 * Listens to user actions from the UI (MainActivity), retrieves the data and updates
 * the UI as required.
 */

interface MainPresenter<V : MainView> : MvpPresenter<V> {
    fun myMainPresenterSpecialMethod()
}

class MainPresenterMock : MainPresenter<MainView> {
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

class MainPresenterImpl : MainPresenter<MainView> {
    override fun onAttach(mvpView: MainView) {
        Log.d("MainPresenterImpl", "onAttach")
    }

    override fun onDetach() {
        Log.d("MainPresenterImpl", "onDetach")
    }

    override fun myMainPresenterSpecialMethod() {
        Log.d("MainPresenterImpl", "myMainPresenterSpecialMethod")
    }

}
