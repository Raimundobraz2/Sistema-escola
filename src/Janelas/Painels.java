package Painel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

 public class Painels extends JPanel{
  
     
     public Painels(){
         setOpaque(false);
     }
     
   
    @Override
     protected void paintComponent(Graphics grfhcs){
         Graphics2D g2 = (Graphics2D) grfhcs;
         g2.setBackground(getBackground());
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         g2.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
         super.paintComponent(grfhcs);
     }
     
     
     
     
}
