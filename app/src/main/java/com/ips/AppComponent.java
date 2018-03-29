package com.ips;

import com.ips.data.AppData;
import com.ips.utils.TypeFaceProvider;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by brain on 1/8/18.
 */

@Singleton
@Component(modules = {AppModule.class, DataModule.class})
public interface AppComponent {

    TypeFaceProvider getTypefaceProvider();

    void inject(BaseActivity baseActivity);

    void inject(BaseFragment baseFragment);

    AppData provideData();
}
