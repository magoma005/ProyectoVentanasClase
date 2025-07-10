import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Ventana de Migue");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JTabbedPane pestanas = new JTabbedPane();

        // Pestaña 1: Bienvenida
        JPanel panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("\"¡Bienvenido a ArmBook!, ¿Cuál es tu nombre?\"");
        panelBienvenida.add(etiqueta, BorderLayout.CENTER);

        // Botón cambio color
        JButton btnCambiarColor = new JButton("Cambiar color de fondo");
        panelBienvenida.add(btnCambiarColor, BorderLayout.SOUTH);

        // ActionListener para cambiar color de fondo
        btnCambiarColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Selecciona un color", panelBienvenida.getBackground());
            if (color != null) {
                panelBienvenida.setBackground(color);
            }
        });

        pestanas.addTab("Bienvenido!!!", panelBienvenida);

        // Pestaña 2: Perfil
        JPanel panelPerfil = new JPanel();
        panelPerfil.setLayout(new BorderLayout());

        JTextArea textAreaInfo = new JTextArea();
        textAreaInfo.setText("Bienvenido a tu perfil!!!");
        textAreaInfo.setEditable(false);
        textAreaInfo.setWrapStyleWord(true);
        textAreaInfo.setLineWrap(true); // Agrega lineWrap para ajustar líneas

        JScrollPane scrollInfo = new JScrollPane(textAreaInfo);
        panelPerfil.add(scrollInfo, BorderLayout.CENTER);

        // Botón ventana secundaria
        JButton btnAbrirVentana = new JButton("Abrir ventana secundaria");
        panelPerfil.add(btnAbrirVentana, BorderLayout.SOUTH);

        pestanas.addTab("Perfil de ArmBook", panelPerfil);

        // Mostrar pestanas
        add(pestanas);
        setVisible(true);
    }
}
