package LAB_TEST;
import java.util.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CALCULATORNEW extends JFrame implements ActionListener{
    private JTextField textField;
    private double num1,num2,result;
    private char operator;

    CALCULATORNEW(){
        setSize(400,500);
        setTitle("DRAW");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField=new JTextField();
        textField.setFont(new Font("Arial",Font.BOLD,24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField,BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4,4,5,5));
        String[] buttons={
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","+",
                "c","0","=","-"
        };
        for(String s:buttons){
            JButton button = new JButton(s);
            button.setFont(new Font("Arial",Font.BOLD,24));
            button.addActionListener(this);
            panel.add(button);
        }
        add(panel,BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.matches("[0-9]")){
            textField.setText(textField.getText()+command);
        }else if(command.matches("[+\\-*/]")){
            num1= Double.parseDouble(textField.getText());
            operator=command.charAt(0);
            textField.setText("");
        }else if(command.equals("=")){
            try{
                num2=Double.parseDouble(textField.getText());
                switch(operator){
                    case '+':result=num1+num2;break;
                    case '-':result=num1-num2;break;
                    case '*':result=num1*num2;break;
                    case '/':
                        if(num2==0) throw new ArithmeticException("Division by zerr");
                        result=num1/num2;break;
                }
                textField.setText(String.valueOf(result));
            }catch(Exception ex){
                textField.setText("ERROR");
            }
        }else if(command.equals("c")){
            textField.setText("");
            num1=num2=result=0;
        }
    }
    public static void main(String [] arg){
        SwingUtilities.invokeLater(CALCULATORNEW::new);
    }
}
