package com.bartech.sfa.sa.ui.ResetPassword;

import android.os.Bundle;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Ahmed on 3/7/2018.
 */

public class ResetActivity extends BaseActivity implements ResetMvpView {

    @Inject
    ResetMvpPresenter<ResetMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(ResetActivity.this);
    }


    @Override
    protected void setUp() {

    }


}
