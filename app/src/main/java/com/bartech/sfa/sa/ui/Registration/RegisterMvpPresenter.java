package com.bartech.sfa.sa.ui.Registration;

import com.bartech.sfa.sa.di.PerActivity;
import com.bartech.sfa.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 2/21/2018.
 */
@PerActivity
public interface RegisterMvpPresenter<V extends RegisterMvpView> extends MvpPresenter<V> {

    void onSubmitButtonClicked(String firtname,String lastname,String mobile,String email,
                         String password,String location,String file);

    void onPickLocationClicked(String MyLocationٍ);
    void onLegalDocumentClicked(String MyFile);
}

