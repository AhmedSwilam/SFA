package com.bartech.sfa.sa.ui.Verification;

import android.os.Bundle;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Ahmed on 2/26/2018.
 */

public class VerificationActivity extends BaseActivity implements VerificationMvpView {

    @Inject
    VerificationMvpPresenter<VerificationMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(VerificationActivity.this);
    }
    @Override
    protected void setUp() {

    }
}
