package dimsuncom.mvpsample.main

import android.util.Log
import dimsuncom.mvpsample.MvpPresenter

/**
 * Interface for the presenter class
 */

interface MainPresenterImpl<V : MainView> : MvpPresenter<V> {
    fun myMainPresenterSpecialMethod()
}