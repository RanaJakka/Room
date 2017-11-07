package com.rana.Module;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.rana.Dao.AppDateBase;
import com.rana.room.RoomApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rana Prathap on 11/6/2017.
 */


@Module
public class ApplicationModule {

    private final Application appcontext;

    public ApplicationModule(Application appcontext) {
        this.appcontext = appcontext;
    }

    @Provides
    @Singleton
    public Application providesAppContext()
    {
        return appcontext;
    }


    @Provides
    @Singleton
   public  AppDateBase providesAppDateBase()
    {

        return Room.databaseBuilder( appcontext, AppDateBase.class, "user-database")
                // allow queries on the main thread.
                // Don't do this on a real app! See PersistenceBasicSample for an example.
                .allowMainThreadQueries()
                .build();

    }
}
