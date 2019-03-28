package dimsuncom.mvpsample.main

import dimsuncom.mvpsample.MvpPresenter

/**
 * Listens to user actions from the UI (MainActivity), retrieves the data and updates
 * the UI as required.
 */

interface MainPresenter <V: MainView> : MvpPresenter<V>{
}
