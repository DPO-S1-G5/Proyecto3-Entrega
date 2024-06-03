package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class PanelConScroll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Botones con Scroll Vertical");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel con un BoxLayout vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crear un JScrollPane con desplazamiento vertical y agregar el panel al JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Agregar botones al panel (agrega tantos como desees)
        for (int i = 1; i <= 20; i++) {
            panel.add(new JButton("Botón " + i));
        }

        frame.add(scrollPane);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

