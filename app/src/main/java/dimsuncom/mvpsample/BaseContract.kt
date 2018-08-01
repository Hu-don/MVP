package dimsuncom.mvpsample


interface BaseContract {
    interface View<T : Presenter> {
        fun setPresenter(presenter: T)
    }

    interface Presenter {
        fun start()
        fun stop()
    }
}