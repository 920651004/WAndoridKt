package com.lx.duan.wandoridkt.ui.frament.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lx.duan.wandoridkt.R
import com.lx.duan.wandoridkt.base.BaseFrament
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Duan on 2019/6/10
 */
class NavFrament: BaseFrament() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.frament_nav,null)
        return view
    }
}