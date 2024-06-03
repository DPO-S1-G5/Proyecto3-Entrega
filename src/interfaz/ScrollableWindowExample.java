package interfaz;

import java.awt.Dimension;

import javax.swing.*;

public class ScrollableWindowExample {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Scrollable Window Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); // Tamaño de la ventana

        // Crear el panel de contenido
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 600)); // Doble del tamaño de la ventana

        // Añadir contenido al panel (por ejemplo, botones)
        for (int i = 0; i < 20; i++) {
            panel.add(new JButton("Botón " + i));
        }

        // Crear el JScrollPane y añadir el panel a él
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.getContentPane().add(scrollPane);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
