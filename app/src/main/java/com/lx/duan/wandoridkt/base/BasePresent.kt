package com.lx.duan.wandoridkt.base

import android.content.Context

/**
 * Created by yanfa-005 on 2019/5/30
 */
open class BasePresent<T :BaseContract.BaseView> :BaseContract.BasePresent<T>{

    var mView:T?=null
    protected open var context: Context?=null
    override fun attachView(view: T) {
        this.mView=view
        //this.context=context;
    }

    override fun detachView() {

            mView = null

    }
}