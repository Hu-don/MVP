package dimsuncom.mvpsample.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dimsuncom.mvpsample.R

abstract class MainActivity : AppCompatActivity(), MainContract.View {

    override lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }


}
