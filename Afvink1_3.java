import javax.swing.*;
import java.awt.*;

public class Afvink1_3 extends JFrame {
    JLabel label;
    JTextField textfield;

    public static void main(String[] args) {
        Afvink1_3 frame = new Afvink1_3();
        frame.setSize(300, 75);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        // basic
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        // label
        label = new JLabel("INPUT1");
        // textfield
        textfield = new JTextField("Hi! Enter the input here");
        // add elements to window
        window.add(label);
        window.add(textfield);

    }
}
