package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DRAWLINE5 extends JPanel{
    private int stateX,stateY;

    DRAWLINE5(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
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
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DRAW");
        frame.setVisible(true);
        frame.add(new DRAWLINE5());
    }
}
