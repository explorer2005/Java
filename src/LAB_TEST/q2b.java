package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class q2b extends JFrame{
    JButton button;
    JLabel label;
    Random random = new Random();
    q2b(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,700);
        setTitle("Simple GUI");

        button = new JButton("Click me!");
        label = new JLabel("Click Here!");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("Clicked");
                getContentPane().setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            }
        });
        add(button);
        add(label);
        setVisible(true);
    }
    public static void main(String [] args){
        new q2b();
    }
}
