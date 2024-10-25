package com.unipi.sakellariou.p20237;

public class Course {
    private int course_id;
    private String title;
    private int prof_id;


    public Course(int courseId, String title, int prof_id) {
        this.course_id = courseId;
        this.title = title;
        this.prof_id = prof_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }
}

