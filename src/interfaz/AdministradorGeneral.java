package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AdministradorGeneral extends JFrame {
	public AdministradorGeneral() {
		JFrame ventana = new JFrame("Administrador");
		
    	URL urlCarro = Consola.class.getResource("/interfaz/ImagenesInterfaz/imagenGaleria.png");
    	ImageIcon carro = new ImageIcon(urlCarro);
    	
    	URL urlLogo = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo.png");
    	ImageIcon logo = new ImageIcon(urlLogo);
    	
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JButton("Cerrar sesión"), BorderLayout.SOUTH);
		panel.add(new JLabel(carro), BorderLayout.CENTER);
   
    	
     	
		JPanel panelSuperior = new JPanel(new FlowLayout());
		JPanel panelIzquierdo = new JPanel(new GridLayout(2,1));
		

		
        
        for (int i = 1; i <= 2; i++) {
        	switch(i) {
        	case 1:
        		Font fontAdministradorGeneral = new Font("Arial", Font.BOLD, 50);
            	JLabel administradorGeneral = new JLabel("Administrador");
            	administradorGeneral.setFont(fontAdministradorGeneral);
            	administradorGeneral.setHorizontalAlignment(SwingConstants.CENTER);
            	panelIzquierdo.add(administradorGeneral);
            	break;
        	case 2:
        		Font fontBienvenido = new Font("Arial", Font.BOLD, 30);
            	JLabel bienvenido = new JLabel("Bienvenido a la vista del Administrador");
            	bienvenido.setFont(fontBienvenido);
            	bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
            	bienvenido.setVerticalAlignment(SwingConstants.TOP);
            	panelIzquierdo.add(bienvenido);
            	break;
        	}
        	
        }
        
        for (int i = 1; i <= 5; i++) {
        	Component label = null;
        	switch(i) {
        	case 1:
        		label = new JLabel(logo);
        		panelSuperior.add(label);
        		break;
        	case 2:
        		label = new JButton("Solicitudes de compra");
        		((AbstractButton) label).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	// Crear una nueva ventana o diálogo
                    	new SolicitudesCompra();
                    }
                });
        		panelSuperior.add(label);
        		break;
        	case 3:
        		label = new JButton("Devolcuiones");
        		((AbstractButton) label).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Devoluciones();
                    }
                });
        		panelSuperior.add(label);
        		break;
        	case 4:
        		label = new JButton("Subastas");
        		((AbstractButton) label).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	new Subastas();
                    }
                });
        		panelSuperior.add(label);
        		break;
        }
        }
        
		panel.add(panelSuperior, BorderLayout.NORTH);     
        panel.add(panelIzquierdo, BorderLayout.WEST);
        ventana.add(panel);
		
		// Definir el tamaño de la ventana
        ventana.setSize(1200, 700);

        // Hacer que la ventana se cierre al presionar el botón de cierre (X)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        ventana.setVisible(true);
        
	}
	
	 public static void main(String[] args) {
	        new AdministradorGeneral();
	}

}
