import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.util.*;

public class draw{

    private JFrame frame;
    private JPanel centerPanel;

    public draw(){
        setupFrame();
        setupPanels();
        //setupButtons();
        frame.setVisible(true);
    }

    private void setupFrame() {
        frame = new JFrame("Drawing");
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
    }

    private void setupPanels() {
        centerPanel = new PaintPanel();
        frame.add(centerPanel, BorderLayout.CENTER);
    }
    }//end class MyPanel

