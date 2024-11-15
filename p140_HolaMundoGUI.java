import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGUI extends JFrame {
    private JLabel lblsaludo;

    public p140_HolaMundoGUI(){
        setLayout(null);
        lblsaludo = new JLabel("Hola Mundo");
        lblsaludo.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 60));
        lblsaludo.setBounds(10,70,400,40);
        add(lblsaludo);
        setTitle("Mi primer programa de interfaz grafica ");
    }
    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(0,0,700,300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}