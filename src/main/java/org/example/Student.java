package org.example;

import net.sf.ehcache.config.PersistenceConfiguration;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column(length = 100)
    private String sname;
    @Column(length = 100)
    private String scity;
    public Student(Integer sid, String sname, String scity) {
        this.sid = sid;
        this.sname = sname;
        this.scity = scity;
    }

    public Student() {

    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Name: {1}\t City: {2}\n",sid,sname,scity);
    }
}
