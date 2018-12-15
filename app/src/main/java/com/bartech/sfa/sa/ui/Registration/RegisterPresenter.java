package com.bartech.sfa.sa.ui.Registration;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.ui.base.BasePresenter;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 2/21/2018.
 */

public class RegisterPresenter<V extends RegisterMvpView> extends BasePresenter<V> implements RegisterMvpPresenter<V> {


    @Inject
    public RegisterPresenter(DataManager dataManager, SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void onSubmitButtonClicked(String firtname, String lastname, String mobile, String email,
                                      String password, String location, String file) {
        if (getMvpView() != null) {

            if (firtname == null || firtname.isEmpty()) {
                getMvpView().onError(R.string.empty_first_name);
                return;
            }
            if (lastname == null || lastname.isEmpty()) {
                getMvpView().onError(R.string.empty_last_name);
                return;
            }
            if (mobile == null || mobile.isEmpty()) {
                getMvpView().onError(R.string.empty_mobile_number);
                return;
            }
            if (email == null || email.isEmpty()) {
                getMvpView().onError(R.string.empty_email);
                return;
            }
//            if (!CommonUtils.isEmailValid(email)) {
//                getMvpView().onError(R.string.empty_reg_invalid_email);
//                return;
//            }
            if (password == null || password.isEmpty()) {
                getMvpView().onError(R.string.empty_password);
                return;
            }
            if (location == null || location.isEmpty()) {
                getMvpView().onError(R.string.empty_location);
                return;
            }
            if (file == null || file.isEmpty()) {
                getMvpView().onError(R.string.empty_files);
                return;
            }
            getMvpView().goToVerificationCode();

        }


    }

    @Override
    public void onPickLocationClicked(String MyLocationٍ) {
        getMvpView().openGoogleMaps();
    }

    @Override
    public void onLegalDocumentClicked(String MyFile) {
        getMvpView().openAttachFile();
    }
}




