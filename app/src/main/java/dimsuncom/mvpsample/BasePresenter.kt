package dimsuncom.mvpsample

import android.content.Context
import android.support.annotation.NonNull

open class BasePresenter {

    protected lateinit var mContext: Context

    fun subscribe(@NonNull context: Context) {
        this.mContext = context
    }

    fun isSubscribed(): Boolean {
        return mContext != null
    }
}