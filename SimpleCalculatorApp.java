import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorApp extends JFrame implements ActionListener {
    
    private JTextField displayField;
    private double num1, num2, result;
    private char operator;

    public SimpleCalculatorApp() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculatorApp());
    }
}
