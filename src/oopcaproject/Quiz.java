/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopcaproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Greg
 */
abstract class Quiz {
    //methods used to retrieve amount of questions, index, answers, and questions.
    public abstract int getNumQ();
    public abstract String getQ(int questionI);
    
    public abstract ArrayList<String> getCh(int questionI);
    public abstract int getCorrectAnsI(int questionI);
    
}
    
    
//   private ArrayList<WindQuiz> questions;
//   private int CurrentQuestion = 0;
//   private SolarQuiz scoreS;
//   
//   public Quiz(){
//       questions = WindQuiz.getqQuestion();
//       scoreS = new SolarQuiz(questions.size());
//   }
//   
//   public void randQuestions(){
//       Collections.shuffle(questions);
//   }
//   
//   public WindQuiz currentQuestion(){ //gets the current question and if no more questions left ends the quiz
//       if(CurrentQuestion < questions.size()){
//           return questions.get(CurrentQuestion);
//       }else{
//           scoreS.quizFinished();
//           return null;
//       }
//   }
//   //not sure how i could implement a checkAnswer method, to see if they are correct
//   
//   
//   public int getScore(){
//       return scoreS.getScore();
//   }
//   
//   public int getTotQuestions(){
//       return questions.size();
//   }
    

        // TODO code application logic here
        //IDEA so far: have a class contain a method to retrieve questions from a file or have them retrieved from another class, then have them randomized and show the question.
        //need to have more than 3 classes: Quiz(main), WindQuiz(settings questions in a file) and QuizGUI so far but thinking of (class for random questions?)
        //new idea have Quiz(main) be the one to keep track of current question, QuiaApp has List of Questions and randomizes them, then a revies tab that saves users
        //ratings at the end and saves them to a file and is able to display at the end and Gui which counts as 4th class.
//        int endScore;
//        int currentScore;
//        ArrayList<String> qQuestions = new ArrayList();
//        ArrayList<String> qAnswers = new ArrayList();
//        
            //IDEA WAS TO HAVE A CLASS FOR QUESTIONS AND ANSWERS AND HAVE THIS CLASS TO LOOK AT THE CURRENT QUESTION AND ANSWER AND CURRENT SCORE
    
    
