import javax.swing.*;
import java.awt.*;

public class HeartText extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        g.setColor(new Color(255, 182, 193)); // Light pink
        g.setFont(new Font("Arial", Font.BOLD, 8));

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int scale = 11; scale <= 16; scale++) {
            for (int i = 0; i < 120; i++) {

                double angle = i * 2 * Math.PI / 120;

                double x = 16 * Math.pow(Math.sin(angle), 3);
                double y = 13 * Math.cos(angle)
                        - 5 * Math.cos(2 * angle)
                        - 2 * Math.cos(3 * angle)
                        - Math.cos(4 * angle);

                int drawX = centerX + (int) (x * scale);
                int drawY = centerY - (int) (y * scale);

                g.drawString("I love you", drawX, drawY);
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Heart");
        HeartText panel = new HeartText();

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}