package interfaz;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AgregarConductor extends JFrame{
	public AgregarConductor() {

        JFrame ventana = new JFrame("Agregar conductor");

        JPanel panel = new JPanel(new GridLayout(8, 3));

        //Logo, "¿Ya estas registrado?", boton "Ingresar" y "Crear cuenta nueva" 
        for (int i = 1; i <= 9; i++) {
        	//Componente que se va a agregar al panel
        	Component componente = null;
        	//URLs de imagenes
        	URL urlAgregarConductor = Consola.class.getResource("/proyecto_alquiler_carros_Consola/ImagenesInterfaz/agregar_conductor.png");
        	ImageIcon agregarConductor = new ImageIcon(urlAgregarConductor);
        	
        	URL urlCrearCuentaNueva = Consola.class.getResource("/proyecto_alquiler_carros_Consola/ImagenesInterfaz/crear_cuenta_nueva.png");
        	ImageIcon crearCuentaNueva = new ImageIcon(urlCrearCuentaNueva);
        		
        	if(i == 1) {
        		componente = new JLabelImagenAjustada(agregarConductor);
        	}
        	else if (i == 8) {
        		componente = new JLabel(agregarConductor);       
        		
        	}
        	else {
        		componente = new JLabel("");
        	}            
            
			panel.add(componente);
		
        }
        
      for (int i = 1; i <= 15; i++) {
        	JLabel nombreDato;
        	Component campo = null;
        	
        	switch (i) {
            case 1:
                nombreDato = new JLabel("Nombre");
                campo =  new JTextField("");
                break;
            case 2:
            	nombreDato = new JLabel("Nacionalidad");
            	campo =  new JTextField("");
                break;
            case 3:
            	nombreDato = new JLabel("Lugar expedición licencia");
            	campo =  new JTextField("");
                break;
            case 4:
            	nombreDato = new JLabel("Correo");
            	campo =  new JTextField("");
                break;
            case 5:
            	nombreDato = new JLabel("Cédula");
            	campo =  new JTextField("");
                break;
            case 6:
            	nombreDato = new JLabel("Tipo de tarjeta de crédito");
            	campo =  new JTextField("");
                break;
            case 7:
            	nombreDato = new JLabel("Teléfono");   
            	campo =  new JTextField("");
            case 8:
                nombreDato = new JLabel("Número de licencia");
                campo =  new JTextField("");
                break;
            case 9:
            	nombreDato = new JLabel("Número de tarjeta de credito");
            	campo =  new JTextField("");
                break;
            case 10:
            	nombreDato = new JLabel("Fecha de nacimiento (dd/MM/yyyy)");
            	campo =  new JTextField("");
            	break;
            case 11:
            	nombreDato = new JLabel("Fecha de expedición licencia (dd/MM/yyyy)");
            	campo =  new JTextField("");
            	break;
            case 12:
            	nombreDato = new JLabel("Fecha de vencimiento tarjeta (dd/MM/yyyy)");
            	campo =  new JTextField("");
            	break;
            case 13:
            	nombreDato = new JLabel("Usuario");
            	campo =  new JTextField("");
                break;
            case 14:
            	nombreDato = new JLabel("Contraseña");
            	campo =  new JTextField("");
                break;
            default:
                nombreDato = new JLabel("");
                campo =  new JButton("Agregar");
        }
     	
        	JPanel panel2 = new JPanel(new GridLayout(2, 1));
        	panel2.add(nombreDato);
        	panel2.add(campo);
            panel.add(panel2);
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
	        new AgregarConductor();
	    }
}