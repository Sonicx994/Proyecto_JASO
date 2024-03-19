import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private Image imagenFondo;

    public Main() {
        // Carga la imagen de fondo
        ImageIcon icono = new ImageIcon("C:\\\\Users\\\\Javier\\\\Desktop\\\\Entornos de Desarrollo\\\\asd.png");
        System.out.println("DarDealta a jugador viva el betis joder que guapo yiahtgyutgyugugyu");
        imagenFondo = icono.getImage();

        // Configura la ventana
        setTitle("Ventana de One Piece");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un panel con un fondo de imagen
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen de fondo en el panel
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), null);
            }
        };
        // Configura el layout del panel principal
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        // Crea un botón para lanzar el mensaje "Muwigara"
        JButton boton = new JButton("Presiona para comprobar si eres un mugiwara");
        // Configura el tamaño preferido del botón
        boton.setPreferredSize(new Dimension(300, 50));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Muwigara");
            }
        });
        // Agrega el botón al panel
        panel.add(boton);

        // Agrega el panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
