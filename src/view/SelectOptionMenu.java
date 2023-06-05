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
import model.Category;

public class SelectOptionMenu extends javax.swing.JFrame {

    public SelectOptionMenu() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        initComponents();
        loadResources();

        setLocationRelativeTo(null);
        this.btnColoursCat.putClientProperty("JButton.buttonType", "roundRect");
        this.btnHouseFCat.putClientProperty("JButton.buttonType", "roundRect");
        this.btnNumberCat.putClientProperty("JButton.buttonType", "roundRect");
        this.btnClothesCat.putClientProperty("JButton.buttonType", "roundRect");
        this.btnToyCat.putClientProperty("JButton.buttonType", "roundRect");
        this.btnFamCat.putClientProperty("JButton.buttonType", "roundRect");
        btnAnimalsCat.putClientProperty("JButton.buttonType", "roundRect");
        btnFoodCat.putClientProperty("JButton.buttonType", "roundRect");
        btnSeasonsYearsCat.putClientProperty("JButton.buttonType", "roundRect");
        btnCountries.putClientProperty("JButton.buttonType", "roundRect");
        btnHBodyCat.putClientProperty("JButton.buttonType", "roundRect");
        btnMusicalInstruments.putClientProperty("JButton.buttonType", "roundRect");
        jPanel4.putClientProperty(FlatClientProperties.STYLE, "arc: 8");
        jPanel5.putClientProperty(FlatClientProperties.STYLE, "arc: 8");
    }

    public void loadResources() {
        btnHouseFCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/house_icon.png")));
        btnNumberCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/numbers_icon.png")));
        btnColoursCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/color-circle_icon.png")));
        btnClothesCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/clothes_icon.png")));
        btnToyCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/toys_icon.png")));
        btnFamCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/family_icon.png")));
        btnAnimalsCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/animals_icon.png")));
        btnFoodCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/food_icon.png")));
        btnSeasonsYearsCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/days_icon.png")));
        this.btnCountries.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/countries.png")));
        this.btnMusicalInstruments.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/guitar.png")));
        this.btnHBodyCat.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/body_icon.png")));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/back-arrow.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnColoursCat = new javax.swing.JButton();
        btnHouseFCat = new javax.swing.JButton();
        btnNumberCat = new javax.swing.JButton();
        btnClothesCat = new javax.swing.JButton();
        btnToyCat = new javax.swing.JButton();
        btnFamCat = new javax.swing.JButton();
        btnAnimalsCat = new javax.swing.JButton();
        btnFoodCat = new javax.swing.JButton();
        btnSeasonsYearsCat = new javax.swing.JButton();
        btnCountries = new javax.swing.JButton();
        btnHBodyCat = new javax.swing.JButton();
        btnMusicalInstruments = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(16, 16, 16, 16, new java.awt.Color(0, 175, 128)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Informal Roman", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT A CATEGORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        btnColoursCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnColoursCat.setForeground(new java.awt.Color(255, 51, 51));
        btnColoursCat.setText("Colours");

        btnHouseFCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnHouseFCat.setForeground(new java.awt.Color(255, 51, 51));
        btnHouseFCat.setText("House and fourniture");
        btnHouseFCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseFCatActionPerformed(evt);
            }
        });

        btnNumberCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnNumberCat.setForeground(new java.awt.Color(255, 51, 51));
        btnNumberCat.setText("Numbers");

        btnClothesCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnClothesCat.setForeground(new java.awt.Color(255, 51, 51));
        btnClothesCat.setText("Clothes");

        btnToyCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnToyCat.setForeground(new java.awt.Color(255, 51, 51));
        btnToyCat.setText("Toys");

        btnFamCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnFamCat.setForeground(new java.awt.Color(255, 51, 51));
        btnFamCat.setText("Family");

        btnAnimalsCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnAnimalsCat.setForeground(new java.awt.Color(255, 51, 51));
        btnAnimalsCat.setText("Animals");

        btnFoodCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnFoodCat.setForeground(new java.awt.Color(255, 51, 51));
        btnFoodCat.setText("Food");

        btnSeasonsYearsCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnSeasonsYearsCat.setForeground(new java.awt.Color(255, 51, 51));
        btnSeasonsYearsCat.setText("Seasons/Years");

        btnCountries.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnCountries.setForeground(new java.awt.Color(255, 51, 51));
        btnCountries.setText("Countries");

        btnHBodyCat.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnHBodyCat.setForeground(new java.awt.Color(255, 51, 51));
        btnHBodyCat.setText("Human body");

        btnMusicalInstruments.setFont(new java.awt.Font("Informal Roman", 1, 18)); // NOI18N
        btnMusicalInstruments.setForeground(new java.awt.Color(255, 51, 51));
        btnMusicalInstruments.setText("Musical instruments");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNumberCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHouseFCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btnColoursCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClothesCat, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnToyCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFamCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnFoodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnHBodyCat, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSeasonsYearsCat, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMusicalInstruments, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAnimalsCat, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHouseFCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnClothesCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAnimalsCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnCountries, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumberCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnToyCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnFoodCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnHBodyCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColoursCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnFamCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnSeasonsYearsCat, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnMusicalInstruments, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        btnReturn.setBorder(null);
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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

    private void btnHouseFCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseFCatActionPerformed

    }//GEN-LAST:event_btnHouseFCatActionPerformed

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
            java.util.logging.Logger.getLogger(SelectOptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                    new SelectOptionMenu().setVisible(true);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(SelectOptionMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(SelectOptionMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SelectOptionMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnimalsCat;
    public javax.swing.JButton btnClothesCat;
    public javax.swing.JButton btnColoursCat;
    public javax.swing.JButton btnCountries;
    public javax.swing.JButton btnFamCat;
    public javax.swing.JButton btnFoodCat;
    public javax.swing.JButton btnHBodyCat;
    public javax.swing.JButton btnHouseFCat;
    public javax.swing.JButton btnMusicalInstruments;
    public javax.swing.JButton btnNumberCat;
    public javax.swing.JButton btnReturn;
    public javax.swing.JButton btnSeasonsYearsCat;
    public javax.swing.JButton btnToyCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
