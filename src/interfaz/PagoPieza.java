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

public class PagoPieza {
	JFrame ventana;
	public PagoPieza() {
		ventana = new JFrame("Pago de pieza");
		JPanel panel = new JPanel(new GridLayout(11, 2));
		
		URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	
    	URL urlRegistrarEmpleado = Consola.class.getResource("/interfaz/ImagenesInterfaz/pago_de_pieza.png");
    	ImageIcon registrarEmpleado = new ImageIcon(urlRegistrarEmpleado);
    	
    	
		for (int i = 1; i <= 22; i++) {
			Component componente = null;
			switch(i) {
			case 1:
				componente = new JLabel(registrarEmpleado);
				break;
			case 2:
				componente = new JLabel(logo);
				break;
			case 5:
				Font fontLabelR = new Font("Arial", Font.BOLD, 20);
				componente = new JLabel("Registrar pago de pieza");
				componente.setFont(fontLabelR);
				componente.setBackground(Color.DARK_GRAY);
				break;
			case 7:
				componente =  new JTextField("Id pieza");
				break;
			case 9:
				componente =  new JButton("Registrar");
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
	        new PagoPieza();
	}

}
