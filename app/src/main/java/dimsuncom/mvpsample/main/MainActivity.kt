package dimsuncom.mvpsample.main

import android.os.Bundle
import dimsuncom.mvpsample.BaseActivity
import dimsuncom.mvpsample.R
import dimsuncom.mvpsample.di.dagger
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {
    @Inject
    lateinit var presenter: MainPresenterImpl<MainView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dagger.inject(this)

        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.myMainPresenterSpecialMethod()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun specificMainFunction() {
    }

}
