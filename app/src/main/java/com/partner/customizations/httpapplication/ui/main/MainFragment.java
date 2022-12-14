package com.partner.customizations.httpapplication.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.customizations.lib_http.contract.BaseContract;
import com.customizations.lib_http.presenter.BasePresenter;
import com.partner.customizations.httpapplication.R;
import com.partner.customizations.httpapplication.ui.vm.MainFragmentViewModel;

public class MainFragment extends Fragment implements BaseContract.IBaseView {

    private MainFragmentViewModel mViewModel;
    protected BasePresenter p ;
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainFragmentViewModel.class);
        p = new BasePresenter(this);

        // TODO: Use the ViewModel
    }

    @Override
    public void onFailUre(String msg) {

    }

    @Override
    public void onSuccessGet(String result) {

    }

    @Override
    public void onSuccessTwoGet(String result) {

    }

    @Override
    public void onSuccessThreeGet(String result) {

    }

    @Override
    public void onSuccessPost(String result) {

    }

    @Override
    public void onSuccessTwoPost(String result) {

    }

    @Override
    public void onSuccessPostPic(String result) {

    }
}