package com.bartech.sfa.sa.ui.Registration;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterationActivity_MembersInjector
    implements MembersInjector<RegistrationActivity> {
  private final Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider;

  public RegisterationActivity_MembersInjector(
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegistrationActivity> create(
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    return new RegisterationActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegistrationActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RegistrationActivity instance,
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
