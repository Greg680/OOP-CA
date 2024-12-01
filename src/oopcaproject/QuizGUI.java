package oopcaproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Greg
 */
public class QuizGUI extends javax.swing.JFrame {
    UnifieQuiz uQuiz;
    int currentQindex;
    int score;
    
    /**
     * Creates new form QuizGUI
     */
    public QuizGUI() {
        initComponents();
        uQuiz = new UnifieQuiz();
        currentQindex = 0;
        score = 0;
        loadQ();
    }
    
    private void loadQ(){
        if (currentQindex < uQuiz.getNumQ()){
            questionTA.setText(uQuiz.getQ(currentQindex));
            ArrayList<String> choices = uQuiz.getCh(currentQindex);
            
            answer1RBTN.setText(choices.get(0));
            answer2RBTN.setText(choices.get(1));
            answer3RBTN.setText(choices.get(2));
            buttonGroup1.clearSelection();
        }else {
           errorTA.setText("quiz complete");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titlLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTA = new javax.swing.JTextArea();
        instuctionLBL = new javax.swing.JLabel();
        nextBTN = new javax.swing.JButton();
        scoreLBL = new javax.swing.JLabel();
        startBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorTA = new javax.swing.JTextArea();
        answer1RBTN = new javax.swing.JRadioButton();
        answer2RBTN = new javax.swing.JRadioButton();
        answer3RBTN = new javax.swing.JRadioButton();
        scoreTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titlLBL.setBackground(new java.awt.Color(204, 204, 204));
        titlLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        titlLBL.setText("Welcome to the Quiz!");

        exitBTN.setBackground(new java.awt.Color(255, 51, 0));
        exitBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Back");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        questionTA.setColumns(20);
        questionTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        questionTA.setRows(5);
        questionTA.setText("QUESTIONS WILL BE DISPLAYED HERE");
        jScrollPane1.setViewportView(questionTA);

        instuctionLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        instuctionLBL.setText("Select one of the three buttons");

        nextBTN.setBackground(new java.awt.Color(51, 255, 51));
        nextBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nextBTN.setText("Next");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        scoreLBL.setBackground(new java.awt.Color(204, 204, 204));
        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        scoreLBL.setText("Score: ");

        startBTN.setBackground(new java.awt.Color(51, 255, 51));
        startBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        startBTN.setText("Start");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });

        errorTA.setColumns(20);
        errorTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        errorTA.setRows(5);
        jScrollPane2.setViewportView(errorTA);

        buttonGroup1.add(answer1RBTN);
        answer1RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer1RBTN.setText("1");
        answer1RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1RBTNActionPerformed(evt);
            }
        });

        buttonGroup1.add(answer2RBTN);
        answer2RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer2RBTN.setText("2");
        answer2RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2RBTNActionPerformed(evt);
            }
        });

        buttonGroup1.add(answer3RBTN);
        answer3RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer3RBTN.setText("3");
        answer3RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3RBTNActionPerformed(evt);
            }
        });

        scoreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(exitBTN)
                        .addGap(97, 97, 97)
                        .addComponent(titlLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answer1RBTN)
                        .addGap(57, 57, 57)
                        .addComponent(answer2RBTN)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startBTN)
                        .addGap(173, 173, 173)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(nextBTN)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(answer3RBTN)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(instuctionLBL)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scoreLBL)
                .addGap(45, 45, 45)
                .addComponent(scoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(titlLBL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBTN)
                            .addComponent(startBTN))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(instuctionLBL)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer2RBTN)
                            .addComponent(answer1RBTN)
                            .addComponent(answer3RBTN))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
       currentQindex = 0;
       score = 0;
       scoreTF.setText("0");
       loadQ();
       errorTA.setText("");
    }//GEN-LAST:event_startBTNActionPerformed

    private void answer1RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1RBTNActionPerformed

    private void answer2RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2RBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        //CleanEnergyGUI mainGUI = new CleanEnergyGUI();
        //mainGUI.setVisible(true); 
        this.setVisible(false); 
        this.dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void scoreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreTFActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        // TODO add your handling code here:
        int selectAns = 0;
        if (currentQindex >= uQuiz.getNumQ()){
            errorTA.setText("no more questions left quiz complete");
            return;
        }
        if(answer1RBTN.isSelected()){
            selectAns = 1;
        } else if (answer2RBTN.isSelected()){
            selectAns = 2;
        } else if (answer3RBTN.isSelected()){
            selectAns = 3;
        }
        
        if(selectAns != 0){
            if(uQuiz.getCorrectAnsI(currentQindex) == selectAns) {
                score++;
            }
                scoreTF.setText(String.valueOf(score));
                currentQindex++;
                loadQ();
                errorTA.setText("");
        }else{
            errorTA.setText("choose an answer first");
        }
    }//GEN-LAST:event_nextBTNActionPerformed

    private void answer3RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3RBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton answer1RBTN;
    private javax.swing.JRadioButton answer2RBTN;
    private javax.swing.JRadioButton answer3RBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea errorTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel instuctionLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBTN;
    private javax.swing.JTextArea questionTA;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JTextField scoreTF;
    private javax.swing.JButton startBTN;
    private javax.swing.JLabel titlLBL;
    // End of variables declaration//GEN-END:variables
}
