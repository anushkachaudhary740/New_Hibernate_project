package com.map;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @Column(name="answer_id")
    private int answerId;
    private String answer;
    @ManyToOne
    private Question question;

    public Answer(int answerId, String answer,Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question=question;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Answer: {1}\t Question: {2}\n",answerId,answer,question);
    }
}
