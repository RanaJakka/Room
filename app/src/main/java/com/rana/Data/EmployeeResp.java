package com.rana.Data;

import com.rana.Dao.EmployeeDao;
import com.rana.model.Employee;

import java.util.List;

/**
 * Created by Rana Prathap on 11/5/2017.
 */

public class EmployeeResp {

    public final EmployeeDao empdao;


    public EmployeeResp(EmployeeDao empdao) {
        this.empdao = empdao;
    }


    public long[] InserEmployee(Employee e)
    {
        return empdao.Insert(e);
    }

    public void DeleteEmployee(Employee e)
    {
        empdao.Delete(e);
    }

    public List<Employee>  GetAllEmployee()
    {
        return empdao.getALlEmployee();
    }

    public Employee GetEmployeeByID(String sid)
    {
        return  empdao.getEmployeeById(sid);
    }


}
