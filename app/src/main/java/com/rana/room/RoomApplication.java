package com.rana.room;

import android.app.Application;
import android.content.Context;

import com.rana.Component.ApplicationComponent;
import com.rana.Component.DaggerApplicationComponent;
import com.rana.Module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Rana Prathap on 11/6/2017.
 */

public class RoomApplication extends Application {

    protected ApplicationComponent applicationComponent;

    public static RoomApplication get(Context context) {
        return (RoomApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
