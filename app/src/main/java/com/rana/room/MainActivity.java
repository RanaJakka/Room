package com.rana.room;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rana.Dao.AppDateBase;
import com.rana.Data.EmployeeResp;
import com.rana.model.Employee;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    AppDateBase appDateBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((RoomApplication)getApplication()).getComponent().inject(this);

        List<Employee> list=appDateBase.empdao().getALlEmployee();

        for(Employee ep:list)
        {
            Log.v("EMployee","Employee Is"+ep.getEphone()+"\t"+ep.getEnmae()+"\t"+ep.getEemail());
        }






    }
}
