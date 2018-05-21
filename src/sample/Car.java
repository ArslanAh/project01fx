package sample;

import javax.swing.*;
import java.awt.*;

public class Car extends  JPanel {

   Image image ;
    public Car() {
        ImageIcon img =  new ImageIcon(getClass().getResource("sample/Carimg.jpeg")) ;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d =  (Graphics2D) g ;
        g2d.drawImage(this.image,0,0,this) ;
    }
}
