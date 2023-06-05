package view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UIManager;

public class MainGame extends javax.swing.JFrame {

    public MainGame() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        initComponents();
        loadResources();
        jPanel4.putClientProperty(FlatClientProperties.STYLE, "arc: 8");
        setLocationRelativeTo(null);
        btnA.putClientProperty("JButton.buttonType", "roundRect");
        btnB.putClientProperty("JButton.buttonType", "roundRect");
        btnB.putClientProperty("JButton.buttonType", "roundRect");
        btnC.putClientProperty("JButton.buttonType", "roundRect");
        btnD.putClientProperty("JButton.buttonType", "roundRect");
        btnE.putClientProperty("JButton.buttonType", "roundRect");
        btnF.putClientProperty("JButton.buttonType", "roundRect");
        btnG.putClientProperty("JButton.buttonType", "roundRect");
        btnH.putClientProperty("JButton.buttonType", "roundRect");
        btnI.putClientProperty("JButton.buttonType", "roundRect");
        btnJ.putClientProperty("JButton.buttonType", "roundRect");
        btnK.putClientProperty("JButton.buttonType", "roundRect");
        btnL.putClientProperty("JButton.buttonType", "roundRect");
        btnM.putClientProperty("JButton.buttonType", "roundRect");
        btnN.putClientProperty("JButton.buttonType", "roundRect");
        btnO.putClientProperty("JButton.buttonType", "roundRect");
        btnP.putClientProperty("JButton.buttonType", "roundRect");
        btnQ.putClientProperty("JButton.buttonType", "roundRect");
        btnR.putClientProperty("JButton.buttonType", "roundRect");
        btnS.putClientProperty("JButton.buttonType", "roundRect");
        btnT.putClientProperty("JButton.buttonType", "roundRect");
        btnU.putClientProperty("JButton.buttonType", "roundRect");
        btnV.putClientProperty("JButton.buttonType", "roundRect");
        btnW.putClientProperty("JButton.buttonType", "roundRect");
        btnX.putClientProperty("JButton.buttonType", "roundRect");
        btnY.putClientProperty("JButton.buttonType", "roundRect");
        btnZ.putClientProperty("JButton.buttonType", "roundRect");
        word.putClientProperty("JComponent.roundRect", "roundRect");
    }

    public void loadResources() {
        btnReturnMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/home.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnA6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        timer = new javax.swing.JLabel();
        currentScore = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        word = new javax.swing.JTextField();
        hangmanImg = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        correctWord = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        playerName = new javax.swing.JTextField();
        btnReturnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 142, 44));
        setBounds(new java.awt.Rectangle(4, 5, 55, 55));

        jPanel1.setBackground(new java.awt.Color(53, 140, 86));

        jPanel3.setBackground(new java.awt.Color(200, 139, 42));
        jPanel3.setForeground(new java.awt.Color(12, 136, 186));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(170, 117, 33));
        jPanel2.setForeground(new java.awt.Color(12, 136, 186));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        timer.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(0, 0, 0));

        currentScore.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        currentScore.setForeground(new java.awt.Color(0, 0, 0));
        currentScore.setText("Score 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(currentScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentScore, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(53, 140, 86));
        jPanel5.setLayout(new java.awt.GridLayout(5, 5));

        btnA.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 51, 51));
        btnA.setText("A");
        jPanel5.add(btnA);

        btnB.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 51, 51));
        btnB.setText("B");
        jPanel5.add(btnB);

        btnC.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 51, 51));
        btnC.setText("C");
        jPanel5.add(btnC);

        btnD.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 51, 51));
        btnD.setText("D");
        jPanel5.add(btnD);

        btnE.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnE.setForeground(new java.awt.Color(255, 51, 51));
        btnE.setText("E");
        jPanel5.add(btnE);

        btnF.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnF.setForeground(new java.awt.Color(255, 51, 51));
        btnF.setText("F");
        jPanel5.add(btnF);

        btnG.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 51, 51));
        btnG.setText("G");
        jPanel5.add(btnG);

        btnH.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnH.setForeground(new java.awt.Color(255, 51, 51));
        btnH.setText("H");
        jPanel5.add(btnH);

        btnI.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnI.setForeground(new java.awt.Color(255, 51, 51));
        btnI.setText("I");
        jPanel5.add(btnI);

        btnJ.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnJ.setForeground(new java.awt.Color(255, 51, 51));
        btnJ.setText("J");
        jPanel5.add(btnJ);

        btnK.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnK.setForeground(new java.awt.Color(255, 51, 51));
        btnK.setText("K");
        jPanel5.add(btnK);

        btnL.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnL.setForeground(new java.awt.Color(255, 51, 51));
        btnL.setText("L");
        jPanel5.add(btnL);

        btnM.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnM.setForeground(new java.awt.Color(255, 51, 51));
        btnM.setText("M");
        jPanel5.add(btnM);

        btnN.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnN.setForeground(new java.awt.Color(255, 51, 51));
        btnN.setText("N");
        jPanel5.add(btnN);

        btnO.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnO.setForeground(new java.awt.Color(255, 51, 51));
        btnO.setText("O");
        jPanel5.add(btnO);

        btnP.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnP.setForeground(new java.awt.Color(255, 51, 51));
        btnP.setText("P");
        jPanel5.add(btnP);

        btnQ.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnQ.setForeground(new java.awt.Color(255, 51, 51));
        btnQ.setText("Q");
        jPanel5.add(btnQ);

        btnR.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnR.setForeground(new java.awt.Color(255, 51, 51));
        btnR.setText("R");
        jPanel5.add(btnR);

        btnS.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnS.setForeground(new java.awt.Color(255, 51, 51));
        btnS.setText("S");
        jPanel5.add(btnS);

        btnT.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnT.setForeground(new java.awt.Color(255, 51, 51));
        btnT.setText("T");
        jPanel5.add(btnT);

        btnU.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnU.setForeground(new java.awt.Color(255, 51, 51));
        btnU.setText("U");
        jPanel5.add(btnU);

        btnV.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnV.setForeground(new java.awt.Color(255, 51, 51));
        btnV.setText("V");
        jPanel5.add(btnV);

        btnW.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnW.setForeground(new java.awt.Color(255, 51, 51));
        btnW.setText("W");
        jPanel5.add(btnW);

        btnX.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 51, 51));
        btnX.setText("X");
        jPanel5.add(btnX);

        btnY.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnY.setForeground(new java.awt.Color(255, 51, 51));
        btnY.setText("Y");
        jPanel5.add(btnY);

        btnZ.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnZ.setForeground(new java.awt.Color(255, 51, 51));
        btnZ.setText("Z");
        jPanel5.add(btnZ);

        word.setBackground(new java.awt.Color(53, 140, 86));
        word.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        word.setForeground(new java.awt.Color(255, 255, 255));
        word.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        word.setFocusable(false);
        word.setSelectionColor(new java.awt.Color(255, 255, 255));

        hangmanImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        level.setFont(new java.awt.Font("Informal Roman", 1, 36)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));

        correctWord.setFont(new java.awt.Font("Informal Roman", 1, 24)); // NOI18N
        correctWord.setForeground(new java.awt.Color(255, 255, 255));

        category.setBackground(new java.awt.Color(53, 140, 86));
        category.setFont(new java.awt.Font("Informal Roman", 1, 24)); // NOI18N
        category.setForeground(new java.awt.Color(255, 255, 255));
        category.setFocusable(false);
        category.setSelectionColor(new java.awt.Color(255, 255, 255));

        playerName.setBackground(new java.awt.Color(53, 140, 86));
        playerName.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 255, 255));
        playerName.setFocusable(false);

        btnReturnMainMenu.setBorder(null);
        btnReturnMainMenu.setBorderPainted(false);
        btnReturnMainMenu.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hangmanImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(correctWord, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(172, 172, 172))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReturnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctWord, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)
                        .addComponent(hangmanImg, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerName))
                        .addGap(42, 42, 42)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainGame().setVisible(true);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnA;
    private javax.swing.JButton btnA6;
    public javax.swing.JButton btnB;
    public javax.swing.JButton btnC;
    public javax.swing.JButton btnD;
    public javax.swing.JButton btnE;
    public javax.swing.JButton btnF;
    public javax.swing.JButton btnG;
    public javax.swing.JButton btnH;
    public javax.swing.JButton btnI;
    public javax.swing.JButton btnJ;
    public javax.swing.JButton btnK;
    public javax.swing.JButton btnL;
    public javax.swing.JButton btnM;
    public javax.swing.JButton btnN;
    public javax.swing.JButton btnO;
    public javax.swing.JButton btnP;
    public javax.swing.JButton btnQ;
    public javax.swing.JButton btnR;
    public javax.swing.JButton btnReturnMainMenu;
    public javax.swing.JButton btnS;
    public javax.swing.JButton btnT;
    public javax.swing.JButton btnU;
    public javax.swing.JButton btnV;
    public javax.swing.JButton btnW;
    public javax.swing.JButton btnX;
    public javax.swing.JButton btnY;
    public javax.swing.JButton btnZ;
    public javax.swing.JTextField category;
    public javax.swing.JLabel correctWord;
    public javax.swing.JLabel currentScore;
    public javax.swing.JLabel hangmanImg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JLabel level;
    public javax.swing.JTextField playerName;
    public javax.swing.JLabel timer;
    public javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables
}
