package com.map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
        q1.setAnswer(answer);

        //Creating question
        Question q2=new Question();
        q2.setQuestionId(242);
        q2.setQuestion("What is collection framework ? ");

        //Creating answer
        Answer answer1=new Answer();
        answer1.setAnswerId(345);
        answer1.setAnswer("API to work with objects in java.");
        answer1.setQuestion(q2);
        q2.setAnswer(answer1);

        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(q1);
        session.save(q2);
        session.save(answer);
        session.save(answer1);
        transaction.commit();
        //fetching
        Question que=(Question)session.get(Question.class,1212);
        System.out.println(que.getQuestion());
        System.out.println(que.getAnswer().getAnswer());
        session.close();
        factory.close();
    }
}
