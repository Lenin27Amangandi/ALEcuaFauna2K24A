package UserInterface.Forms;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

import UserInterface.Style;

import javax.swing.ImageIcon;

public abstract class SplashAPP {
    private static JFrame ALVentanaSplahs;
    private static JLabel ALPanelSplash;
    private static JProgressBar prbLoaging;
    private static ImageIcon icoImagen;

    public static void show() {
        ALVentanaSplahs = new JFrame();
        icoImagen = new ImageIcon(Style.URL_SPLASH);
        ALPanelSplash = new JLabel(icoImagen);
        prbLoaging = new JProgressBar(0, 100);

        prbLoaging.setStringPainted(true);

        ALVentanaSplahs.setUndecorated(true);
        ALVentanaSplahs.getContentPane().add(ALPanelSplash, BorderLayout.CENTER);
        ALVentanaSplahs.getContentPane().add(prbLoaging, BorderLayout.SOUTH);
        ALVentanaSplahs.setSize(icoImagen.getIconWidth(), icoImagen.getIconHeight());
        ALVentanaSplahs.setLocationRelativeTo(null);
        ALVentanaSplahs.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prbLoaging.setValue(i);
        }
        ALVentanaSplahs.setVisible(false);

    }

}
