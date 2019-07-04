package com.lx.duan.wandoridkt.ui.frament.kno

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blankj.utilcode.util.LogUtils
import com.lx.duan.wandoridkt.R
import com.lx.duan.wandoridkt.base.BaseFrament
import com.lx.duan.wandoridkt.bean.KnowBean

/**
 * Created by yanfa-005 on 2019/5/31
 */
 open class KnoFrament :BaseFrament(), KnoView.View {
    override fun setData(list: List<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    internal var view: View?=null
    internal var mPresent:KnoPresent?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view=layoutInflater.inflate(R.layout.frament_kno,null)
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mPresent?.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
       mPresent?.detachView()
    }
}