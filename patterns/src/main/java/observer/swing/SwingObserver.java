package observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class SwingObserver.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class SwingObserver {

    private JFrame jFrame;

    public static void main(String[] args) {
        SwingObserver swingObserver = new SwingObserver();
        swingObserver.go();
    }

    /**
     * Method go - starts GUI app.
     */
    public void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("Sould I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
    }

    /**
     * Class AngelListener.
     *
     * @author Konstantin Alekseev.
     * @version 1.0.
     * @since 17.10.2017.
     */
    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don`t do it, you might regret it!");
        }
    }

    /**
     * Class DevilListener.
     *
     * @author Konstantin Alekseev.
     * @version 1.0.
     * @since 17.10.2017.
     */
    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}



