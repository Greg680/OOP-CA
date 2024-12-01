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
public class SolarQuiz extends Quiz {
    
    private final ArrayList<String> questions;
    private final ArrayList<ArrayList<String>> choice;//this allows me to store the questions and have those questions have the answers stores within.
    private final ArrayList<Integer> correctAns;
    
    public SolarQuiz() {//initializing variables
        questions = new ArrayList<>();
        choice = new ArrayList<>();
        correctAns = new ArrayList<>();
        //adding questions
        questions.add("What is the primary source of energy in the field of SolarEnergy?");
        questions.add("Which country is the largest producer of solar power in the world?");
        
        //adding choices to questions
        ArrayList<String> q1Choice = new ArrayList<>();
        q1Choice.add("Wind");
        q1Choice.add("Solar");
        q1Choice.add("Water");
        q1Choice.add("Geothermal");
        choice.add(q1Choice);
        correctAns.add(2);
        
        ArrayList<String> q2Choice = new ArrayList<>();
        q2Choice.add("Germany");
        q2Choice.add("Unites States");
        q2Choice.add("China");
        q2Choice.add("India");
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
    
    
    
//    private int qTotal;
//    private int quizScore;
//
//    public SolarQuiz(int qTotal) {
//        this.qTotal = qTotal;
//        this.quizScore = 0; //score is set as zero from the start
//    }
//    
//    public int getScore(){
//        return quizScore;
//    }
//    
//    public void reset() {
//        quizScore = 0;
//    }
//    
////    public void updScore(){//im going to have a method of checking if a answer is correct and incrementing it here
////        if(correct){
////            score++;
////        }
////    }
//    
//    public void quizFinished(){//marks the quiz as finished, used in Quiz.java
//        System.out.println("quiz is finished");
//    }
    
    
    
    
    
