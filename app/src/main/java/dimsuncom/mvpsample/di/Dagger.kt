package dimsuncom.mvpsample.di

import android.app.Application
import android.content.Context
import dagger.Component
import dagger.Module
import dagger.Provides
import dimsuncom.mvpsample.main.*
import javax.inject.Singleton

/**
 * Simplifier l'arbre des dependances
 * Ne pas se soucier de la creation d'objets
 *
 * Ex : Room
 */

lateinit var dagger: ApplicationComponent

/**
 * Ici on fourni ce qui ne peut pas être créé dans le systeme de dependance
 */
fun initDagger(application: Application) {
    dagger = DaggerApplicationComponent.builder()
            .appModule(AppModule(application))
            .presenterModule(PresenterModule(true))
            .build()
}


/**
 *  Inject pour chaque activité ou il faudra de l'injection
 * @Component : composé de modules
 */

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class])
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

@Module
class PresenterModule(private val mock: Boolean) {

    @Provides
    fun getPresenter(): MainPresenter<MainView> =
            if (mock) MainPresenterMock() else MainPresenterImpl()
}