import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeColorSelectorApp extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;

    public ThemeColorSelectorApp() {
        setTitle("Theme Color Selector");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":   mainPanel.setBackground(Color.decode("#ff3232"));   break;
            case "GREEN": mainPanel.setBackground(Color.decode("#c5f7a5")); break;
            case "BLUE":  mainPanel.setBackground(Color.decode("#cce9ff"));  break;
        }
    }
}