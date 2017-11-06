package com.rana.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.rana.model.Employee;

import java.util.List;

/**
 * Created by Rana Prathap on 11/5/2017.
 */

@Dao
public interface EmployeeDao {

    @Query("SELECT * FROM Employee")
    List<Employee> getALlEmployee();

    @Query("SELECT * FROM Employee WHERE Eid=:eid")
    Employee getEmployeeById(String eid);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] Insert(Employee... en);

    @Delete
    void Delete(Employee dep);

}
