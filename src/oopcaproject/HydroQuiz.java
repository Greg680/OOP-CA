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
public class HydroQuiz extends Quiz {
    
    private final ArrayList<String> questions;
    private final ArrayList<ArrayList<String>> choice;//this allows me to store the questions and have those questions have the answers stores within.
    private final ArrayList<Integer> correctAns;
    
    public HydroQuiz() {//initializing variables
        questions = new ArrayList<>();
        choice = new ArrayList<>();
        correctAns = new ArrayList<>();
        //adding questions
        questions.add("What is the primary source of energy in the field of HydroEnergy?");
        questions.add("which is the key advantage over hydro electric power over fossil fuels?");
        
        //adding choices to questions
        ArrayList<String> q1Choice = new ArrayList<>();
        q1Choice.add("wind");
        q1Choice.add("solar");
        q1Choice.add("water");
        q1Choice.add("geothermal");
        choice.add(q1Choice);
        correctAns.add(2);
        
        ArrayList<String> q2Choice = new ArrayList<>();
        q2Choice.add("less greenhouse gases");
        q2Choice.add("requires no infrastructure");
        q2Choice.add("it is intermittent");
        q2Choice.add("uses nuclear reactions");
        choice.add(q2Choice);
        correctAns.add(0);
    }
//    public abstract int getNumQ();
//    public abstract String getQ(int questionI);
//    
//    public abstract ArrayList<String> getCh(int questionI);
//    public abstract int getCorrectAnsI(int questionI);
    
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
