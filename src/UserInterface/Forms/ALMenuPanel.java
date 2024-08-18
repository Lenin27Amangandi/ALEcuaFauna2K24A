package UserInterface.Forms;

import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Graphics;

import UserInterface.Style;
import UserInterface.CustomerBotton.ALButton;
import javax.swing.SwingUtilities;

public class ALMenuPanel extends JPanel {

    JPanel aPanel = new JPanel();

    public ALMenuPanel() {
        aPanel.setLayout(null);
        customizeComponet();
        // this.getContentPane().add(aPanel);
    }
    
    private void customizeComponet() {
        this.setBackground(Style.COLOR_FONT);
        this.setSize(700, 500);
        JLabel AL_Bienvenida = new JLabel("Bienvenido al progrma");
        JLabel AL_IniciarSecion = new JLabel("Iniciar Secion");
        AL_Bienvenida.setBounds(300, 400, 200, 200);
        AL_IniciarSecion.setBounds(100, 700, 200, 200);
        add(AL_IniciarSecion);
        add(AL_Bienvenida);
        ALButton AL_btnIniciarSecion = new ALButton("Login");
        AL_btnIniciarSecion.setBounds(500, 600, 200, 200);
        add(AL_btnIniciarSecion);
    }
}
