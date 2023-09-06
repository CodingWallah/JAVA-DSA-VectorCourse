import javax.swing.*;
import java.awt.event.*;

public class TxtInputListener implements ActionListener {
    JTextField textField;
    JLabel label;

    public TxtInputListener() {
        JFrame frame = new JFrame("Text Field Example");
        textField = new JTextField(10);
        label = new JLabel("No input yet");
        JButton button = new JButton("Submit");
        button.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        label.setText("You entered: " + input);
    }

    public static void main(String[] args) {
        new TxtInputListener();
    }
}

