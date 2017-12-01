package com.example.a53478.mvp_retrofit_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.a53478.mvp_retrofit_rxjava.API.ThemesEntity;
import com.example.a53478.mvp_retrofit_rxjava.drawerMvp.DrawerMainContract;
import com.example.a53478.mvp_retrofit_rxjava.drawerMvp.DrawerMainModel;
import com.example.a53478.mvp_retrofit_rxjava.drawerMvp.DrawerMainPresenter;
import com.example.a53478.mvp_retrofit_rxjava.mvp_base.BaseFrameActivity;
import com.example.a53478.mvp_retrofit_rxjava.mvp_base.BaseView;

public class MainActivity extends BaseFrameActivity<DrawerMainPresenter,DrawerMainModel> implements BaseView, DrawerMainContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.getOtherThemes();
    }

    @Override
    public void loadOtherThemeList(ThemesEntity themesEntity) {
        //处理返回结果
        themesEntity.getLimit();
    }
}
