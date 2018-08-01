package dimsuncom.mvpsample.main

import dimsuncom.mvpsample.BasePresenter
import dimsuncom.mvpsample.BaseView

interface MainContract {

   interface View : BaseView<Presenter> {
       fun testView()
   }

    interface Presenter : BasePresenter {
        fun testPresenter()
    }
}
