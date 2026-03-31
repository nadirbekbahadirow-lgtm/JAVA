import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EngineeringCalculator extends JFrame implements ActionListener {

    JTextField inputField, resultField;
    JButton sinBtn, cosBtn, tanBtn;

    public EngineeringCalculator() {
        setTitle("Инженерлік калькулятор");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        resultField = new JTextField(20);
        resultField.setEditable(false);

        sinBtn = new JButton("sin");
        cosBtn = new JButton("cos");
        tanBtn = new JButton("tan");

        sinBtn.addActionListener(this);
        cosBtn.addActionListener(this);
        tanBtn.addActionListener(this);

        add(new JLabel("Бұрыш (градус):"));
        add(inputField);
        add(sinBtn);
        add(cosBtn);
        add(tanBtn);
        add(new JLabel("Нәтиже:"));
        add(resultField);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double angle = Double.parseDouble(inputField.getText());

            // Градусты радианға ауыстыру
            double radians = Math.toRadians(angle);

            double result = 0;

            if (e.getSource() == sinBtn) {
                result = Math.sin(radians);
            } else if (e.getSource() == cosBtn) {
                result = Math.cos(radians);
            } else if (e.getSource() == tanBtn) {
                result = Math.tan(radians);
            }

            resultField.setText(String.valueOf(result));

        } catch (Exception ex) {
            resultField.setText("Қате енгізу!");
        }
    }

    public static void main(String[] args) {
        new EngineeringCalculator();
    }
}