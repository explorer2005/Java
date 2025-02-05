package LAB_TEST;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
public class q6b extends JPanel{
    private int startX,startY;
    q6b(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                startX=e.getX();
                startY=e.getY();
            }
        });
        addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                Graphics g = getGraphics();
                g.drawLine(startX,startY,e.getX(),e.getY());
                startX=e.getX();
                startY=e.getY();
            }
        });
    }
    public static void main(String [] args){
        JFrame frame = new JFrame("Draw Lines");
        frame.setSize(852,933);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new q6b());
        frame.setVisible(true);
    }

}
