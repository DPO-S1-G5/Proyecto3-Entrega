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

public class VentanaInicio extends JFrame{
	public VentanaInicio() {

        JFrame ventana = new JFrame("Registro Galería");

        JPanel panel = new JPanel(new GridLayout(8, 3));

        //Logo, "¿Ya estas registrado?", boton "Ingresar" y "Crear cuenta nueva" 
        for (int i = 1; i <= 9; i++) {
        	//Componente que se va a agregar al panel
        	Component componente = null;
        	//URLs de imagenes
        	URL urlLogoYNombre = Consola.class.getResource("/interfaz/ImagenesInterfaz/logo_y_nombre.png");
        	ImageIcon logoYNombre = new ImageIcon(urlLogoYNombre);
        	URL urlIngresar = Consola.class.getResource("/interfaz/ImagenesInterfaz/ingresar.png");
        	ImageIcon ingresar = new ImageIcon(urlIngresar);
        	URL urlCrearCuentaNueva = Consola.class.getResource("/interfaz/ImagenesInterfaz/crear_cuenta_nueva.png");
        	ImageIcon crearCuentaNueva = new ImageIcon(urlCrearCuentaNueva);
        		
        	if(i == 1) {
        		componente = new JLabelImagenAjustada(logoYNombre);
        	}
        	else if (i == 2) {
        		componente = new JLabel("¿Ya estas registrado?"); 
        		((JLabel) componente).setHorizontalAlignment(SwingConstants.CENTER);
                ((JLabel) componente).setVerticalAlignment(SwingConstants.BOTTOM);
                    
        	}
        	else if (i == 5) {
        		componente = new JButton(ingresar);
                ((AbstractButton) componente).addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Crear una nueva ventana o diálogo
                    	ventana.setVisible(false);
                        new Login();
                    }
                });
        	}
        	else if (i == 8) {
        		componente = new JLabel(crearCuentaNueva);       
        		
        	}
        	else {
        		componente = new JLabel("");
        	}            
            
			panel.add(componente);
		
        }
        
      for (int i = 1; i <= 11; i++) {
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
            	nombreDato = new JLabel("Correo");
            	campo =  new JTextField("");
                break;
            case 4:
            	nombreDato = new JLabel("Cédula");
            	campo =  new JTextField("");
                break;
            case 5:
            	nombreDato = new JLabel("Tipo de tarjeta de crédito");
            	campo =  new JTextField("");
                break;
            case 6:
            	nombreDato = new JLabel("Teléfono");   
            	campo =  new JTextField("");
            case 7:
            	nombreDato = new JLabel("Número de tarjeta de credito");
            	campo =  new JTextField("");
                break;
            case 8:
            	nombreDato = new JLabel("Fecha de nacimiento (dd/MM/yyyy)");
            	campo =  new JTextField("");
            	break;
            case 9:
            	nombreDato = new JLabel("Usuario");
            	campo =  new JTextField("");
                break;
            case 10:
            	nombreDato = new JLabel("Contraseña");
            	campo =  new JTextField("");
                break;
            default:
                nombreDato = new JLabel("");
                campo =  new JButton("Crear cuenta");
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
	        new VentanaInicio();
	    }
}
