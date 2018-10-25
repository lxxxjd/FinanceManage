package com.company.project.model;

import javax.persistence.Column;

public class StudentCourseSC  {


    //查询课程表的字段
    @Column(name = "Cno")
    private String cno;

    @Column(name = "Cname")
    private String cname;

    @Column(name = "Teacher")
    private String teacher;



    //查询学生的字段
    @Column(name = "Sno")
    private String sno;

    @Column(name = "Sname")
    private String sname;


    //查询成绩的字段
    @Column(name = "Grade")
    private Integer grade;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
