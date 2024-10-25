package com.unipi.sakellariou.p20237;

public class Student {
    private int student_id;
    private int am;


    public Student(int studentId, int am) {
        student_id = studentId;
        this.am = am;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }
}
