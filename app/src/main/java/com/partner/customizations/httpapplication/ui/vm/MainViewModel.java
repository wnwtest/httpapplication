package com.partner.customizations.httpapplication.ui.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.partner.customizations.lib_common.base.BaseViewModel;
import com.partner.customizations.lib_common.bean.CommissionCountBean;


public class MainViewModel extends BaseViewModel {
    private MutableLiveData<CommissionCountBean> commissionCountLiveData;
    public LiveData<CommissionCountBean> getCountBeanLiveData() {
        if (commissionCountLiveData ==null){
            commissionCountLiveData =  new MutableLiveData<>();
        }
        return commissionCountLiveData;
    }
    /**
    //统计
    public void requesBacklogCount(){
        MyHttp.doPost(Api.getDefault().getBacklogCount(UserUtils.getToken()), new HttpViewModelListener() {
            @Override
            public void onSuccess(JSONObject result) {
                CommissionCountBean firstAssessCountBean = new Gson().fromJson(result.toString(),CommissionCountBean.class);
                commissionCountLiveData.setValue(firstAssessCountBean);
            }

            @Override
            public void onError(int code) {

            }
        });
     **/


}
