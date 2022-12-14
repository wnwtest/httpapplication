package com.partner.customizations.httpapplication.ui.main;

import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.partner.customizations.httpapplication.R;
import com.partner.customizations.lib_common.base.BaseActivity;
import com.partner.customizations.lib_common.base.DataBindingConfig;
import com.partner.customizations.lib_common.base.MyARouter;
import com.partner.customizations.httpapplication.ui.vm.MainViewModel;

@Route(path = MyARouter.MainActivity)
public class MainActivity extends BaseActivity<MainViewModel> {

    @Autowired(name = MyARouter.HomeFragment)
    public Fragment mHomeFragment;
    @Autowired(name = MyARouter.CommissionFragment)
    public Fragment commissionFragment;
    @Autowired(name = MyARouter.MeFragment)
    public Fragment mMeFragment;
    public Fragment mCurrFragment;

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return null;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initViewObservable() {

    }

    @Override
    protected void onLoadData() {

    }

    //private ActivityMainBinding activityMainBinding;

    protected void init_ui() {

        mHomeFragment = (Fragment) ARouter.getInstance().build(MyARouter.HomeFragment).navigation();
        commissionFragment = (Fragment) ARouter.getInstance().build(MyARouter.CommissionFragment).navigation();
        mMeFragment = (Fragment) ARouter.getInstance().build(MyARouter.MeFragment).navigation();

    }
}