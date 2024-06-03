package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GestionarSubastas {
	JFrame ventana;
	public GestionarSubastas() {
		ventana = new JFrame("GestionarVehiculos");
		JPanel panel = new JPanel(new GridLayout(12, 2));
		
		URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	
    	URL urlGestionarVehiculos = Consola.class.getResource("/interfaz/ImagenesInterfaz/gestionar_subastas.png");
		ImageIcon gestionarVehiculos = new ImageIcon(urlGestionarVehiculos);
    	
    	
		for (int i = 1; i <= 23; i++) {
			Component componente = null;
			switch(i) {
			case 1:
				componente = new JLabel(gestionarVehiculos);
				break;
			case 2:
				componente = new JLabel(logo);
				break;
			case 5:
				Font fontLabelR = new Font("Arial", Font.BOLD, 20);
				componente = new JLabel("Registrar oferta");
				componente.setFont(fontLabelR);
				componente.setBackground(Color.DARK_GRAY);
				break;
			case 7:
				componente =  new JTextField("Id Subasta");
				break;
			case 8:
				componente =  new JTextField("Id Usuario");
				break;
			case 9:
				componente =  new JTextField("Monto a ofertar");
				break;			
			case 11:
				componente =  new JButton("Confirmar");
				break;
			case 13:
				Font fontLabelR2 = new Font("Arial", Font.BOLD, 20);
				componente = new JLabel("Iniciar subasta");
				componente.setFont(fontLabelR2);
				componente.setBackground(Color.DARK_GRAY);
				break;
			case 15:
				componente =  new JTextField("Id Pieza");
				break;			
			case 16:
				componente =  new JTextField("Monto inicial");
				break;
			case 17:
				componente =  new JButton("Confirmar");
				break;
			case 19:
				Font fontLabelD = new Font("Arial", Font.BOLD, 20);
				componente = new JLabel("Cerrar subasta");
				componente.setFont(fontLabelD);
				break;
			case 21:
				componente =  new JTextField("Id subasta");
				break;
			case 23:
				componente =  new JButton("Confirmar");
				break;
			default:
				componente = new JLabel("");
			}
			panel.add(componente);
		}
		
		ventana.add(panel);

		
		// Definir el tamaño de la ventana
        this.ventana.setSize(650, 800);

        // Hacer que la ventana se cierre al presionar el botón de cierre (X)
        this.ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Hacer que la ventana sea visible
        this.ventana.setVisible(true);
        
	}
	
	 public static void main(String[] args) {
	        new GestionarSubastas();
	}

}
