package com.lx.duan.wandoridkt.ui.frament.kno

import android.app.Activity
import android.content.Context
import com.blankj.utilcode.util.ToastUtils
import com.lx.duan.wandoridkt.base.BasePresent
import com.lx.duan.wandoridkt.bean.KnowBean
import com.lx.duan.wandoridkt.utlis.Contents
import com.lx.duan.wandoridkt.utlis.JsonUtil
import com.lx.duan.wandoridkt.utlis.StringDialogCallback
import com.lzy.okgo.OkGo
import com.lzy.okgo.model.Response
import java.util.ArrayList

/**
 * Created by yanfa-005 on 2019/5/31
 */
abstract class KnoPresent: BasePresent<KnoView.View>(),KnoView.Present {
     override var context: Context?=null
      lateinit var list: MutableList<KnowBean.DataBean>
    override fun getData() {
        OkGo.get<String>(Contents.Main_Know)
                .execute(object : StringDialogCallback(context as Activity) {
                    override fun onSuccess(response: Response<String>) {
                        val bean = JsonUtil.fromJson(response.body().toString(), KnowBean::class.java)
                        list = ArrayList()
                        if (bean.getData() == null) {
                            ToastUtils.showShort("获取数据为空")
                            return
                        }
                        list.addAll(bean.getData())
                        mView?.setData(list)

                    }
                })
    }

}