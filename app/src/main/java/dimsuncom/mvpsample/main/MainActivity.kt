package dimsuncom.mvpsample.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dimsuncom.mvpsample.BaseActivity
import dimsuncom.mvpsample.R

class MainActivity : BaseActivity(), MainView {

    lateinit var presenter: MainPresenter<MainView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onAttach(this)
        showLoading()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }
}
