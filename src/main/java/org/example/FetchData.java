package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Student student = (Student) session.get(Student.class, 4);
        System.out.println(student.getSid()+" : "+student.getSname()+" : "+student.getScity());
        session.close();
        factory.close();
    }
}
