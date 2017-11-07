package com.rana.Component;

import android.content.Context;
import com.rana.Module.ApplicationModule;
import com.rana.room.MainActivity;
import com.rana.room.RoomApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rana Prathap on 11/6/2017.
 */

@Singleton
@Component(modules= {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(RoomApplication roomApplication);
    void inject(MainActivity act);

}
