package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Subasta {
	public Subasta() {

		  // Crear la ventana principal
      JFrame frame = new JFrame("Subasta");
      
  	URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
  	ImageIcon logo = new ImageIcon(urlLogo);
  	
  	URL urlDisponibilidadVehicular = Consola.class.getResource("/interfaz/ImagenesInterfaz/disponibilidad_vehicular.png");
  	ImageIcon disponibilidadVehicular = new ImageIcon(urlDisponibilidadVehicular);
  	
  	URL urlDemandas = Consola.class.getResource("/interfaz/ImagenesInterfaz/demandas.png");
  	ImageIcon demandas = new ImageIcon(urlDemandas);
  	
  	URL urlVehiculo = Consola.class.getResource("/interfaz/ImagenesInterfaz/imagen_obra.jpg");
  	ImageIcon vehiculo = new ImageIcon(urlVehiculo);
  	
  	URL urlConfirmar = Consola.class.getResource("/interfaz/ImagenesInterfaz/confirmar.png");
  	ImageIcon confirmar = new ImageIcon(urlConfirmar);

      // Crear el panel principal
      JPanel panelPagina2 = new JPanel(new BorderLayout());
      
  JPanel panelSuperior = new JPanel(new FlowLayout());
  for (int i = 1; i <18; i++){
  	panelSuperior.add(new JLabel(logo));
  }
  JPanel panelIzquierdo = new JPanel(new GridLayout(8,2));
  for(int i = 1; i <= 16; i++) {
  		Component componente = null;
  		Font fontLabelSr = new Font("Arial", Font.BOLD, 20);
  		switch(i) {
  			case 2:
  				componente = new JLabel("Autor");
  				componente.setFont(fontLabelSr);
  				componente.setBackground(Color.DARK_GRAY);				
  				break;
  			case 4:
  				componente = new JLabel("Juancin");
  				break;
  			case 6:
  				componente = new JLabel("Titulo");
  				componente.setFont(fontLabelSr);
  				componente.setBackground(Color.DARK_GRAY);
  				break;
  			case 8:
  				componente = new JLabel("Flores");
  				break;				
  			case 10:
  				componente = new JLabel("Anio");
  				componente.setFont(fontLabelSr);
  				componente.setBackground(Color.DARK_GRAY);	
  				break;
  			case 12:
  				componente = new JLabel("1950");
  				break;
  			case 14:
  				componente = new JLabel("Estado");
  				componente.setFont(fontLabelSr);
  				componente.setBackground(Color.DARK_GRAY);
  				break;
  			case 16:
  				componente = new JLabel("Bodega");
  				break;
  			default:
  				componente = new JLabel("");
  				break;      				
  			}
  			panelIzquierdo.add(componente);
  		}  

  panelPagina2.add(panelIzquierdo, BorderLayout.WEST);
  panelPagina2.add(new JLabel(vehiculo), BorderLayout.CENTER);
  JPanel panelInferior = new JPanel(new FlowLayout());
  panelInferior.add(new JButton(confirmar));
  panelPagina2.add(panelInferior, BorderLayout.SOUTH);
  

  
  frame.getContentPane().add(panelPagina2);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(1200, 700); // Tamaño de la ventana  
  frame.setVisible(true);
  
	}
  
	 public static void main(String[] args) {
	        new Subasta();
	}

}