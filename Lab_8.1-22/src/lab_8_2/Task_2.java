package lab_8_2;

import javax.swing.*;
import java.awt.*;

public class Task_2 extends JFrame {

    public Task_2(String imagePath) {
        setTitle("Image Display");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание метки для отображения картинки
        JLabel imageLabel = new JLabel(new ImageIcon(imagePath));
        add(imageLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java ImageDisplay <image_path>");
            System.exit(1);
        }


        SwingUtilities.invokeLater(() -> {
            Task_2 app = new Task_2(args[0]);
            app.setVisible(true);
        });
    }
}
