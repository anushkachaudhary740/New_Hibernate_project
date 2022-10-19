package com.map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] arg){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //Creating question
        Question q1=new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is java ? ");

        //Creating answer
        Answer answer=new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is a Plateforn indepedent language.");
        answer.setQuestion(q1);
        //Creating answer
        Answer answer1=new Answer();
        answer1.setAnswerId(345);
        answer1.setAnswer("Some API to work with objects in java.");
        answer1.setQuestion(q1);

        List<Answer> list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        q1.setAnswer(list);

        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(q1);
        session.save(answer);
        session.save(answer1);
        transaction.commit();
        //fetching
//        Question que=(Question)session.get(Question.class,1212);
//        System.out.println(que.getQuestion());
//        System.out.println(que.getAnswer().getAnswer());
        session.close();
        factory.close();
    }
}
