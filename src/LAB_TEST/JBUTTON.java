package LAB_TEST;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JBUTTON extends JFrame {
    JButton button;
    JLabel label;
    Random random = new Random();

    JBUTTON(){
        setSize(400,500);
        setTitle("SimpleGUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button=new JButton("Click me!");
        label=new JLabel("Click here!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked!");
                getContentPane().setBackground(new Color (random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            }
        });
                add(button);
                add(label);
                setVisible(true);
    }
    public static void main(String [] args){
        new JBUTTON();
    }
}
