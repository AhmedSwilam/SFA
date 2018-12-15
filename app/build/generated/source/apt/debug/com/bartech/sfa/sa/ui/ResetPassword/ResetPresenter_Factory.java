package com.bartech.sfa.sa.ui.ResetPassword;

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
public final class ResetPresenter_Factory<V extends ResetMvpView>
    implements Factory<ResetPresenter<V>> {
  private final MembersInjector<ResetPresenter<V>> resetPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public ResetPresenter_Factory(
      MembersInjector<ResetPresenter<V>> resetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert resetPresenterMembersInjector != null;
    this.resetPresenterMembersInjector = resetPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public ResetPresenter<V> get() {
    return MembersInjectors.injectMembers(
        resetPresenterMembersInjector,
        new ResetPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends ResetMvpView> Factory<ResetPresenter<V>> create(
      MembersInjector<ResetPresenter<V>> resetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new ResetPresenter_Factory<V>(
        resetPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
