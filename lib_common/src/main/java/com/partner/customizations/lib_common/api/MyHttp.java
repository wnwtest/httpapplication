package com.partner.customizations.lib_common.api;

import com.alibaba.fastjson.JSONObject;
import com.partner.customizations.lib_common.base.AppConfig;
import com.partner.customizations.lib_common.base.BaseApplication;
import com.partner.customizations.lib_common.utils.NetWorkUtils;
import com.partner.customizations.lib_common.utils.ToastUitl;
import com.partner.customizations.lib_common.view.dialog.LoadingDialog;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 */

public class MyHttp {

    public static void doPost(Observable<JSONObject> observable, final HttpListener listener) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JSONObject>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        listener.onSubscribe(d);
                    }
                    @Override
                    public void onNext(JSONObject result) {
                        switch (result.getInteger("state")){
                            case 0:
                                //失败
                                ToastUitl.showShort(result.getString("msg"));
                                listener.onError(0);
                                break;
                            case 1:
                                //成功
                                listener.onSuccess(result);
                                break;
                            case 2:
                                //请先登录

                                ToastUitl.showShort("请重新登录");
                                //FIXME: hack to debug
                                //UserUtils.clearRecord();
                                //ARouter.getInstance().build(MyARouter.LoginActivity).withFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK).navigation();
                                break;
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        //请求错误
                        LoadingDialog.cancelDialogForLoading();
                        if (!NetWorkUtils.isNetConnected(BaseApplication.getInstance())) {
                            //网络
                            listener.onError(AppConfig.ERROR_STATE.NO_NETWORK);
                        } else {
                            //服务器
                            listener.onError(AppConfig.ERROR_STATE.SERVICE_ERROR);
                            ToastUitl.showShort("网络错误，请重试！");
                        }
                    }

                    @Override
                    public void onComplete() {
                        LoadingDialog.cancelDialogForLoading();
                        listener.onFinish();
                    }
                });
    }


}
