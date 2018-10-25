package com.company.project.model;

import javax.persistence.*;

public class Course {
    @Id
    @Column(name = "Cid")
    private String cid;

    @Column(name = "Cno")
    private String cno;

    @Column(name = "Cname")
    private String cname;

    @Column(name = "Teacher")
    private String teacher;

    /**
     * @return Cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return Cno
     */
    public String getCno() {
        return cno;
    }

    /**
     * @param cno
     */
    public void setCno(String cno) {
        this.cno = cno;
    }

    /**
     * @return Cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return Teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @param teacher
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}