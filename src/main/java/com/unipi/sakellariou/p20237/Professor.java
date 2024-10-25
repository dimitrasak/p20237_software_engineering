package com.unipi.sakellariou.p20237;

public class Professor {
    private int prof_id;
    private String department;


    public Professor(int profId, String department) {
        this.prof_id = profId;
        this.department = department;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
