package com.bartech.sfa.sa.ui.landingPage;

import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.ui.base.BasePresenter;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 3/7/2018.
 */

public class LandingPresenter <V extends LandingMvpView> extends BasePresenter<V> implements LandingMvpPresenter<V> {
    @Inject
    public LandingPresenter(DataManager dataManager, SchedulerProvider schedulerProvider,
                            CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }





}
