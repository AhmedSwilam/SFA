package com.bartech.sfa.sa.di.module;

import com.bartech.sfa.sa.ui.Verification.VerificationMvpPresenter;
import com.bartech.sfa.sa.ui.Verification.VerificationMvpView;
import com.bartech.sfa.sa.ui.Verification.VerificationPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideVerificationPresenterFactory
    implements Factory<VerificationMvpPresenter<VerificationMvpView>> {
  private final ActivityModule module;

  private final Provider<VerificationPresenter<VerificationMvpView>> presenterProvider;

  public ActivityModule_ProvideVerificationPresenterFactory(
      ActivityModule module,
      Provider<VerificationPresenter<VerificationMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public VerificationMvpPresenter<VerificationMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideVerificationPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VerificationMvpPresenter<VerificationMvpView>> create(
      ActivityModule module,
      Provider<VerificationPresenter<VerificationMvpView>> presenterProvider) {
    return new ActivityModule_ProvideVerificationPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideVerificationPresenter(VerificationPresenter)}. */
  public static VerificationMvpPresenter<VerificationMvpView> proxyProvideVerificationPresenter(
      ActivityModule instance, VerificationPresenter<VerificationMvpView> presenter) {
    return instance.provideVerificationPresenter(presenter);
  }
}
