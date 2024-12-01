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
public class WindQuiz extends Quiz {
    private final ArrayList<String> questions;
    private final ArrayList<ArrayList<String>> choice;//this allows me to store the questions and have those questions have the answers stores within.
    private final ArrayList<Integer> correctAns;
    
    public WindQuiz() {//initializing variables
        questions = new ArrayList<>();
        choice = new ArrayList<>();
        correctAns = new ArrayList<>();
        //adding questions
        questions.add("What is the primary source of energy for wind power generation?");
        questions.add("Which of the following is the main component of a wind turbine that converts wind energy into mechanical energy?");
        
        //adding choices to questions
        ArrayList<String> q1Choice = new ArrayList<>();
        q1Choice.add("Wind");
        q1Choice.add("Solar");
        q1Choice.add("Water");
        choice.add(q1Choice);
        correctAns.add(1);
        
        ArrayList<String> q2Choice = new ArrayList<>();
        q2Choice.add("Blade");
        q2Choice.add("Rotor");
        q2Choice.add("Tower");
        choice.add(q2Choice);
        correctAns.add(1);
    }
    
    @Override
    public int getNumQ(){
        return questions.size();
    }
    @Override
    public String getQ(int questionI){
        return questions.get(questionI);
    }
    @Override
    public ArrayList<String> getCh(int questionI){
        return choice.get(questionI);
    }
    @Override
    public int getCorrectAnsI(int questionI){
        return correctAns.get(questionI);
    }
    
}
//    private String qQuestiontext;
//    private String qCorrectAns;
//    
//    public WindQuiz(String qQuestiontext, String qCorrectAns){
//        this.qCorrectAns = qCorrectAns;
//        this.qQuestiontext = qQuestiontext;
//    }
//    
//    public static ArrayList<QuizApp> getqQuestion(){//static as thes questions wont change
//        
//        ArrayList<QuizApp> questions = new ArrayList<>();//questions first then answers
//        questions.add(new WindQuiz("q1", "a1"));
//        questions.add(new WindQuiz("q2", "a2"));
//        questions.add(new WindQuiz("q3", "a3"));
//        questions.add(new WindQuiz("q4", "a4"));
//        questions.add(new WindQuiz("q5", "a5"));
//        
//        return questions;
//    }
//
//    public String getqQuestiontext() {
//        return qQuestiontext;
//    }
//
//    public void setqQuestiontext(String qQuestiontext) {
//        this.qQuestiontext = qQuestiontext;
//    }
//
//    public String getqCorrectAns() {
//        return qCorrectAns;
//    }
//
//    public void setqCorrectAns(String qCorrectAns) {
//        this.qCorrectAns = qCorrectAns;
//    }
//
//}
    
    
//    private String endScore;
//    private ArrayList<String> qQuestions = new ArrayList<>();
//    private ArrayList<String> qAnswers = new ArrayList<>();
//    private ArrayList<String> qFeedback = new ArrayList<>();
//
//    public WindQuiz(){
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