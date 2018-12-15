package com.bartech.sfa.sa.ui.ResetPassword;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResetActivity_MembersInjector implements MembersInjector<ResetActivity> {
  private final Provider<ResetMvpPresenter<ResetMvpView>> mPresenterProvider;

  public ResetActivity_MembersInjector(
      Provider<ResetMvpPresenter<ResetMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ResetActivity> create(
      Provider<ResetMvpPresenter<ResetMvpView>> mPresenterProvider) {
    return new ResetActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ResetActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      ResetActivity instance, Provider<ResetMvpPresenter<ResetMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
