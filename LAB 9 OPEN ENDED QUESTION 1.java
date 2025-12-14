import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9 extends JFrame {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public Lab9() {
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel label1 = new JLabel("Num1: ");
        JLabel label2 = new JLabel("Num2: ");
        JLabel label3 = new JLabel("Result: ");
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        gbc.gridx = 0; gbc.gridy = 0;
        add(label1, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        add(num1Field, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(label2, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        add(num2Field, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(label3, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        add(resultField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(divideButton, gbc);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();

                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);

                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lab9().setVisible(true);
            }
        });
    }
}