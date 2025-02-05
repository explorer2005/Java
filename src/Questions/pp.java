package Questions;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class pp extends JFrame {
    JButton button;
    JLabel label;
    Random random = new Random();

    pp() {
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Simple GUI");

        button = new JButton("Clicke me!");
        label = new JLabel("Click here!");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("I am clicked");
                getContentPane().setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
        });
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pp();
    }
}
