package com.lx.duan.wandoridkt.ui.frament.pro

import android.app.Activity
import com.lx.duan.wandoridkt.base.BasePresent
import com.lx.duan.wandoridkt.bean.Probean
import com.lx.duan.wandoridkt.utlis.Contents
import com.lx.duan.wandoridkt.utlis.JsonUtil
import com.lx.duan.wandoridkt.utlis.StringDialogCallback
import com.lzy.okgo.OkGo
import com.lzy.okgo.model.Response

/**
 * Created by Duan on 2019/6/11
 */
class ProPresent :BasePresent<ProView.View>(),ProView.Present {
    override fun getData() {
        OkGo.get<String>(Contents.Main_Pro)
                .execute(object :StringDialogCallback(context as Activity){
                    override fun onSuccess(response: Response<String>?) {
                        super.onSuccess(response)
                        var probean =JsonUtil.fromJson(response?.body(),Probean::class.java)

                    }
                })
    }
}