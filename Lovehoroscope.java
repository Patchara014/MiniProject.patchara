/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Lovehoroscope extends javax.swing.JFrame {

    /**
     * Creates new form Lovehoroscope
     */
    public Lovehoroscope() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbMon = new javax.swing.JRadioButton();
        rdbTues = new javax.swing.JRadioButton();
        rdbWed = new javax.swing.JRadioButton();
        rdbThurs = new javax.swing.JRadioButton();
        rdbFri = new javax.swing.JRadioButton();
        rdbSatur = new javax.swing.JRadioButton();
        rdbSun = new javax.swing.JRadioButton();
        btnPredict = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarCharacter = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarCharacterLove = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        lblPerson = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Love Horoscope");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("???????????????????????????????????????????????????????????????????????????");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setText("?????????????????????");

        buttonGroup1.add(rdbMon);
        rdbMon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbMon.setText("???????????????????????????");

        buttonGroup1.add(rdbTues);
        rdbTues.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbTues.setText("???????????????????????????");

        buttonGroup1.add(rdbWed);
        rdbWed.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbWed.setText("??????????????????");

        buttonGroup1.add(rdbThurs);
        rdbThurs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbThurs.setText("?????????????????????????????????");

        buttonGroup1.add(rdbFri);
        rdbFri.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbFri.setText("????????????????????????");

        buttonGroup1.add(rdbSatur);
        rdbSatur.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbSatur.setText("????????????????????????");

        buttonGroup1.add(rdbSun);
        rdbSun.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdbSun.setText("??????????????????????????????");

        btnPredict.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPredict.setText("???????????????");
        btnPredict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPredictActionPerformed(evt);
            }
        });

        tarCharacter.setColumns(20);
        tarCharacter.setRows(5);
        jScrollPane1.setViewportView(tarCharacter);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel3.setText("???????????????");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel4.setText("??????????????????????????????????????????????????????");

        tarCharacterLove.setColumns(20);
        tarCharacterLove.setRows(5);
        jScrollPane2.setViewportView(tarCharacterLove);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel5.setText("???????????????????????????????????????????????????");

        lblPerson.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblPerson.setForeground(new java.awt.Color(255, 51, 0));
        lblPerson.setText("0 %");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdbThurs)
                                            .addGap(34, 34, 34)
                                            .addComponent(rdbFri)
                                            .addGap(27, 27, 27)
                                            .addComponent(rdbSatur))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdbSun)
                                            .addGap(62, 62, 62)
                                            .addComponent(btnPredict, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(rdbMon))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbTues)
                        .addGap(18, 18, 18)
                        .addComponent(rdbWed)
                        .addGap(70, 70, 70)))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(lblPerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdbMon)
                    .addComponent(rdbTues)
                    .addComponent(rdbWed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbFri)
                        .addComponent(rdbSatur))
                    .addComponent(rdbThurs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbSun)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnPredict)))
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPredictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPredictActionPerformed
        if (rdbMon.isSelected()) {
            tarCharacter.setText("????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????? \n???????????????????????????????????????????????????????????????????????? \n????????????????????????????????????????????????????????? ????????????????????????");
            tarCharacterLove.setText("?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????!\n??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????? ??????????????? ???????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????????????????????????????????!\n??????????????????????????????????????????????????????????????????????????? ?????????????????????????????????????????????\n???????????????????????? ?????????????????? ?????????????????????????????? ??????????????????!\n??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ?????????");
            lblPerson.setText("90%");
        } else if (rdbTues.isSelected()) {
            tarCharacter.setText("?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????!\n?????????????????????????????????????????????????????? 5 ???????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????? ????????????!\n??????????????????????????????????????????????????????????????????");
            tarCharacterLove.setText("???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????? ???????????????????????????????????? ????????????????????????????????????????????????????????????\n??????????????????????????????????????? ????????????????????????????????????????????? ??????????????????????????????!\n????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????? 100 ??????????????????????????????????????? 100 ?????????????????????????????????????????????\n?????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????? ?????????????????????????????? ???????????????????????????????????????\n????????????????????????????????????????????? ???????????????????????????????????? ?????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????!");
            lblPerson.setText("100%");
        } else if (rdbWed.isSelected()) {
            tarCharacter.setText("??????????????????????????????????????? 1 ????????????????????????????????????????????? ??????????????? ???????????????????????????????????????????????????\n?????????????????????????????? ??? ?????????????????????????????????????????????????????? ?????????????????????????????????????????? ?????????????????????\n??????????????????????????????????????????????????????????????? ??????????????????????????? ???????????????\n???????????????????????????????????????????????? ??? ????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????");
            tarCharacterLove.setText("?????????????????????????????????????????????????????????????????????????????? ????????????????????????\n?????????????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????? ?????????????????? ?????????????????? ????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n???????????????????????????????????????????????????????????????");
            lblPerson.setText("50%");
        } else if (rdbThurs.isSelected()) {
            tarCharacter.setText("????????????????????????????????????????????????????????????????????????????????? ????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????\n???????????????????????????????????????????????? ???????????? ????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????? ????????????????????????\n?????????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????\n????????????????????????????????????????????????");
            tarCharacterLove.setText("????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????????????????? ???????????????????????????????????? ????????????????????? ????????????????????????\n????????????????????????????????????????????? ??????????????????????????????????????????????????????????????? Deep Conversation ?????????\n????????????????????? ????????????????????????????????????????????????????????? ????????????????????????????????????????????????\n????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n???????????? ??? ?????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????????");
            lblPerson.setText("60%");
        } else if (rdbFri.isSelected()) {
            tarCharacter.setText("????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????\n??????????????????????????????????????????! ??????????????????????????????????????? ???????????????????????????????????????\n????????????????????????????????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????");
            tarCharacterLove.setText("?????????????????????????????????????????????????????????????????????!\n?????????????????????????????????????????????????????????????????????????????????????????????????????? ?????????????????????????????????\n??????????????????????????????????????????????????? ?????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????????????????? ???????????? ??????????????????????????? ??????????????? ?????????????????????\n???????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????????????????????????????\n????????????????????????????????? ???");
            lblPerson.setText("85%");
        } else if (rdbSatur.isSelected()) {
            tarCharacter.setText("?????????????????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????? ?????????????????????\n?????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????? ?????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????? ?????????????????? ?????????????????????????????????\n????????????????????? ???????????? ?????????????????????????????? ??????????????? ?????????????????????????????????????????????????????????\n?????????????????? ????????????????????????????????????????????????????????????????????? ???");
            tarCharacterLove.setText("?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n(????????????! ??????????????????!)????????????????????????????????????????????????????????????????????????!\n???????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????!");
            lblPerson.setText("70%");
        } else if (rdbSun.isSelected()) {
            tarCharacter.setText("?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ?????????\n??????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????\n???????????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n????????????????????? ???????????????????????????????????? ????????????????????? ??????????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????");
            tarCharacterLove.setText("?????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????\n???????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????? ?????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????????????????????????????????????????????????????\n??????????????????????????????????????? ??????????????? ????????????????????????\n???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ???");
            lblPerson.setText("75%");
        }//GEN-LAST:event_btnPredictActionPerformed
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnPredictActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);    
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Lovehoroscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lovehoroscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lovehoroscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lovehoroscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lovehoroscope().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPredict;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JRadioButton rdbFri;
    private javax.swing.JRadioButton rdbMon;
    private javax.swing.JRadioButton rdbSatur;
    private javax.swing.JRadioButton rdbSun;
    private javax.swing.JRadioButton rdbThurs;
    private javax.swing.JRadioButton rdbTues;
    private javax.swing.JRadioButton rdbWed;
    private javax.swing.JTextArea tarCharacter;
    private javax.swing.JTextArea tarCharacterLove;
    // End of variables declaration//GEN-END:variables
}
