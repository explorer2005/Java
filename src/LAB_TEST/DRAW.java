package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DRAW extends JPanel{
    private int stateX,stateY;
    DRAW(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                stateX=e.getX();
                stateY=e.getY();
            }
        });
        addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                Graphics g=getGraphics();
                g.drawLine(stateX,stateY,e.getX(),e.getY());
                stateX=e.getX();
                stateY=e.getY();
            }
        });
    }
    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setTitle("DRAWLINES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DRAW());
        frame.setSize(500,700);
        frame.setVisible(true);
    }
}
