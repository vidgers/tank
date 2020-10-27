import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ Created with IntelliJ IDEA
 * @ Author vidgers
 * @ Version 1.0.0
 * @ Since 1.0.0
 * @ Date 2020/10/27
 * @ Time 13:04
 */
public class T {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setTitle("tank war");
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
