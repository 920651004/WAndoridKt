package com.lx.duan.wandoridkt.ui.frament.nav

import com.lx.duan.wandoridkt.base.BaseContract

/**
 * Created by Duan on 2019/6/10
 */
interface NavView {
    interface View : BaseContract.BaseView {
        fun setdata(list: List<*>)
    }

    interface Present : BaseContract.BasePresent<NavView.View> {
        fun getrecycle()
    }
}