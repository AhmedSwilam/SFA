package com.bartech.sfa.sa.di.module;

import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpPresenter;
import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpView;
import com.bartech.sfa.sa.ui.ResetPassword.ResetPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideResetPresenterFactory
    implements Factory<ResetMvpPresenter<ResetMvpView>> {
  private final ActivityModule module;

  private final Provider<ResetPresenter<ResetMvpView>> presenterProvider;

  public ActivityModule_ProvideResetPresenterFactory(
      ActivityModule module, Provider<ResetPresenter<ResetMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public ResetMvpPresenter<ResetMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideResetPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResetMvpPresenter<ResetMvpView>> create(
      ActivityModule module, Provider<ResetPresenter<ResetMvpView>> presenterProvider) {
    return new ActivityModule_ProvideResetPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideResetPresenter(ResetPresenter)}. */
  public static ResetMvpPresenter<ResetMvpView> proxyProvideResetPresenter(
      ActivityModule instance, ResetPresenter<ResetMvpView> presenter) {
    return instance.provideResetPresenter(presenter);
  }
}
