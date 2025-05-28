import javax.swing.*;


public class Main extends JFrame {
    private JPanel MainPanel;
    private JButton CerrarButton;
    private JButton UsuarioButton;
    private JButton OpcionesButton;

    public Main() {
        setContentPane(MainPanel); // Carga el diseño del formulario
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza la ventana
        setLocationRelativeTo(null); // Centra la ventana (opcional si está maximizada)
        setVisible(true);
        UsuarioButton.addActionListener(e -> new Usuario());

    }

    public static void main(String[] args) {
        new Main();
    }

}