package com.map1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int empId;
    private String empName;
    @ManyToMany
    private List<Project> project;

    public Employee(int empId, String empName, List<Project> project) {
        this.empId = empId;
        this.empName = empName;
        this.project = project;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Name: {1}\t Project: {2}\n",empId,empName,project);
    }
}
