/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MB-study
 */
public class GopherJFrame extends javax.swing.JFrame {

    String[] movies1 = {"hole.png", "mole1.png", "mole1.png", "mole2.png", "mole3.png", "mole3.png", "mole2.png", "mole1.png", "hole.png"};
    String[] movies2 = {"hole.png", "mole1.png", "hole.png"};
    Gopher gopher1, gopher2, gopher3;
    class Gopher extends Thread {

        Random random = new Random();
        JLabel hole;
        int i = 0;

        Gopher(JLabel hole) {
            this.hole = hole;
            
        }

        public void run() {
            try {
                while (true) {
                    for (i = 0; i < movies1.length; i++) {
                        hole.setIcon(new ImageIcon("src/main/java/game/" + movies1[i]));
                        Thread.sleep(random.nextInt(500));
                    }
                }
            } catch (Exception e) {
            }
        }

    }

    public GopherJFrame() {

        initComponents();
        // 自訂打地鼠配置
        hole1.setIcon(new ImageIcon("src/main/java/game/hole.png"));
        hole2.setIcon(new ImageIcon("src/main/java/game/hole.png"));
        hole3.setIcon(new ImageIcon("src/main/java/game/hole.png"));
        hole1.setText("");
        hole2.setText("");
        hole3.setText("");
        setTitle("打地鼠遊戲");
        gopher1 = new Gopher(hole1);
        gopher2 = new Gopher(hole2);
        gopher3 = new Gopher(hole3);
        gopher1.start();
        gopher2.start();
        gopher3.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hole1 = new javax.swing.JLabel();
        hole2 = new javax.swing.JLabel();
        hole3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hole1.setText("hole1");
        hole1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hole1MousePressed(evt);
            }
        });

        hole2.setText("hole2");
        hole2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hole2MousePressed(evt);
            }
        });

        hole3.setText("hole3");
        hole3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hole3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(hole1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(hole2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(hole3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hole2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hole1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hole3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hole1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hole1MousePressed
        if(gopher1.i == 4){
            hole1.setIcon(new ImageIcon("src/main/java/game/mole4.png")); 
            
        }
    }//GEN-LAST:event_hole1MousePressed

    private void hole2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hole2MousePressed
       if(gopher2.i == 4){
            hole2.setIcon(new ImageIcon("src/main/java/game/mole4.png")); 
            
        }
    }//GEN-LAST:event_hole2MousePressed

    private void hole3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hole3MousePressed
       if(gopher3.i == 4){
            hole3.setIcon(new ImageIcon("src/main/java/game/mole4.png")); 
           
        }
    }//GEN-LAST:event_hole3MousePressed

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
            java.util.logging.Logger.getLogger(GopherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GopherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GopherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GopherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GopherJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hole1;
    private javax.swing.JLabel hole2;
    private javax.swing.JLabel hole3;
    // End of variables declaration//GEN-END:variables
}
