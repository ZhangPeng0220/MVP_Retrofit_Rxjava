package com.example.a53478.mvp_retrofit_rxjava.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by yiyi on 2016/12/26.
 */

public class BaseActivity extends AppCompatActivity implements BaseFuncIml, View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        initData();
        initView();
        initListener();
        initLoad();
    }


    @Override
    public void initData() { }

    @Override
    public void initView() { }

    @Override
    public void initListener() { }

    @Override
    public void initLoad() { }

    @Override
    public void onClick(View view) {

    }

}
