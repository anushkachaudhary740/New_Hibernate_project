package com.map1;

import com.map.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Mapping {
    public static void main(String[] arg){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEmpId(11);
        e1.setEmpName("Anushka");
        e2.setEmpId(12);
        e2.setEmpName("Akshita");
        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(1313);
        p1.setPname("Library management system");
        p2.setPid(1314);
        p2.setPname("Operating system");

        List<Employee> list1=new ArrayList<Employee>();
        List<Project> list2=new ArrayList<Project>();
        list1.add(e1);
        list1.add(e2);
        list2.add(p1);
        list2.add(p2);

        e1.setProject(list2);
        p2.setEmployee(list1);

        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
         session.save(e1);
         session.save(e2);
         session.save(p1);
         session.save(p2);
         transaction.commit();
         session.close();
         factory.close();

    }

}
