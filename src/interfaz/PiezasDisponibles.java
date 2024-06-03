package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PiezasDisponibles {
	JFrame ventana;
	public PiezasDisponibles() {
		ventana = new JFrame("Piezas disponibles");
		JPanel panel = new JPanel(new GridLayout(11, 2));
		
		URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	URL urlRegistrarEmpleado = Consola.class.getResource("/interfaz/ImagenesInterfaz/piezas_disponibles.png");
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
				componente = new JLabel("Piezas disponibles");
				componente.setFont(fontLabelR);
				componente.setBackground(Color.DARK_GRAY);
				break;
			case 7:
				componente =  new JLabel("Id pieza");
				break;
			case 8:
				componente =  new JButton("Pieza");
				((AbstractButton) componente).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Pieza();
                    }
                });
				break;
			case 9:
				componente =  new JLabel("Id pieza");
				break;
			case 10:
				componente =  new JButton("Pieza");
				((AbstractButton) componente).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Pieza();
                    }
                });
				break;
			case 11:
				componente =  new JLabel("Id pieza");
				break;
			case 12:
				componente =  new JButton("Pieza");
				((AbstractButton) componente).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Pieza();
                    }
                });
				break;
			case 13:
				componente =  new JLabel("Id pieza");
				break;
			case 14:
				componente =  new JButton("Pieza");
				((AbstractButton) componente).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Pieza();
                    }
                });
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
	        new PiezasDisponibles();
	}
}
