package com.company.project.model;

import javax.persistence.*;

public class Sc {
    @Id
    @Column(name = "SCid")
    private String scid;

    @Column(name = "Sno")
    private String sno;

    @Column(name = "Cno")
    private String cno;

    @Column(name = "Grade")
    private Integer grade;

    /**
     * @return SCid
     */
    public String getScid() {
        return scid;
    }

    /**
     * @param scid
     */
    public void setScid(String scid) {
        this.scid = scid;
    }

    /**
     * @return Sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sno
     */
    public void setSno(String sno) {
        this.sno = sno;
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
     * @return Grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}