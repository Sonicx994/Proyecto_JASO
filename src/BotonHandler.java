import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class BotonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // Mostrar el mensaje "Muwigara" cuando se presiona el botón
        JOptionPane.showMessageDialog(null, "Muwigara el que lo lea");
    }
}
