package com.customizations.lib_http.net;

/**
 * Created by wnw on 2021/4/25.
 * Describe:请求的成功与失败的方法
 */
public interface RequestCallBack {
    void onSuccess(String result);
    void onFailUre(String msg);
}
