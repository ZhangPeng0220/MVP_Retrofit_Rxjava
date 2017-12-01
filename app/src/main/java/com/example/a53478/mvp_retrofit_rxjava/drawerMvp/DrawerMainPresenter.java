package com.example.a53478.mvp_retrofit_rxjava.drawerMvp;



import com.example.a53478.mvp_retrofit_rxjava.API.ThemesEntity;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/12/31.
 */

public class DrawerMainPresenter extends DrawerMainContract.Presenter{

    @Override
     public void getOtherThemes() {
        mModel.getOtherThemeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ThemesEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                       // mView.onRequestError("数据加载失败ヽ(≧Д≦)ノ");
                    }

                    @Override
                    public void onNext(ThemesEntity themesEntity) {
                        mView.loadOtherThemeList(themesEntity);
                    }
                });
    }
}
