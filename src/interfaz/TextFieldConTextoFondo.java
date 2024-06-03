package interfaz;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import java.awt.Color;

public class TextFieldConTextoFondo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField con Texto de Fondo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear JTextField para el texto de fondo
        JTextField fondoTextField = new JTextField("Texto de fondo");
        fondoTextField.setFocusable(false);
        fondoTextField.setForeground(new Color(150, 150, 150));

        // Crear JTextField para el texto del usuario
        JTextField usuarioTextField = new JTextField();
        
        // Utilizar OverlayLayout para superponer los dos textfields
        OverlayLayout overlayLayout = new OverlayLayout(frame.getContentPane());
        frame.setLayout(overlayLayout);

        frame.add(fondoTextField);
        frame.add(usuarioTextField);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}

