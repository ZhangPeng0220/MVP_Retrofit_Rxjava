package com.example.a53478.mvp_retrofit_rxjava.mvp_base;

/**
 * Created by 53478 on 2017/11/27.
 */

public abstract class BasePresenter<M, V>  {
    public M mModel;
    public V mView;
    //public RxManager mRxManager = new RxManager();

    public void attachVM(V v, M m) {
        this.mModel = m;
        this.mView = v;

    }

    public void detachVM() {
        //mRxManager.clear();
        mView = null;
        mModel = null;
    }
}
