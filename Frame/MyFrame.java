package Frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

  MyFrame(){
    this.setTitle("This is the title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(220, 220);
    this.setVisible(true);
    
    this.getContentPane().setBackground(Color.ORANGE);
    ImageIcon icon = new ImageIcon("Frame//logo.jpeg");
    this.setIconImage(icon.getImage());
  }
}
