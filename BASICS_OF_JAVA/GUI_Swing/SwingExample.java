package BASICS_OF_JAVA.GUI_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed

        // Create a JPanel (container for components) to hold the button
        JPanel panel = new JPanel();

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
