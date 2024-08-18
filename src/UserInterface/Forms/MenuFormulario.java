package UserInterface.Forms;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import UserInterface.Style;
import javax.swing.SwingUtilities;
import UserInterface.CustomerBotton.ALButton;

public class MenuFormulario extends JFrame {
    ALMenuPanel alMenuPnlInicioApp;

    JPanel ALPanel = new JPanel();

    public MenuFormulario(String titulo) {
        JFrame alMenuInicioForm = new JFrame();
        customizeComponentJFrame(titulo);
        colocarlPanel();
        colocaeEtiquetas();
        colocarBotones();
    }

    private void customizeComponentJFrame(String titulo) {
        this.setSize(800, 600);
        setTitle(titulo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void colocarlPanel() {
        ALPanel.setLayout(null);
        ALPanel.setBackground(Style.COLOR_FONT);
        this.getContentPane().add(ALPanel);
    }

    private void colocaeEtiquetas() {
        JLabel AL_Bienvenida = new JLabel("Bienvenido");
        JLabel AL_IniciarSecion = new JLabel("Click para iniciar secion");

        ALPanel.add(AL_Bienvenida);
        ALPanel.add(AL_IniciarSecion);

        AL_Bienvenida.setBounds(300, 120, 200, 80);
        AL_IniciarSecion.setBounds(300, 300, 170, 80);

        AL_Bienvenida.setFont(Style.Font_Normal);
    }

    private void colocarBotones() {
        ALButton AL_btnIniciarSecion = new ALButton("Log in");
        ALPanel.add(AL_btnIniciarSecion);
        // AL_btnIniciarSecion.addActionListener(e -> showEscaneoPanel());
    }

    //Esto toca hacer
    // public void showEscaneoPanel(){
    //     JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
    //     if (frame != null) {
    //         frame.setContentPane(new ALUserLogin(this)); // Pasar 'this' para el botón 'Regresar al menu'
    //         frame.revalidate();
    //         frame.repaint();
    //     }

    // }



}
