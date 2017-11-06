package com.rana.room;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rana.Dao.AppDateBase;
import com.rana.Data.EmployeeResp;
import com.rana.model.Employee;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AppDateBase INSTANCE = Room.databaseBuilder(MainActivity.this, AppDateBase.class, "user-database")
                        // allow queries on the main thread.
                        // Don't do this on a real app! See PersistenceBasicSample for an example.
                        .allowMainThreadQueries()
                        .build();

        EmployeeResp emp_resp=new EmployeeResp(INSTANCE.empdao());
        Employee ep=new Employee();
        ep.setEnmae("Rana prathap Jakka");
        ep.setEemail("rana@thd.com");
        ep.setEphone("913-626-2782");


        emp_resp.InserEmployee(ep);

        for(Employee es:emp_resp.GetAllEmployee())
        {
            Log.v("Employer info","Employee Info Is\n"+es.getEemail()+"\t"+es.getEnmae()+"\t"+es.getEphone());
        }


    }
}
