// Generated code from Butter Knife. Do not modify!
package com.bartech.sfa.sa.ui.Registration;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.sfa.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegistrationActivity_ViewBinding implements Unbinder {
  private RegistrationActivity target;

  private View view2131296574;

  private View view2131296568;

  private View view2131296325;

  @UiThread
  public RegistrationActivity_ViewBinding(RegistrationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegistrationActivity_ViewBinding(final RegistrationActivity target, View source) {
    this.target = target;

    View view;
    target.etFirstName = Utils.findRequiredViewAsType(source, R.id.reg_firstname, "field 'etFirstName'", EditText.class);
    target.etLastName = Utils.findRequiredViewAsType(source, R.id.reg_lastname, "field 'etLastName'", EditText.class);
    target.etMobile = Utils.findRequiredViewAsType(source, R.id.reg_mobile, "field 'etMobile'", EditText.class);
    target.etEmail = Utils.findRequiredViewAsType(source, R.id.reg_email, "field 'etEmail'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.reg_password, "field 'etPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.reg_pick_location, "field 'txtLocation' and method 'onPickClicked'");
    target.txtLocation = Utils.castView(view, R.id.reg_pick_location, "field 'txtLocation'", TextView.class);
    view2131296574 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPickClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.reg_attach_file, "field 'txtAttachFile' and method 'onLegalAttachClicked'");
    target.txtAttachFile = Utils.castView(view, R.id.reg_attach_file, "field 'txtAttachFile'", TextView.class);
    view2131296568 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLegalAttachClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_reg_submit, "method 'onSubmitClicked'");
    view2131296325 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmitClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RegistrationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etFirstName = null;
    target.etLastName = null;
    target.etMobile = null;
    target.etEmail = null;
    target.etPassword = null;
    target.txtLocation = null;
    target.txtAttachFile = null;

    view2131296574.setOnClickListener(null);
    view2131296574 = null;
    view2131296568.setOnClickListener(null);
    view2131296568 = null;
    view2131296325.setOnClickListener(null);
    view2131296325 = null;
  }
}
