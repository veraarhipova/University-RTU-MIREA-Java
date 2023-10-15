package lab_8_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_3 extends JFrame {
    private JLabel animationLabel;
    private ImageIcon[] animationFrames;
    private int currentFrameIndex;

    public Task_3() {
        setTitle("Animation Example");
        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Инициализация массива картинок
        animationFrames = new ImageIcon[3];
        animationFrames[0] = new ImageIcon("/Users/vera/IdeaProjects/Lab_8.1-22/src/lab_8_3/IMG_3126.jpg");
        animationFrames[1] = new ImageIcon("/Users/vera/IdeaProjects/Lab_8.1-22/src/lab_8_3/IMG_3127.jpg");
        animationFrames[2] = new ImageIcon("/Users/vera/IdeaProjects/Lab_8.1-22/src/lab_8_3/IMG_3128.jpg");

        // Создание метки для отображения картинок
        animationLabel = new JLabel();
        add(animationLabel, BorderLayout.CENTER);

        // Создание таймера для анимации
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключение на следующий кадр
                currentFrameIndex = (currentFrameIndex + 1) % animationFrames.length;
                animationLabel.setIcon(animationFrames[currentFrameIndex]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task_3 app = new Task_3();
            app.setVisible(true);
        });
    }
}
