import javax.swing.*;

public class VentanaSecundaria extends JFrame {

    public VentanaSecundaria() {
        setTitle("ANUNCIO VE A VER SUPERMAN");

        // Mostrar mensaje al abrirse
        JOptionPane.showMessageDialog(this, "VE A VER SUPERMAN ESTE 8 DE JULIO");

        // Crear un JLabel con la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("/12.jpg"));
        JLabel labelImagen = new JLabel(imagen);

        // Agregar la imagen al JFrame
        add(labelImagen);

        // Ajustar tamaño automático al contenido
        pack();

        // Establecer otras configuraciones
        setLocationRelativeTo(null); // Centrar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
