package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class PanelesIntercambiables {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Botones en Pestañas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Crear botones para las pestañas
        JButton botonPestana1 = new JButton("Pestaña 1");
        JButton botonPestana2 = new JButton("Pestaña 2");
        JButton botonPestana3 = new JButton("Pestaña 3");

        // Crear paneles para el contenido de las pestañas
        JPanel panel1 = new JPanel();
        panel1.add(new JButton("Contenido de la Pestaña 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Contenido de la Pestaña 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JButton("Contenido de la Pestaña 3"));

        // Agregar botones y paneles a las pestañas
        tabbedPane.addTab(null, panel1);
        tabbedPane.setTabComponentAt(0, botonPestana1);

        tabbedPane.addTab(null, panel2);
        tabbedPane.setTabComponentAt(1, botonPestana2);

        tabbedPane.addTab(null, panel3);
        tabbedPane.setTabComponentAt(2, botonPestana3);

        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
