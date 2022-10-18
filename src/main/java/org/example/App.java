package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Student student=new Student();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        student.setSid(1);
        student.setSname("Anu");
        student.setScity("Basti");
        student.setSid(2);
        student.setSname("Anushka");
        student.setScity("Lucknow");
        student.setSid(3);
        student.setSname("Shivam");
        student.setScity("Delhi");
 //       student.setSid(4);
//        student.setSname("Anuj");
//        student.setScity("Allahabad");
//        student.setSid(5);
//        student.setSname("Akshita");
//        student.setScity("Noida");
//        for(int i=1;i<5;i++){
//            student.setSid(i);
//            System.out.println("Enter name");

//            System.out.println("Enter city");
//            student.setSname(student.getSname());
//            student.setScity(student.getScity());
//
//        }
        session.save(student);
        System.out.println(student);
        transaction.commit();
        session.close();


    }
}
