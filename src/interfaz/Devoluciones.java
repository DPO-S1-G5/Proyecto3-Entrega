package interfaz;

import java.awt.BorderLayout;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Devoluciones {
	JFrame ventana;
	
	public Devoluciones() {
		JFrame ventana = new JFrame("Gestionar sedes");
		JTabbedPane tabbedPane = new JTabbedPane();
		
		URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	
    	URL urlEditarCategoria = Consola.class.getResource("/interfaz/ImagenesInterfaz/editar_categoria.png");
    	ImageIcon editarCategoria = new ImageIcon(urlEditarCategoria);
    	
    	URL urlAniadirCategoria = Consola.class.getResource("/interfaz/ImagenesInterfaz/solicitudes_actuales.png");
    	ImageIcon aniadirCategoria = new ImageIcon(urlAniadirCategoria);
    	
    	URL urlEliminarCategoria = Consola.class.getResource("/interfaz/ImagenesInterfaz/aprobar_solicitud.png");
    	ImageIcon eliminarCategoria = new ImageIcon(urlEliminarCategoria);
    		
    	
		JPanel panelAniadir = new JPanel(new GridLayout(10,2));
		JPanel panelEliminar = new JPanel(new GridLayout(10,2));
        
        for (int i = 1; i <= 20; i++) {
			Component componenteAniadir = null;
			Component componenteEliminar = null;
			switch(i) {
			case 1:
				Font fontLabelIA = new Font("Arial", Font.BOLD, 20);
				componenteAniadir = new JLabel("Ver solicitudes de devoluciones");
				componenteAniadir.setFont(fontLabelIA);
				componenteAniadir.setBackground(Color.DARK_GRAY);
				
				Font fontLabelIE = new Font("Arial", Font.BOLD, 20);
				componenteEliminar = new JLabel("Aprobar solicitudes de devoluciones");
				componenteEliminar.setFont(fontLabelIE);
				componenteEliminar.setBackground(Color.DARK_GRAY);
				panelEliminar.add(componenteEliminar);
				
				break;
			
			case 3:
				componenteAniadir = new JLabel("id solicitud");
				String[] opciones = {"Tipo actual", "Opción 2", "Opción 3", "Opción 4", "Opción 5"};
			    JComboBox<String> comboBox = new JComboBox<>(opciones);

				componenteEliminar =  new JTextField("Id solicitud");
				break;
			case 4:
				componenteAniadir = new JLabel("usuario");
				componenteEliminar = new JLabel("");
				break;
			case 5:
				componenteAniadir = new JLabel("id solicitud");
				componenteEliminar =  new JButton("Aprobar");
				break;
			case 6:
				componenteAniadir = new JLabel("usuario");
				componenteEliminar = new JLabel("");
				break;
			case 7:
				componenteAniadir = new JLabel("id solicitud");
				componenteEliminar = new JLabel("");
				break;			
			default:
				componenteAniadir = new JLabel("");
				componenteEliminar = new JLabel("");
			}
			
			panelEliminar.add(componenteEliminar);
			panelAniadir.add(componenteAniadir);
		}
        
        
		
        tabbedPane.addTab(null, panelAniadir);
        tabbedPane.setTabComponentAt(0, new JLabel(aniadirCategoria));

        tabbedPane.addTab(null, panelEliminar);
        tabbedPane.setTabComponentAt(1, new JLabel(eliminarCategoria));

        
		ventana.add(tabbedPane);
        ventana.setSize(800,950);

        // Hacer que la ventana se cierre al presionar el botón de cierre (X)
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Hacer que la ventana sea visible
        ventana.setVisible(true);
        
	}
	
	 public static void main(String[] args) {
	        new Devoluciones();
	}
}
