/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcaproject;

import java.util.ArrayList;

/**
 *
 * @author Greg
 */
public class QuizApp {
    private String qQuestiontext;
    private String qCorrectAns;
    
    public QuizApp(String qQuestiontext, String qCorrectAns){
        this.qCorrectAns = qCorrectAns;
        this.qQuestiontext = qQuestiontext;
    }
    
    public static ArrayList<QuizApp> getqQuestion(){//static as thes questions wont change
        
        ArrayList<QuizApp> questions = new ArrayList<>();//questions first then answers
        questions.add(new QuizApp("q1", "a1"));
        questions.add(new QuizApp("q2", "a2"));
        questions.add(new QuizApp("q3", "a3"));
        questions.add(new QuizApp("q4", "a4"));
        questions.add(new QuizApp("q5", "a5"));
        
        return questions;
    }

    public String getqQuestiontext() {
        return qQuestiontext;
    }

    public void setqQuestiontext(String qQuestiontext) {
        this.qQuestiontext = qQuestiontext;
    }

    public String getqCorrectAns() {
        return qCorrectAns;
    }

    public void setqCorrectAns(String qCorrectAns) {
        this.qCorrectAns = qCorrectAns;
    }

}
    
    
//    private String endScore;
//    private ArrayList<String> qQuestions = new ArrayList<>();
//    private ArrayList<String> qAnswers = new ArrayList<>();
//    private ArrayList<String> qFeedback = new ArrayList<>();
//
//    public QuizApp(){
//        qQuestions.add(0, "question 1");
//        qQuestions.add(1, "question 2");
//        qQuestions.add(2, "question 3");    
//        qQuestions.add(3, "question 4");
//        qQuestions.add(4, "question 5");
//        
//        qAnswers.add(0, "1");
//        qAnswers.add(1, "2");
//        qAnswers.add(2, "3");
//        qAnswers.add(3, "4");
//        qAnswers.add(4, "5");
//        
//        qFeedback.add(0, "feedback 1");
//        qFeedback.add(1, "feedback 1");
//        qFeedback.add(0, "feedback 1");
//        qFeedback.add(0, "feedback 1");
//        qFeedback.add(0, "feedback 1");
//    }
//