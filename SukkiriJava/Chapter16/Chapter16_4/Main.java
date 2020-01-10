import java.awt.FlowLayout;
import javax.swing.*;
public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("‚Í‚¶‚ß‚Ä‚ÌGUI");
    JLabel label = new JLabel("Hello World!!");
    JButton button = new JButton("‰Ÿ‚µ‚Ä‚Ë");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}