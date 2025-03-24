package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JBUTTONLATEST extends JFrame{
    JButton button;
    JLabel label;
    Random random= new Random();

    JBUTTONLATEST(){
        setSize(500,700);
        setTitle("SIMPLE GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button=new JButton("CLICK ME!");
        label=new JLabel("CLICK HERE!");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("CLICKED!");
                getContentPane().setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            }
        });
        add(button);
        add(label);
        setVisible(true);
    }
    public static void main(String [] args){
        new JBUTTONLATEST();
    }
}
