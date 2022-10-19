package com.map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @Column(name="question_id")
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "question")
    private List<Answer> answer;


    public Question(int questionId, String question, List<Answer> answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Question: {1}\t Answer: {2}\n",questionId,question,answer);
    }
}
