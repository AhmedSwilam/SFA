package com.bartech.sfa.sa.ui.Registration;

import android.os.Bundle;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.ui.base.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by Ahmed on 3/6/2018.
 */

public class AttachFileActivity extends BaseActivity {

    public static final int PERMISSIONS_REQUEST_CODE = 0;
    public static final int FILE_PICKER_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attach_file);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

    }

    @Override
    protected void setUp() {

    }


}
