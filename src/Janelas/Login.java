/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

/**
 *
 * @author João Tomás Manuel
 */
public class Login extends javax.swing.JFrame {
   Cadastro df = new Cadastro();
int xMouse;
int yMouse;
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        painels1 = new Painel.Painels();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painels2 = new Painel.Painels();
        painels3 = new Painel.Painels();
        jLabel7 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        painels5 = new Painel.Painels();
        jLabel10 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_nome1 = new javax.swing.JLabel();
        lbl_senha1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        painels4 = new Painel.Painels();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mostra = new javax.swing.JLabel();

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
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painels1.setForeground(new java.awt.Color(8, 40, 81));
        painels1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_signin_32px.png"))); // NOI18N
        painels1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, 60));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha");
        painels1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 40));

        painels2.setForeground(new java.awt.Color(255, 255, 255));
        painels2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painels3.setForeground(new java.awt.Color(255, 255, 255));
        painels3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painels2.add(painels3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 50));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 40, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Entrar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        painels2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        painels1.add(painels2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 50));

        txt_nome.setBackground(new java.awt.Color(8, 40, 81));
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_nome.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_nomeCaretUpdate(evt);
            }
        });
        painels1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 40));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(8, 40, 81));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_delete_25px.png"))); // NOI18N
        painels1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -170, 310, 300));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nome");
        painels1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, 40));

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
        painels1.add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 330, 50));

        txt_email.setBackground(new java.awt.Color(8, 40, 81));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_email.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_email.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_emailCaretUpdate(evt);
            }
        });
        painels1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 330, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email");
        painels1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 40));

        painels5.setBackground(new java.awt.Color(255, 255, 255));
        painels5.setForeground(new java.awt.Color(255, 255, 255));
        painels5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painels5MouseExited(evt);
            }
        });
        painels5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(8, 40, 81));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Criar conta");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        painels5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        painels1.add(painels5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 140, 50));

        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 50, 50));

        lbl_nome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 50, 40));

        lbl_senha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painels1.add(lbl_senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 50, 50));

        jPanel1.add(painels1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 490, 480));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(8, 40, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sistema de gestão escolar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 50));

        painels4.setForeground(new java.awt.Color(180, 180, 180));
        painels4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_multiply_25px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        painels4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        jPanel1.add(painels4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -10, 50, 60));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(8, 40, 81));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alunos.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 430));
        jPanel1.add(mostra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Cadastros c = new Cadastros();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
           lbl_nome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
           
        }
         else
        {
           lbl_nome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));
        }
    }//GEN-LAST:event_txt_nomeCaretUpdate

    private void txt_senhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_senhaCaretUpdate
        if (txt_senha.getText().matches("[a-zA-Zá-úÁ-Ú-ç1-Ç9-_]{4,8}")) {
            
              lbl_senha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_ok_25px.png")));
        }
         else
        {
            lbl_senha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_cancel_25px_1.png")));
       
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

       String nome=txt_nome.getText();
       df.setNome(nome);
       df.setEmail(txt_email.getText());
       df.setSenha(txt_senha.getText());
       df.cadastro_ler();
        if (df.getEntra()==true) 
        {
            Menu_principal chama=new Menu_principal();
            chama.setVisible(true);
            dispose();
            
        } else 
        {
            Erro r=new Erro(this, true);
            r.setVisible(true);
            dispose();
            
          
       }
      
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited


    }//GEN-LAST:event_jLabel7MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
      
    }//GEN-LAST:event_jPanel1MouseEntered

    private void painels5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painels5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_painels5MouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nome1;
    private javax.swing.JLabel lbl_senha1;
    private javax.swing.JLabel mostra;
    private Painel.Painels painels1;
    private Painel.Painels painels2;
    private Painel.Painels painels3;
    private Painel.Painels painels4;
    private Painel.Painels painels5;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
