package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SimpleGUI extends JFrame {
    JButton button;
    JLabel label;
    Random random = new Random();

    SimpleGUI(){
            setLayout(new FlowLayout());
            setSize(500,900);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("SIMPLEGUI");

            button=new JButton("CLICK HERE!");
            label = new JLabel("CLICK ME!");

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("CLICKED!");
                    getContentPane().setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
                }
            });

            add(label);
            add(button);
            setVisible(true);
    }
    public static void main(String [] args){
        new SimpleGUI();
    }
}
