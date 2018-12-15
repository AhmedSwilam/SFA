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

package com.bartech.sfa.sa.di.component;

import com.bartech.sfa.sa.di.PerActivity;
import com.bartech.sfa.sa.di.module.ActivityModule;
import com.bartech.sfa.sa.ui.ResetPassword.ResetActivity;
import com.bartech.sfa.sa.ui.Verification.VerificationActivity;
import com.bartech.sfa.sa.ui.landingPage.LandingActivity;
import com.bartech.sfa.sa.ui.Registration.AttachFileActivity;
import com.bartech.sfa.sa.ui.Registration.RegistrationActivity;
import com.bartech.sfa.sa.ui.about.AboutFragment;
import com.bartech.sfa.sa.ui.feed.FeedActivity;
import com.bartech.sfa.sa.ui.feed.blogs.BlogFragment;
import com.bartech.sfa.sa.ui.feed.opensource.OpenSourceFragment;
import com.bartech.sfa.sa.ui.login.LoginActivity;
import com.bartech.sfa.sa.ui.main.MainActivity;
import com.bartech.sfa.sa.ui.main.rating.RateUsDialog;
import com.bartech.sfa.sa.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(RegistrationActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

    void inject(LandingActivity landingActivity);

    void inject(AttachFileActivity attachFileActivity);

    void inject(ResetActivity resetActivity);

    void inject(VerificationActivity verificationActivity);
}
