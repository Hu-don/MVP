package dimsuncom.mvpsample

import android.app.Application
import dimsuncom.mvpsample.di.initDagger

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger(this)
    }
}