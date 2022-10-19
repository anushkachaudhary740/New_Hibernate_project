package com.map1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private int pid;
    private String pname;
    @ManyToMany
    private List<Employee> employee;

    public Project(int pid, String pname, List<Employee> employee) {
        this.pid = pid;
        this.pname = pname;
        this.employee = employee;
    }

    public Project() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t ProjectName: {1}\t Employee: {2}\n",pid,pname,employee);
    }
}
