/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.bartech.sfa.sa.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.bartech.sfa.sa.data.network.model.BlogResponse;
import com.bartech.sfa.sa.data.network.model.OpenSourceResponse;
import com.bartech.sfa.sa.di.ActivityContext;
import com.bartech.sfa.sa.di.PerActivity;
import com.bartech.sfa.sa.ui.Registration.RegisterMvpPresenter;
import com.bartech.sfa.sa.ui.Registration.RegisterMvpView;
import com.bartech.sfa.sa.ui.Registration.RegisterPresenter;
import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpPresenter;
import com.bartech.sfa.sa.ui.ResetPassword.ResetMvpView;
import com.bartech.sfa.sa.ui.ResetPassword.ResetPresenter;
import com.bartech.sfa.sa.ui.Verification.VerificationMvpPresenter;
import com.bartech.sfa.sa.ui.Verification.VerificationMvpView;
import com.bartech.sfa.sa.ui.Verification.VerificationPresenter;
import com.bartech.sfa.sa.ui.about.AboutMvpPresenter;
import com.bartech.sfa.sa.ui.about.AboutMvpView;
import com.bartech.sfa.sa.ui.about.AboutPresenter;
import com.bartech.sfa.sa.ui.feed.FeedMvpPresenter;
import com.bartech.sfa.sa.ui.feed.FeedMvpView;
import com.bartech.sfa.sa.ui.feed.FeedPagerAdapter;
import com.bartech.sfa.sa.ui.feed.FeedPresenter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogAdapter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.sfa.sa.ui.feed.blogs.BlogMvpView;
import com.bartech.sfa.sa.ui.feed.blogs.BlogPresenter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.sfa.sa.ui.landingPage.LandingMvpPresenter;
import com.bartech.sfa.sa.ui.landingPage.LandingMvpView;
import com.bartech.sfa.sa.ui.landingPage.LandingPresenter;
import com.bartech.sfa.sa.ui.login.LoginMvpPresenter;
import com.bartech.sfa.sa.ui.login.LoginMvpView;
import com.bartech.sfa.sa.ui.login.LoginPresenter;
import com.bartech.sfa.sa.ui.main.MainMvpPresenter;
import com.bartech.sfa.sa.ui.main.MainMvpView;
import com.bartech.sfa.sa.ui.main.MainPresenter;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogMvpView;
import com.bartech.sfa.sa.ui.main.rating.RatingDialogPresenter;
import com.bartech.sfa.sa.ui.splash.SplashMvpPresenter;
import com.bartech.sfa.sa.ui.splash.SplashMvpView;
import com.bartech.sfa.sa.ui.splash.SplashPresenter;
import com.bartech.sfa.sa.utils.rx.AppSchedulerProvider;
import com.bartech.sfa.sa.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RegisterMvpPresenter<RegisterMvpView> provideRegisterPresenter(
            RegisterPresenter<RegisterMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LandingMvpPresenter<LandingMvpView> provideLandingPresenter(
            LandingPresenter<LandingMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    @PerActivity
    ResetMvpPresenter<ResetMvpView> provideResetPresenter(
            ResetPresenter<ResetMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    VerificationMvpPresenter<VerificationMvpView> provideVerificationPresenter(
            VerificationPresenter<VerificationMvpView> presenter) {
        return presenter;
    }

}
