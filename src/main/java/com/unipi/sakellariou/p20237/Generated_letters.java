package com.unipi.sakellariou.p20237;

public class Generated_letters {
    private int letter_id;
    private int student_id;
    private int template_id;
    private int prof_id;
    private String generated_date;

    public Generated_letters(int letterId, int studentId, int templateId, int profId, String generatedDate) {
        this.letter_id = letterId;
        this.student_id = studentId;
        this.template_id = templateId;
        this.prof_id = profId;
        this.generated_date = generatedDate;
    }

    public int getLetter_id() {
        return letter_id;
    }

    public void setLetter_id(int letter_id) {
        this.letter_id = letter_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(int template_id) {
        this.template_id = template_id;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getGenerated_date() {
        return generated_date;
    }

    public void setGenerated_date(String generated_date) {
        this.generated_date = generated_date;
    }
}

