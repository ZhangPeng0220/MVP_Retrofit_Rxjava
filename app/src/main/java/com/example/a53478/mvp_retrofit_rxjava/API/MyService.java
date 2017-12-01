package com.example.a53478.mvp_retrofit_rxjava.API;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by 上官若枫 on 2017/10/11.
 */

public interface MyService {
    @GET("api/4/themes" )
    Observable<ThemesEntity> getThemes();


}
