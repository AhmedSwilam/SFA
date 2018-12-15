package com.bartech.sfa.sa.ui.Verification;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VerificationActivity_MembersInjector
    implements MembersInjector<VerificationActivity> {
  private final Provider<VerificationMvpPresenter<VerificationMvpView>> mPresenterProvider;

  public VerificationActivity_MembersInjector(
      Provider<VerificationMvpPresenter<VerificationMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<VerificationActivity> create(
      Provider<VerificationMvpPresenter<VerificationMvpView>> mPresenterProvider) {
    return new VerificationActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(VerificationActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      VerificationActivity instance,
      Provider<VerificationMvpPresenter<VerificationMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
