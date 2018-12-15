package com.bartech.sfa.sa.ui.Verification;

import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.ui.base.BasePresenter;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 3/8/2018.
 */

public class VerificationPresenter <V extends VerificationMvpView> extends BasePresenter<V> implements VerificationMvpPresenter<V> {
    @Inject
    public VerificationPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
