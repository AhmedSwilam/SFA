package com.bartech.sfa.sa.di.component;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.bartech.sfa.sa.data.DataManager;
import com.bartech.sfa.sa.di.module.ActivityModule;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideAboutPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideActivityFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideBlogAdapterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideFeedPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideLandingPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideLoginPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideMainPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideRegisterPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideResetPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideSplashPresenterFactory;
import com.bartech.sfa.sa.di.module.ActivityModule_ProvideVerificationPresenterFactory;
import com.bartech.sfa.sa.ui.Registration.AttachFileActivity;
import com.bartech.sfa.sa.ui.Registration.RegisterMvpPresenter;
import com.bartech.sfa.sa.ui.Registration.RegisterMvpView;
import com.bartech.sfa.sa.ui.Registration.RegisterPresenter;
import com.bartech.sfa.sa.ui.Registration.RegisterPresenter_Factory;
import com.bartech.sfa.sa.ui.Registration.RegistrationActivity;
import com.bartech.sfa.sa.ui.Registration.RegistrationActivity_MembersInjector;
import com.bartech.sfa.sa.ui.ResetPassword.ResetActivity;
import com.bartech.sfa.sa.ui.ResetPassword.ResetActivity_MembersInjector;
import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpPresenter;
import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpView;
import com.bartech.sfa.sa.ui.ResetPassword.ResetPresenter;
import com.bartech.sfa.sa.ui.ResetPassword.ResetPresenter_Factory;
import com.bartech.sfa.sa.ui.Verification.VerificationActivity;
import com.bartech.sfa.sa.ui.Verification.VerificationActivity_MembersInjector;
import com.bartech.sfa.sa.ui.Verification.VerificationMvpPresenter;
import com.bartech.sfa.sa.ui.Verification.VerificationMvpView;
import com.bartech.sfa.sa.ui.Verification.VerificationPresenter;
import com.bartech.sfa.sa.ui.Verification.VerificationPresenter_Factory;
import com.bartech.sfa.sa.ui.about.AboutFragment;
import com.bartech.sfa.sa.ui.about.AboutFragment_MembersInjector;
import com.bartech.sfa.sa.ui.about.AboutMvpPresenter;
import com.bartech.sfa.sa.ui.about.AboutMvpView;
import com.bartech.sfa.sa.ui.about.AboutPresenter;
import com.bartech.sfa.sa.ui.about.AboutPresenter_Factory;
import com.bartech.sfa.sa.ui.feed.FeedActivity;
import com.bartech.sfa.sa.ui.feed.FeedActivity_MembersInjector;
import com.bartech.sfa.sa.ui.feed.FeedMvpPresenter;
import com.bartech.sfa.sa.ui.feed.FeedMvpView;
import com.bartech.sfa.sa.ui.feed.FeedPagerAdapter;
import com.bartech.sfa.sa.ui.feed.FeedPresenter;
import com.bartech.sfa.sa.ui.feed.FeedPresenter_Factory;
import com.bartech.sfa.sa.ui.feed.blogs.BlogAdapter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogFragment;
import com.bartech.sfa.sa.ui.feed.blogs.BlogFragment_MembersInjector;
import com.bartech.sfa.sa.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogMvpView;
import com.bartech.sfa.sa.ui.feed.blogs.BlogPresenter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogPresenter_Factory;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceFragment;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourcePresenter_Factory;
import com.bartech.sfa.sa.ui.landingPage.LandingActivity;
import com.bartech.sfa.sa.ui.landingPage.LandingActivity_MembersInjector;
import com.bartech.sfa.sa.ui.landingPage.LandingMvpPresenter;
import com.bartech.sfa.sa.ui.landingPage.LandingMvpView;
import com.bartech.sfa.sa.ui.landingPage.LandingPresenter;
import com.bartech.sfa.sa.ui.landingPage.LandingPresenter_Factory;
import com.bartech.sfa.sa.ui.login.LoginActivity;
import com.bartech.sfa.sa.ui.login.LoginActivity_MembersInjector;
import com.bartech.sfa.sa.ui.login.LoginMvpPresenter;
import com.bartech.sfa.sa.ui.login.LoginMvpView;
import com.bartech.sfa.sa.ui.login.LoginPresenter;
import com.bartech.sfa.sa.ui.login.LoginPresenter_Factory;
import com.bartech.sfa.sa.ui.main.MainActivity;
import com.bartech.sfa.sa.ui.main.MainActivity_MembersInjector;
import com.bartech.sfa.sa.ui.main.MainMvpPresenter;
import com.bartech.sfa.sa.ui.main.MainMvpView;
import com.bartech.sfa.sa.ui.main.MainPresenter;
import com.bartech.sfa.sa.ui.main.MainPresenter_Factory;
import com.bartech.sfa.sa.ui.main.rating.RateUsDialog;
import com.bartech.sfa.sa.ui.main.rating.RateUsDialog_MembersInjector;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogMvpView;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogPresenter;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogPresenter_Factory;
import com.bartech.sfa.sa.ui.splash.SplashActivity;
import com.bartech.sfa.sa.ui.splash.SplashActivity_MembersInjector;
import com.bartech.sfa.sa.ui.splash.SplashMvpPresenter;
import com.bartech.sfa.sa.ui.splash.SplashMvpView;
import com.bartech.sfa.sa.ui.splash.SplashPresenter;
import com.bartech.sfa.sa.ui.splash.SplashPresenter_Factory;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<LoginPresenter<LoginMvpView>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView>> provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedPresenter<FeedMvpView>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<RegisterPresenter<RegisterMvpView>> registerPresenterProvider;

  private Provider<RegisterMvpPresenter<RegisterMvpView>> provideRegisterPresenterProvider;

  private MembersInjector<RegistrationActivity> registrationActivityMembersInjector;

  private Provider<AboutPresenter<AboutMvpView>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView>> provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourcePresenter<OpenSourceMvpView>> openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogPresenter<BlogMvpView>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView>> provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogPresenter<RatingDialogMvpView>> ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView>> provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private Provider<LandingPresenter<LandingMvpView>> landingPresenterProvider;

  private Provider<LandingMvpPresenter<LandingMvpView>> provideLandingPresenterProvider;

  private MembersInjector<LandingActivity> landingActivityMembersInjector;

  private Provider<ResetPresenter<ResetMvpView>> resetPresenterProvider;

  private Provider<ResetMvpPresenter<ResetMvpView>> provideResetPresenterProvider;

  private MembersInjector<ResetActivity> resetActivityMembersInjector;

  private Provider<VerificationPresenter<VerificationMvpView>> verificationPresenterProvider;

  private Provider<VerificationMvpPresenter<VerificationMvpView>>
      provideVerificationPresenterProvider;

  private MembersInjector<VerificationActivity> verificationActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.registerPresenterProvider =
        RegisterPresenter_Factory.create(
            MembersInjectors.<RegisterPresenter<RegisterMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRegisterPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideRegisterPresenterFactory.create(
                builder.activityModule, registerPresenterProvider));

    this.registrationActivityMembersInjector =
        RegistrationActivity_MembersInjector.create(provideRegisterPresenterProvider);

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors.<OpenSourcePresenter<OpenSourceMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors.<RatingDialogPresenter<RatingDialogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);

    this.landingPresenterProvider =
        LandingPresenter_Factory.create(
            MembersInjectors.<LandingPresenter<LandingMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLandingPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLandingPresenterFactory.create(
                builder.activityModule, landingPresenterProvider));

    this.landingActivityMembersInjector =
        LandingActivity_MembersInjector.create(provideLandingPresenterProvider);

    this.resetPresenterProvider =
        ResetPresenter_Factory.create(
            MembersInjectors.<ResetPresenter<ResetMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideResetPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideResetPresenterFactory.create(
                builder.activityModule, resetPresenterProvider));

    this.resetActivityMembersInjector =
        ResetActivity_MembersInjector.create(provideResetPresenterProvider);

    this.verificationPresenterProvider =
        VerificationPresenter_Factory.create(
            MembersInjectors.<VerificationPresenter<VerificationMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideVerificationPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideVerificationPresenterFactory.create(
                builder.activityModule, verificationPresenterProvider));

    this.verificationActivityMembersInjector =
        VerificationActivity_MembersInjector.create(provideVerificationPresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(RegistrationActivity activity) {
    registrationActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  @Override
  public void inject(LandingActivity landingActivity) {
    landingActivityMembersInjector.injectMembers(landingActivity);
  }

  @Override
  public void inject(AttachFileActivity attachFileActivity) {
    MembersInjectors.<AttachFileActivity>noOp().injectMembers(attachFileActivity);
  }

  @Override
  public void inject(ResetActivity resetActivity) {
    resetActivityMembersInjector.injectMembers(resetActivity);
  }

  @Override
  public void inject(VerificationActivity verificationActivity) {
    verificationActivityMembersInjector.injectMembers(verificationActivity);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
