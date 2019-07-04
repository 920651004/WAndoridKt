package com.lx.duan.wandoridkt.ui.frament.main

import com.lx.duan.wandoridkt.base.BaseContract

/**
 * Created by yanfa-005 on 2019/5/31
 */
interface MainView  {
    interface View :BaseContract.BaseView{
        abstract fun Bannerdata(list: List<*>)
        abstract fun Recydata(list: List<*>)
        abstract fun loadmore(list: List<*>)
    }
    interface present:BaseContract.BasePresent<MainView.View>{
        abstract fun getBannerdata()
        abstract fun getRecycledata()
    }
}