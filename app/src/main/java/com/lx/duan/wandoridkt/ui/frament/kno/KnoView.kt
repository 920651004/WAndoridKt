package com.lx.duan.wandoridkt.ui.frament.kno

import com.lx.duan.wandoridkt.base.BaseContract
import com.lx.duan.wandoridkt.bean.KnowBean

/**
 * Created by yanfa-005 on 2019/5/31
 */
open interface KnoView  {
    interface View:BaseContract.BaseView{
        fun  setData( list: List<*>)
    }
    interface Present :BaseContract.BasePresent<KnoView.View>{
        fun getData()
    }
}