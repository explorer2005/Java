package Questions;
import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
class SimpleGUI extends JFrame{
    JButton button;
    JLabel label;
    Random random = new Random();

    SimpleGUI(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setTitle("Simple GUI");

        button=new JButton("Click me!");
        label=new JLabel("Click!");

        button.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               label.setText("Button Clicked!");
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