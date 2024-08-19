package UserInterface.Forms;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import ALDataAccess.DTO.ALUsuarioDTO;
import BusinessLogic.Entities.ALUsuarioBL;
import UserInterface.Style;
import UserInterface.CustomerBotton.ALButton;

public class ALUserLoginPanel extends JPanel {
    public ALButton iniciar;
    public ALButton volver;
    public JButton loginButton;
    public JTextField usuarioField;
    // public JPasswordField contraseñaField;
    public JTextField contraseñaField;

    public ALUserLoginPanel() {
        setLayout(null);
        colocarEtiquetas();
        colocarBotonesALUserPanel();
        colocarCamposTexto();
    }

    private void colocarEtiquetas() {
        JLabel AL_IniciarSecion = new JLabel("Colocar sus credenciales");
        this.add(AL_IniciarSecion);
        AL_IniciarSecion.setFont(Style.FONT_TITLE);
        AL_IniciarSecion.setBounds(100, 100, 300, 80);
    }

    public void colocarBotonesALUserPanel() {
        volver = new ALButton("Volver");
        volver.addActionListener(e -> showMenuFormulario());
        this.add(volver);
        volver.setBounds(150, 300, 100, 30);

        iniciar = new ALButton("Iniciar");
        // Agrega un ActionListener para el botón "Iniciar"
        // iniciar.addActionListener(e -> {
        // // Aquí puedes agregar la lógica para cuando se presiona el botón "Iniciar"
        // System.out.println("Botón Iniciar presionado");
        // });
        iniciar.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String contraseña = contraseñaField.getText();

            ALUsuarioBL alUsuarioBL = new ALUsuarioBL();
            try {
                List<ALUsuarioDTO> usuarios = alUsuarioBL.getAll();

                boolean usuarioEncontrado = false;
                for (ALUsuarioDTO usuarioDTO : usuarios) {
                    if (usuarioDTO.getUsuario().equals(usuario) && usuarioDTO.getContraseña().equals(contraseña)) {
                        usuarioEncontrado = true;
                    }
                }

                if (usuarioEncontrado) {
                    System.out.println("Usuario encontrado correctamente");
                    showMenuVentana();
                    // Aquí puedes agregar la lógica para cuando el usuario se autentica
                    // correctamente
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
            } catch (Exception ex) {
                System.out.println("Error al autenticar usuario: " + ex.getMessage());
            }
        });

        this.add(iniciar);
        iniciar.setBounds(260, 300, 100, 30);
    }

    private void colocarCamposTexto() {
        usuarioField = new JTextField();
        // contraseñaField = new JPasswordField();
        contraseñaField = new JTextField();

        JLabel usuarioLabel = new JLabel("Usuario:");
        JLabel contraseñaLabel = new JLabel("Contraseña:");

        this.add(usuarioLabel);
        this.add(usuarioField);
        this.add(contraseñaLabel);
        this.add(contraseñaField);

        usuarioLabel.setBounds(150, 200, 100, 20);
        usuarioField.setBounds(250, 200, 200, 20);
        contraseñaLabel.setBounds(150, 250, 100, 20);
        contraseñaField.setBounds(250, 250, 200, 20);
    }

    public void showMenuFormulario() {
        // JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        // if (frame != null) {
        // frame.removeAll(); // Elimina todos los componentes del frame
        // frame.setContentPane(new MenuFormulario(TOOL_TIP_TEXT_KEY)); // Establece el
        // nuevo contenido
        // frame.revalidate();
        // frame.repaint();
        // }

        JFrame newFrame = new JFrame("Menu Formulario");
        newFrame.setContentPane(new MenuFormulario("Pasar"));
        newFrame.pack();
        newFrame.setVisible(true);
    }

    private ventanaMenu ventana;

    public void showMenuVentana() {
        // ventanaMenu ventana = new ventanaMenu();
        // ventana.setContentPane(new Container());
        // ventana.pack();
        // ventana.setVisible(true);
        // // JFrame newFrame = new JFrame("Menu Ventana");
        // // newFrame.setContentPane(new ventanaMenu());
        // // newFrame.pack();
        // // newFrame.setVisible(true);

        ventana = new ventanaMenu();
        ventana.setVisible(true); 

        // JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        // if (frame != null) {
        //     frame.getContentPane().removeAll(); // Elimina todos los componentes del contenedor
        //     ventanaMenu ventana = new ventanaMenu();
        //     frame.getContentPane().add(ventana.ALPanel, BorderLayout.CENTER); // Agrega el panel de la ventana de menú
        //     frame.revalidate();
        //     frame.repaint();
        // }
    }
}
