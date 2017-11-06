package com.rana.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Rana Prathap on 11/5/2017.
 */

@Entity
public class Employee {


    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    @PrimaryKey(autoGenerate = true)
    private int Eid;
    private String Enmae;
    private String Eemail;
    private String Ephone;

    public String getEnmae() {
        return Enmae;
    }

    public void setEnmae(String enmae) {
        Enmae = enmae;
    }

    public String getEemail() {
        return Eemail;
    }

    public void setEemail(String eemail) {
        Eemail = eemail;
    }

    public String getEphone() {
        return Ephone;
    }

    public void setEphone(String ephone) {
        Ephone = ephone;
    }

}
