import javax.swing.*;
import java.awt.*;

public class FiguresSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Тіктөртбұрыш
        g.drawRect(50, 50, 150, 100);
        g.drawString("Тіктөртбұрыш", 80, 45);

        // Шеңбер
        g.drawOval(250, 50, 100, 100);
        g.drawString("Шеңбер", 270, 45);

        // Сызық
        g.drawLine(50, 200, 300, 200);
        g.drawString("Сызық", 150, 190);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуралар салу");
        FiguresSwing panel = new FiguresSwing();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}