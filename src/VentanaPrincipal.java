import javax.swing.*;
import java.awt.*;
import javax.swing.JColorChooser;


public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Ventana de Miguel");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestanas = new JTabbedPane();
        //Pestaña1
        JPanel panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("\"¡Bienvenido a ArmBook!, ¿Cual es tu nombre?\"");
        panelBienvenida.add(etiqueta, BorderLayout.CENTER);

        //Pestaña2
        JPanel panelPerfil = new JPanel();
        panelPerfil.setLayout(new BorderLayout());
        JTextArea textAreaInfo = new JTextArea();
        textAreaInfo.setText("Bienvenido a tu perfil!");
        textAreaInfo.setEditable(false); // Solo lectura
        textAreaInfo.setWrapStyleWord(true); // Ajustar para palabras completas
        JScrollPane scrollInfo = new JScrollPane(textAreaInfo);
        panelPerfil.add(scrollInfo, BorderLayout.CENTER);
        pestanas.addTab("Perfil de ArmBook", panelPerfil);


        //Selector de color
        Color color = JColorChooser.showDialog(null, "Selecciona un color:", Color.WHITE);
        if (color != null) {
            panelBienvenida.setBackground(color);
        }
    }

}
