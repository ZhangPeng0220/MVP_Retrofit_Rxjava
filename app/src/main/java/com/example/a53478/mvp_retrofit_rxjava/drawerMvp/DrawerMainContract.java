package com.example.a53478.mvp_retrofit_rxjava.drawerMvp;



import com.example.a53478.mvp_retrofit_rxjava.API.ThemesEntity;
import com.example.a53478.mvp_retrofit_rxjava.mvp_base.BaseModel;
import com.example.a53478.mvp_retrofit_rxjava.mvp_base.BasePresenter;
import com.example.a53478.mvp_retrofit_rxjava.mvp_base.BaseView;

import rx.Observable;

/**
 * Created by Administrator on 2016/12/31.
 */

public interface DrawerMainContract {

    interface Model extends BaseModel {
        Observable<ThemesEntity> getOtherThemeList();
    }

    interface View extends BaseView {
        void loadOtherThemeList(ThemesEntity themesEntity);
    }

    abstract class Presenter extends BasePresenter<Model,View> {
        abstract void getOtherThemes();
    }
}
