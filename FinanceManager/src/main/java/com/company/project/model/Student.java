package com.company.project.model;

import javax.persistence.*;

public class Student {
    @Id
    @Column(name = "Sid")
    private String sid;

    @Column(name = "Sno")
    private String sno;

    @Column(name = "Sname")
    private String sname;

    /**
     * @return Sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(String sid) {
        this.sid = sid;
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
     * @return Sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }
}