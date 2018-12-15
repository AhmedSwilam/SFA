package com.bartech.sfa.sa.ui.Verification;

import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VerificationPresenter_Factory<V extends VerificationMvpView>
    implements Factory<VerificationPresenter<V>> {
  private final MembersInjector<VerificationPresenter<V>> verificationPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public VerificationPresenter_Factory(
      MembersInjector<VerificationPresenter<V>> verificationPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert verificationPresenterMembersInjector != null;
    this.verificationPresenterMembersInjector = verificationPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public VerificationPresenter<V> get() {
    return MembersInjectors.injectMembers(
        verificationPresenterMembersInjector,
        new VerificationPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends VerificationMvpView> Factory<VerificationPresenter<V>> create(
      MembersInjector<VerificationPresenter<V>> verificationPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new VerificationPresenter_Factory<V>(
        verificationPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
