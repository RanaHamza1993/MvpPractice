package com.example.ranahamza.mvppractice.presenter;

import android.view.View;

import com.example.ranahamza.mvppractice.contract.MainActivityContract;
import com.example.ranahamza.mvppractice.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityModel mModel;

  public  MainActivityPresenter(MainActivityContract.View view)
    {

        mView=view;
        initPresenter();
    }

    private void initPresenter() {
      mModel=new MainActivityModel();
      mView.initView();
    }

    @Override
    public void onClick(View view) {
      String data=mModel.getViewData();
      mView.setViewData(data);
    }
}
