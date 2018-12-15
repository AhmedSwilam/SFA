package com.bartech.sfa.sa.ui.landingPage;

import android.content.Intent;
import android.os.Bundle;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.ui.Registration.RegistrationActivity;
import com.bartech.sfa.sa.ui.ResetPassword.ResetActivity;
import com.bartech.sfa.sa.ui.base.BaseActivity;
import com.bartech.sfa.sa.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 3/7/2018.
 */

public class LandingActivity extends BaseActivity implements LandingMvpView {
    @Inject
    LandingMvpPresenter<LandingMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(LandingActivity.this);
    }

    @OnClick(R.id.btn_create_account)
    public void onCreateAccountClicked() {
        startActivity(new Intent(LandingActivity.this, RegistrationActivity.class));

    }

    @OnClick(R.id.btn_login_first)
    public void onLoginClicked() {
        startActivity(new Intent(LandingActivity.this, LoginActivity.class));
    }

    @OnClick(R.id.forgot_password)
    public void onForgotPasswordClicked() {
        startActivity(new Intent(LandingActivity.this, ResetActivity.class));

    }


    @Override
    protected void setUp() {

    }


}

