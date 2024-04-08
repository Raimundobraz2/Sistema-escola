/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import javax.swing.JOptionPane;

/**
 *
 * @author João Tomás Manuel
 */
public class Cadastros extends javax.swing.JFrame {
int xMouse;
int yMouse;
   boolean validar1,validar2,validar3,validar4,validar5;
   Cadastro df = new Cadastro();
   
    public Cadastros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painels1 = new Painel.Painels();
        jLabel5 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Confirma_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_apelido = new javax.swing.JTextField();
        painels4 = new Painel.Painels();
        btn_guardar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        painels3 = new Painel.Painels();
        btn_voltar = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_confirma = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_apelido = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painels1.setForeground(new java.awt.Color(8, 40, 81));
        painels1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_user_groups_25px.png"))); // NOI18N
        painels1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 50));

        txt_nome.setBackground(new java.awt.Color(8, 40, 81));
        txt_nome.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_nome.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_nomeCaretUpdate(evt);
            }
        });
        painels1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 40));

        txt_senha.setBackground(new java.awt.Color(8, 40, 81));
        txt_senha.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_senha.setForeground(new java.awt.Color(255, 255, 255));
        txt_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_senha.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_senha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_senhaCaretUpdate(evt);
            }
        });
        painels1.add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, 50));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha");
        painels1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nome");
        painels1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, 40));

        Txt_Confirma_senha.setBackground(new java.awt.Color(8, 40, 81));
        Txt_Confirma_senha.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Txt_Confirma_senha.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Confirma_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Txt_Confirma_senha.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_Confirma_senha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Txt_Confirma_senhaCaretUpdate(evt);
            }
        });
        painels1.add(Txt_Confirma_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 330, 50));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirma senha");
        painels1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 150, 40));

        txt_apelido.setBackground(new java.awt.Color(8, 40, 81));
        txt_apelido.setForeground(new java.awt.Color(255, 255, 255));
        txt_apelido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_apelido.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_apelido.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_apelidoCaretUpdate(evt);
            }
        });
        painels1.add(txt_apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 330, 40));

        painels4.setForeground(new java.awt.Color(255, 255, 255));
        painels4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(8, 40, 81));
        btn_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        painels4.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        painels1.add(painels4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 160, 50));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Apelido");
        painels1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 40));

        painels3.setForeground(new java.awt.Color(255, 255, 255));
        painels3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_voltar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(8, 40, 81));
        btn_voltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_voltar.setText("Voltar");
        btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
        });
        painels3.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        painels1.add(painels3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 160, 50));

        txt_email.setBackground(new java.awt.Color(8, 40, 81));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_email.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_email.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_emailCaretUpdate(evt);
            }
        });
        painels1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 330, 40));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Email");
        painels1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 70, 40));

        lbl_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 30, 40));

        lbl_confirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 40, 30));

        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 40, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 404, 40, 30));

        lbl_apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 40, 30));

        lbl_senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 40, 30));

        jPanel1.add(painels1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 550, 630));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exams-bro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 380, 390));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(8, 40, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seja bem-vindo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, 50));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 40, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cria a sua conta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
       Aux1 b=new Aux1();
        if (validar1==true&&validar2==true&&validar3==true) {
            
            df.setNome(txt_nome.getText());
            b.setNome1(txt_nome.getText());
            df.setApelido(txt_apelido.getText());
            df.setSenha(txt_senha.getText());
            df.setConfirmasenha(Txt_Confirma_senha.getText());
            df.setEmail(txt_email.getText());
            df.cadastro_escrever();
            salvo r=new salvo(this, true);
            r.setVisible(true);
            dispose();
           
        }else{
            erro1 r=new erro1(this, true);
            r.setVisible(true);
            dispose();
        }
        
          
        
      
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        Login v = new Login();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void txt_nomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_nomeCaretUpdate
        String nome=txt_nome.getText();
        if (nome.matches("[A-Z]{1}+[a-zá-úÁ-Úç-ç]+")) {
            lbl_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
             validar1=true;
        }else{
            lbl_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));
        }
    }//GEN-LAST:event_txt_nomeCaretUpdate

    private void txt_apelidoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_apelidoCaretUpdate
        String apelido=txt_apelido.getText();
        if (apelido.matches("[A-Z]{1}+[a-zá-úÁ-Úç-ç]+")) {
            lbl_apelido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
            validar2=true;
        }else{
          lbl_apelido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png"))); 
        }
    }//GEN-LAST:event_txt_apelidoCaretUpdate

    private void txt_senhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_senhaCaretUpdate
        String senha=txt_senha.getText();
        if (senha.matches("[a-zA-Zá-úÁ-Ú-ç1-Ç9-_]{4,8}")) {
           lbl_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
            validar3=true;
        }else{
           lbl_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));   
        }
    }//GEN-LAST:event_txt_senhaCaretUpdate

    private void txt_emailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_emailCaretUpdate
          String email=txt_email.getText();
        if (email.matches("[a-zá-ú-ç1-9]+[@]{1}+[g]+[m]+[a]+[i]+[l]+[.]+[c]+[o]+[m]")) {
               lbl_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
           
        }
         else
        {
              lbl_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));
        } 
    }//GEN-LAST:event_txt_emailCaretUpdate

    private void Txt_Confirma_senhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Txt_Confirma_senhaCaretUpdate

        String conf=Txt_Confirma_senha.getText();
        if (conf.matches("[a-zA-Zá-úÁ-Ú-ç1-Ç9-_]{4,8}"))
        {
           lbl_confirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
        }
            else
        {
              lbl_confirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));
        } 
     
    }//GEN-LAST:event_Txt_Confirma_senhaCaretUpdate

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Txt_Confirma_senha;
    private javax.swing.JLabel btn_guardar;
    private javax.swing.JLabel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apelido;
    private javax.swing.JLabel lbl_confirma;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private Painel.Painels painels1;
    private Painel.Painels painels3;
    private Painel.Painels painels4;
    private javax.swing.JTextField txt_apelido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
