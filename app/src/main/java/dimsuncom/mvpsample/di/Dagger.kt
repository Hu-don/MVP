package dimsuncom.mvpsample.di

import android.app.Application
import android.content.Context
import android.util.Log
import dagger.Component
import dagger.Module
import dagger.Provides
import dimsuncom.mvpsample.main.MainActivity
import javax.inject.Singleton

/**
 * Simplifier l'arbre des dependances
 * Ne pas se soucier de la creation d'objets
 *
 * Ex : Room
 */

lateinit var dagger: ApplicationComponent

fun initDagger(application: Application) {
    dagger = DaggerApplicationComponent.builder()
            .appModule(AppModule(application))
            .build()
}


/**
 *  Inject pour chaque activité ou il faudra de l'injection
 * @Component : composé de modules
 */

@Singleton
@Component(modules = [AppModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}

/**
 * @Provides : ce qui peut etre injecté
 * /!\ type de retour unique et donc a l'echelle du component et non du module
 */
@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    fun getContext(): Context = application
}