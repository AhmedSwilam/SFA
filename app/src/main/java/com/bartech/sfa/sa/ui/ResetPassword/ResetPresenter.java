package com.bartech.sfa.sa.ui.ResetPassword;

import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.ui.base.BasePresenter;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 3/7/2018.
 */

public class ResetPresenter <V extends ResetMvpView> extends BasePresenter<V> implements ResetMvpPresenter<V> {
    @Inject
    public ResetPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
