package com.lx.duan.wandoridkt.ui.frament.main

import android.app.Activity
import android.content.Context
import com.blankj.utilcode.util.ToastUtils
import com.lx.duan.wandoridkt.base.BasePresent
import com.lx.duan.wandoridkt.bean.MainRecycleBean
import com.lx.duan.wandoridkt.bean.Mainfrabean
import com.lx.duan.wandoridkt.utlis.Contents
import com.lx.duan.wandoridkt.utlis.JsonUtil
import com.lx.duan.wandoridkt.utlis.StringDialogCallback
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response
import java.util.ArrayList

/**
 * Created by yanfa-005 on 2019/5/31
 */
open class MainPresent :BasePresent<MainView.View>(),MainView.present {
    override var context: Context?=null
    internal var page = 0
    internal var mlist: MutableList<Mainfrabean.DataBean> = ArrayList<Mainfrabean.DataBean>()
    internal var list: MutableList<MainRecycleBean.DataBean.DatasBean> = ArrayList<MainRecycleBean.DataBean.DatasBean>()
    override fun getBannerdata() {
       OkGo.get<String>(Contents.Baner)
               .execute(object :StringDialogCallback(context as Activity){
                   override fun onSuccess(response: Response<String>?) {
                       super.onSuccess(response)
                       val mainfrabean = JsonUtil.fromJson(response?.body(), Mainfrabean::class.java)
                       mlist.addAll(mainfrabean.data)
                       mView?.Bannerdata(mlist)

                   }

                   override fun onFinish() {
                       super.onFinish()
                   }
               })
    }

    override fun getRecycledata() {
       OkGo.get<String>(String.format(Contents.Main_article, page))
               .execute(object :StringDialogCallback(context as Activity){
                   override fun onSuccess(response: Response<String>?) {
                       super.onSuccess(response)
                       val mainRecycleBean=JsonUtil.fromJson(response?.body(),MainRecycleBean::class.java)
                       list.addAll(mainRecycleBean.data.datas)
                       mView?.Recydata(list)
                   }

                   override fun onError(response: Response<String>?) {
                       super.onError(response)
                       ToastUtils.showShort("请求失败")
                   }

                   override fun onFinish() {
                       super.onFinish()
                   }
               })
    }




}