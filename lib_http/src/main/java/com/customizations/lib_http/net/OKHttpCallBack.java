package com.customizations.lib_http.net;

/**
 * Created by wnw on 2021/4/25.
 * Describe:http网络请求框架判断成功与失败的方法
 */
public interface OKHttpCallBack {
    void onSuccess(String result);
    void onFailUre(String msg);
}
