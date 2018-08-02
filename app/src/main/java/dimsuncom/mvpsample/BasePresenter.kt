package dimsuncom.mvpsample

interface BasePresenter<V : MvpView> : MvpPresenter<V> {
    override fun onAttach(baseView: V)
}