/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcaproject;

/**
 *
 * @author Greg
 */
public class Score {
    private int qTotal;
    private int quizScore;

    public Score(int qTotal) {
        this.qTotal = qTotal;
        this.quizScore = 0; //score is set as zero from the start
    }
    
    public int getScore(){
        return quizScore;
    }
    
    public void reset() {
        quizScore = 0;
    }
    
    public void updScore(){//im going to have a method of checking if a answer is correct and incrementing it here
        if(correct){
            score++;
        }
    }
    
    public void quizFinished(){//marks the quiz as finished, used in Quiz.java
        System.out.println("quiz is finished");
    }
    
    
    
    
    
}
    
