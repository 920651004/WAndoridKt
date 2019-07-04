package com.lx.duan.wandoridkt.base

/**
 * Created by yanfa-005 on 2019/5/30
 */
interface BaseContract {
    interface BasePresent<T: BaseView>{
        fun attachView(view: T)
        fun detachView()
    }

    interface BaseView {

    }
}