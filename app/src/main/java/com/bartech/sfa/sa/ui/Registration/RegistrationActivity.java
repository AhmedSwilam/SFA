package com.bartech.sfa.sa.ui.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.bartech.sfa.sa.R;
import com.bartech.sfa.sa.ui.Verification.VerificationActivity;
import com.bartech.sfa.sa.ui.base.BaseActivity;
import com.nbsp.materialfilepicker.MaterialFilePicker;

import java.util.regex.Pattern;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 2/21/2018.
 */

public class RegistrationActivity extends BaseActivity implements RegisterMvpView {
    @Inject
    RegisterMvpPresenter<RegisterMvpView> mPresenter;
    @BindView(R.id.reg_firstname)
    EditText etFirstName;
    @BindView(R.id.reg_lastname)
    EditText etLastName;
    @BindView(R.id.reg_mobile)
    EditText etMobile;
    @BindView(R.id.reg_email)
    EditText etEmail;
    @BindView(R.id.reg_password)
    EditText etPassword;
    @BindView(R.id.reg_pick_location)
    TextView txtLocation;
    @BindView(R.id.reg_attach_file)
    TextView txtAttachFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(RegistrationActivity.this);
    }

    @OnClick(R.id.btn_reg_submit)
    public void onSubmitClicked() {
        mPresenter.onSubmitButtonClicked(etFirstName.getText().toString().trim(), etLastName.getText().toString().trim(),
                etMobile.getText().toString(), etEmail.getText().toString().trim(), etPassword.getText().toString(),
                txtLocation.getText().toString().trim(), txtAttachFile.getText().toString());

    }
    @OnClick(R.id.reg_pick_location)
    public void onPickClicked(){
        mPresenter.onPickLocationClicked(txtLocation.getText().toString());
    }
    @OnClick(R.id.reg_attach_file)
    public void onLegalAttachClicked(){
        mPresenter.onLegalDocumentClicked(txtAttachFile.getText().toString());
    }



    @Override
    protected void setUp() {

    }


    @Override
    public void goToVerificationCode() {
        startActivity(new Intent(RegistrationActivity.this, VerificationActivity.class));
    }

    @Override
    public void openGoogleMaps() {
        startActivity(new Intent(RegistrationActivity.this,GoogleMapsActivity.class));

    }

    @Override
    public void openAttachFile() {
        new MaterialFilePicker()
                .withActivity(this)
                .withRequestCode(1)
                .withFilter(Pattern.compile(".*\\.$")) // Filtering files and directories by file name using regexp
                .withFilterDirectories(true) // Set directories filterable (false by default)
                .withHiddenFiles(true) // Show hidden files and folders
                .start();
    }


}
