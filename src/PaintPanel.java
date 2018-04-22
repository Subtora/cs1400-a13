import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PaintPanel extends JPanel implements ActionListener{


    public PaintPanel() {
        setSize(800,600);
        Timer clock = new Timer(100,this);
        clock.start();
    }

    public void paintComponent(Graphics g){
        //paint occurs when the method repaint() is called (see actionPerformed method )
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);

        for (int n = 1; n<= 4; n++){

            int npoints = r(10,10);
            int[] xpoints = new int[npoints];
            int[] ypoints = new int[npoints];

            for (int i = 0; i < npoints;i++){
                xpoints[i] = r((n*100),(n*100)+100);
                ypoints[i] = r(100,200);
            }
            g.drawPolygon(xpoints, ypoints, npoints);
        }
    }//end paint
    public void actionPerformed(ActionEvent arg0) {
        repaint();
    }
    public int r(int min, int max){
        Random ran = new Random();
        return ran.nextInt((max - min) + 1) + min;
    }

}
