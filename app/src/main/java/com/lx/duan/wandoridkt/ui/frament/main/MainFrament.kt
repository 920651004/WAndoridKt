package com.lx.duan.wandoridkt.ui.frament.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lx.duan.wandoridkt.R
import com.lx.duan.wandoridkt.base.BaseFrament

/**
 * Created by yanfa-005 on 2019/5/31
 */
class MainFrament :BaseFrament() {
    internal  var view:View?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view=layoutInflater.inflate(R.layout.frament_main,null)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
}