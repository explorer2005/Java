package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DRAWLINE extends JPanel{
    private int stateX,stateY;
    DRAWLINE(){
        addMouseListener(new MouseAdapter (){
            public void mousePressed(MouseEvent e){
                stateX=e.getX();
                stateY=e.getY();
            }
        });
        addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                Graphics g = getGraphics();
                g.drawLine(stateX,stateY,e.getX(),e.getY());
                stateX=e.getX();
                stateY=e.getY();
            }
        });
    }
    public static void main(String [] args){
        JFrame frame = new JFrame("DRAWLINE");
        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DRAWLINE());
        frame.setVisible(true);
    }
}
