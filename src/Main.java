public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);

            // Mostrar la ventana secundaria al iniciar
            VentanaSecundaria secundaria = new VentanaSecundaria();
            secundaria.setVisible(true);
        });
    }
}
