package UserInterface.Forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import BusinessLogic.Entities.ALUsuarioBL;
import UserInterface.Style;
import UserInterface.CustomerBotton.ALButton;
import UserInterface.CustomerBotton.PrjTextBox;

public class ALUserLogin extends JPanel {

    private JLabel mensajeLabel;
    public PrjTextBox userTextUsuario;
    public PrjTextBox passTextContraseña;
    public ALButton iniciar;
    public ALButton volver;
    public JButton loginButton;
    private ALUsuarioBL usuariobl = new ALUsuarioBL();
    private MenuFormulario menuFormulario;

    public ALUserLogin(MenuFormulario menuFormulario) {

        this.menuFormulario = menuFormulario;
        userTextUsuario = new PrjTextBox();
        userTextUsuario.setBackground(Style.COLOR_FONT_LIGHT);
        userTextUsuario.setForeground(Color.BLACK);
        userTextUsuario.setPreferredSize(new Dimension(200, 30));

        mensajeLabel = new JLabel("Coloque sus credenciales");
        mensajeLabel.setForeground(Style.COLOR_FONT_BG);

        // Crea el botón "volver" antes de agregar el listener
        volver = new ALButton("Volver");
        volver.addActionListener(e -> showMenuFormulario());

        setLayout(new BorderLayout());

        JPanel panelCentral = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCentral.add(mensajeLabel); // Agrega el mensajeLabel al panelCentral
        panelCentral.add(userTextUsuario);
        panelCentral.setBackground(Style.COLOR_FONT_BG);
        add(panelCentral);

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(volver);
        southPanel.setBackground(Style.COLOR_FONT_LIGHT);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void showMenuFormulario() {

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setContentPane(new MenuFormulario("Pasar")); // Pasar 'this' para el botón 'Regresar al menu'
            frame.revalidate();
            frame.repaint();
        }

    }
}
