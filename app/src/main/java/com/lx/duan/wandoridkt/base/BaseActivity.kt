package com.lx.duan.wandoridkt.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.lx.duan.wandoridkt.base.BaseContract.BasePresent
import me.yokeyword.fragmentation.SupportActivity

/**
 * Created by yanfa-005 on 2019/5/30
 */
abstract class BaseActivity: SupportActivity() {

    protected var mContext:Context?=null
    protected var activity:Activity?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity=this;
        mContext=applicationContext;
        if (savedInstanceState!=null){

        }
    }




}
