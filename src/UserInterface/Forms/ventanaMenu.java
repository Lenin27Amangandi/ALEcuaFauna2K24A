package UserInterface.Forms;

import java.awt.Color;
import java.text.NumberFormat.Style;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

// import UserInterface.Style;

public class ventanaMenu extends JFrame {

    JPanel ALPanel = new JPanel();

    // Constructor
    public ventanaMenu() {
        // This ventana es como la mesa
        JFrame ventana = new JFrame();
        this.setSize(800, 600);
        // this.setBounds(100, 100, 200, 200);
        setTitle("2K24 Hormiguero");
        this.setLocationRelativeTo(null);

        // this.getContentPane().setBackground(Style.COLOR_FONT); // colorear
        // lapantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        colocarPanales();
        colocarLabel();
        colocarBotones();
        comboTipoAlimento();
    }

    public void colocarPanales() {
        // Para poner el panel en la ventano se debe hacer esto el add
        ALPanel.setLayout(null);
        // ALPanel.setBackground(Style.COLOR_FONT); //Colorear pantalla
        this.getContentPane().add(ALPanel);
    }

    private void colocarLabel() {

        JLabel AL_LabelCedula = new JLabel("Cedula: ");
        JLabel AL_LabelNombre = new JLabel("Nombres: ");
        JLabel AL_LabelCed = new JLabel("1753193928");
        JLabel AL_LabelNom = new JLabel("Lenin Amangandi");

        ALPanel.add(AL_LabelCedula);
        ALPanel.add(AL_LabelNombre);
        ALPanel.add(AL_LabelNom);
        ALPanel.add(AL_LabelCed);

        AL_LabelCedula.setBounds(400, 20, 70, 20);
        AL_LabelCedula.setForeground(Color.BLACK);
        AL_LabelCed.setBounds(480, 20, 100, 20);
        AL_LabelCed.setForeground(Color.black);

        AL_LabelNombre.setBounds(400, 50, 70, 20);
        AL_LabelNombre.setForeground(Color.BLACK);
        AL_LabelNom.setBounds(480, 50, 100, 20);
        AL_LabelNom.setForeground(Color.black);

        AL_LabelCed.setOpaque(true);
        AL_LabelCedula.setOpaque(true);
        AL_LabelNom.setOpaque(true);
        AL_LabelNombre.setOpaque(true);

        // AL_LabelCed.setBackground(Style.COLOR_BACKGROUND);
        AL_LabelCed.setBackground(new Color(0x014f01));
        AL_LabelNom.setBackground(new Color(0xf7c207));

        // AL_LabelCedula.setFont(Style.FONT_BOLD);
        // AL_LabelNombre.setFont(Style.FONT_BOLD);
        // AL_LabelCed.setFont(Style.FONT_BOLD);
        // AL_LabelNom.setFont(Style.FONT_BOLD);

    }

    private void colocarBotones() {

        // Creamos los botones
        JButton AL_CrearHormiga = new JButton("Crear Hormiga Larva");
        JButton AL_AlimentarGeno = new JButton("Alimentar con Geno Alimento");
        JButton AL_AlimentoIngesta = new JButton("Alimento Ingesta Nativa");
        JButton AL_Eliminar = new JButton("Eliminar");
        JButton AL_Guardar = new JButton("Guardar");
        // Ponemos la fuente y tipo de letra
        AL_CrearHormiga.setBackground(Color.LIGHT_GRAY);
        AL_AlimentoIngesta.setBackground(Color.LIGHT_GRAY);
        AL_AlimentarGeno.setBackground(Color.LIGHT_GRAY);

        // ponemos las ubicaciones
        AL_CrearHormiga.setBounds(480, 100, 200, 30);
        AL_AlimentarGeno.setBounds(480, 350, 200, 30);
        AL_AlimentoIngesta.setBounds(480, 395, 200, 30);
        AL_Guardar.setBounds(480, 480, 150, 30);
        AL_Eliminar.setBounds(200, 480, 150, 30);

        // Añadimos los botones al panel
        ALPanel.add(AL_CrearHormiga);
        ALPanel.add(AL_AlimentarGeno);
        ALPanel.add(AL_AlimentoIngesta);
        ALPanel.add(AL_Guardar);
        ALPanel.add(AL_Eliminar);
        ALPanel.add(AL_CrearHormiga);

    }

    private void comboTipoAlimento() {
        String[] genoAlimento = { "<GenoAlimento>", "X", "XX", "XY" };
        JComboBox listaDesplegrableGA = new JComboBox(genoAlimento);
        listaDesplegrableGA.setBounds(150, 350, 200, 30);
        ALPanel.add(listaDesplegrableGA);

        // Añadir desde el inicio
        listaDesplegrableGA.setSelectedIndex(0);
        // Añadir mas objetos
        listaDesplegrableGA.addItem("XYZ");

        String[] alimentoNativo = { "<Alimento Nativo>", "Carnivoro", "Herbiboro", "Insectivoro", "Omnivoro" };
        JComboBox listaDesplegrableAN = new JComboBox(alimentoNativo);
        listaDesplegrableAN.setBounds(150, 395, 200, 30);
        ALPanel.add(listaDesplegrableAN);

        listaDesplegrableAN.addItem("Flowtivero");
    }

}
