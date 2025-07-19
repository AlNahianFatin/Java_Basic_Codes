import javax.swing.*;
import java.awt.*;

public class Calculator {

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(350, 475);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        textField.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 65));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        JButton button[] = new JButton[10];
        for(int i = 0; i <= 9; i++){
            button[i] = new JButton(String.valueOf(i));
        }
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton eqButton = new JButton("=");
        JButton clrButton = new JButton("C");

        Font buttonFont = new Font("TIMES NEW ROMAN", Font.BOLD, 30);
        for(int i = 0; i <= 9; i++){
            button[i].setFont(buttonFont);
        }
        addButton.setFont(buttonFont);
        subButton.setFont(buttonFont);
        mulButton.setFont(buttonFont);
        divButton.setFont(buttonFont);
        eqButton.setFont(buttonFont);
        clrButton.setFont(buttonFont);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        buttonPanel.add(button[7]);
        buttonPanel.add(button[8]);
        buttonPanel.add(button[9]);
        buttonPanel.add(addButton);
        buttonPanel.add(button[4]);
        buttonPanel.add(button[5]);
        buttonPanel.add(button[6]);
        buttonPanel.add(subButton);
        buttonPanel.add(button[1]);
        buttonPanel.add(button[2]);
        buttonPanel.add(button[3]);
        buttonPanel.add(mulButton);
        buttonPanel.add(clrButton);
        buttonPanel.add(button[0]);
        buttonPanel.add(eqButton);
        buttonPanel.add(divButton);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}