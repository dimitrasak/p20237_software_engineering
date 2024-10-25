package com.unipi.sakellariou.p20237;

public class Grade {
    private int grade_id;
    private int student_id;
    private int course_id;
    private int grade;


    public Grade(int gradeId, int studentId, int courseId, int grade) {
        this.grade_id = gradeId;
        this.student_id = studentId;
        this.course_id = courseId;
        this.grade = grade;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}