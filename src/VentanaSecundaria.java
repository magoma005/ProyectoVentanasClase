import javax.swing.*;
import java.awt.*;

public class VentanaSecundaria extends JFrame {

    public VentanaSecundaria() {
        setTitle("ANUNCIO VE A VER SUPERMAN");

        JOptionPane.showMessageDialog(this, "VE A VER SUPERMAN ESTE 8 DE JULIO");

        // Establecer layout general
        setLayout(new BorderLayout());

        // Crear un JLabel con la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/12.jpg"));
        JLabel labelImagen = new JLabel(imagen);
        add(labelImagen, BorderLayout.CENTER);
        //Boton Ok de la imagen
        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(e -> dispose()); // Cierra la ventana al presionarlo
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnOK);
        add(panelBoton, BorderLayout.SOUTH);


        // Ajustar tamaño automático al contenido
        pack();

        // Establecer otras configuraciones
        setLocationRelativeTo(null); // Centrar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
