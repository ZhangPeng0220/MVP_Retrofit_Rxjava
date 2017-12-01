package com.example.a53478.mvp_retrofit_rxjava.drawerMvp;


import com.example.a53478.mvp_retrofit_rxjava.API.Networks;
import com.example.a53478.mvp_retrofit_rxjava.API.ThemesEntity;

import rx.Observable;

/**
 * Created by Administrator on 2016/12/31.
 */

public class DrawerMainModel implements DrawerMainContract.Model{
    @Override
    public Observable<ThemesEntity> getOtherThemeList() {
        return Networks.getInstance().getThemeApi().getThemes();
    }
}
