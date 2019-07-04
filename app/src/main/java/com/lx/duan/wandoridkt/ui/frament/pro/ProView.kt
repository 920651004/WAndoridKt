package com.lx.duan.wandoridkt.ui.frament.pro

import com.lx.duan.wandoridkt.base.BaseContract

/**
 * Created by Duan on 2019/6/11
 */
interface ProView {
    interface View:BaseContract.BaseView {

        fun  setTabData(list: List<*>)
        fun setListData(list: List<*>)
    }
    interface Present:BaseContract.BasePresent<ProView.View>{
        fun getData()
    }
}