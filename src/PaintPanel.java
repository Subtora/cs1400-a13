import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PaintPanel extends JPanel{


    public PaintPanel() {
        setSize(800,600);
    }

    public void paintComponent(Graphics g){
        //paint occurs when the method repaint() is called (see actionPerformed method )
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(10,10,30,20);
    }//end paint


}
