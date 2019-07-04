package com.lx.duan.wandoridkt.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import butterknife.BindView
import com.lx.duan.wandoridkt.R
import com.lx.duan.wandoridkt.base.BaseActivity
import com.lx.duan.wandoridkt.base.BaseContract
import com.lx.duan.wandoridkt.base.BasePresent
import com.lx.duan.wandoridkt.utlis.Contents
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    val hideFrament= Contents.Main
    val showFrament=Contents.Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState!=null){

        }
    }
}
