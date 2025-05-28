import javax.swing.*;

public class Usuario  extends JFrame{
    private JLabel PasswordUsuario;
    private JLabel NombreUsuario;
    private JTextField NombreTextField;
    private JTextField PasswordTextField;
    private JTextField CorreoTextField;
    private JButton AgregarButton;
    private JTable UsuarioTable;
    private JPanel UsuarioPanel;

    public Usuario() {
        setContentPane(UsuarioPanel); // Carga el diseño del formulario
        setTitle("Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza la ventana
        setLocationRelativeTo(null); // Centra la ventana (opcional si está maximizada)
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
