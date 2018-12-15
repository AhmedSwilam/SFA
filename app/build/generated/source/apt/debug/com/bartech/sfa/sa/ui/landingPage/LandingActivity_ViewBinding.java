// Generated code from Butter Knife. Do not modify!
package com.bartech.sfa.sa.ui.landingPage;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.sfa.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LandingActivity_ViewBinding implements Unbinder {
  private LandingActivity target;

  private View view2131296318;

  private View view2131296320;

  private View view2131296435;

  @UiThread
  public LandingActivity_ViewBinding(LandingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LandingActivity_ViewBinding(final LandingActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_create_account, "method 'onCreateAccountClicked'");
    view2131296318 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCreateAccountClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_login_first, "method 'onLoginClicked'");
    view2131296320 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLoginClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.forgot_password, "method 'onForgotPasswordClicked'");
    view2131296435 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onForgotPasswordClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296318.setOnClickListener(null);
    view2131296318 = null;
    view2131296320.setOnClickListener(null);
    view2131296320 = null;
    view2131296435.setOnClickListener(null);
    view2131296435 = null;
  }
}
