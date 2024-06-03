package interfaz;

import java.awt.Component;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
		JFrame ventana = new JFrame("Login");
		JPanel panel = new JPanel(new GridLayout(5, 3));
		
		Component nombreDato = null;
    	Component campo = null;
    	
    	URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo_y_nombre.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	URL urlIniciarSesion = Consola.class.getResource("/interfaz/ImagenesInterfaz/iniciar_sesion.png");
    	ImageIcon iniciarSesion = new ImageIcon(urlIniciarSesion);
    	URL urlLogin = Consola.class.getResource("/interfaz/ImagenesInterfaz/login.png");
    	ImageIcon login = new ImageIcon(urlLogin);
    	
    	
    	
		for (int i = 1; i <= 15; i++) {
			JPanel panel2 = null;
			switch(i) {
			case 1:
				nombreDato = new JLabelImagenAjustada(logo);
				panel.add(nombreDato);
				break;
			case 5:
				nombreDato = new JLabel(iniciarSesion);
				panel.add(nombreDato);
				break;
			case 8:
				panel2 = new JPanel(new GridLayout(2, 1));
				nombreDato = new JLabel("Usuario");
				campo = new JTextField("");
	        	panel2.add(nombreDato);
	        	panel2.add(campo);
				panel.add(panel2);
				break;
			case 11:
				panel2 = new JPanel(new GridLayout(2, 1));
				nombreDato = new JLabel("Contraseña");
				campo = new JTextField("");
	        	panel2.add(nombreDato);
	        	panel2.add(campo);
				panel.add(panel2);
				break;
			case 14:
				nombreDato = new JButton(login);
				panel.add(nombreDato);
				break;
			default:
				nombreDato = new JLabel("");
				panel.add(nombreDato);
			}
			
		}
	    // Agregar el panel al JFrame
	    ventana.add(panel);

	    // Definir el tamaño de la ventana
	    ventana.setSize(1000, 600);

	    // Hacer que la ventana se cierre al presionar el botón de cierre (X)
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Hacer que la ventana sea visible
	    ventana.setVisible(true);

	}
	
	public static void main(String[] args) {
        new Login();
    }

}
