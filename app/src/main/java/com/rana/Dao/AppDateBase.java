package com.rana.Dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.rana.model.Employee;
import com.rana.room.MainActivity;

import javax.inject.Inject;

/**
 * Created by Rana Prathap on 11/5/2017.
 */

@Database(entities = {Employee.class},version = 1)
public abstract class AppDateBase extends RoomDatabase {


    public abstract EmployeeDao empdao();


}
