import javax.swing.*;
import java.awt.event.*;

public class GuiCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Calculator");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Enter First Number:");
        label1.setBounds(20, 20, 150, 30);
        frame.add(label1);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(170, 20, 150, 30);
        frame.add(num1Field);

        JLabel label2 = new JLabel("Enter Second Number:");
        label2.setBounds(20, 60, 150, 30);
        frame.add(label2);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(170, 60, 150, 30);
        frame.add(num2Field);

        String[] operations = { "Addition", "Subtraction", "Multiplication", "Division" };
        JComboBox<String> operationBox = new JComboBox<>(operations);
        operationBox.setBounds(20, 100, 300, 30);
        frame.add(operationBox);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 140, 120, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Result will appear here...");
        resultLabel.setBounds(20, 180, 300, 30);
        frame.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(num1Field.getText());
                    float num2 = Float.parseFloat(num2Field.getText());
                    String operation = (String) operationBox.getSelectedItem();

                    resultLabel.setText("Calculating...");
                    
                    // Create a new thread to handle delay without freezing GUI
                    new Thread(() -> {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }

                        float result = 0;
                        boolean error = false;

                        switch (operation) {
                            case "Addition":
                                result = num1 + num2;
                                break;
                            case "Subtraction":
                                result = num1 - num2;
                                break;
                            case "Multiplication":
                                result = num1 * num2;
                                break;
                            case "Division":
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    error = true;
                                }
                                break;
                        }

                        if (error) {
                            resultLabel.setText("Error: Division by zero!");
                        } else {
                            resultLabel.setText("Result: " + result);
                        }
                    }).start();

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}
