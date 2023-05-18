package Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// import javax.swing.ImageIcon;
// import java.awt.Color;


public class Main {
  public static void main(String[] args) {

    // MyFrame myFrame = new MyFrame();

    ImageIcon icon = new ImageIcon("Frame//logo.jpeg");
    

    JLabel jLabel = new JLabel();
    jLabel.setText("Bro, do you even code?");// set text of label
    jLabel.setIcon(icon);
    jLabel.setHorizontalAlignment(JLabel.CENTER);
    jLabel.setVerticalTextPosition(JLabel.TOP);
    

    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(jLabel);




    // this.setTitle("This is the title");
    // this.setDefaultCloseOperation(Jthis.EXIT_ON_CLOSE);
    // this.setResizable(false);
    // this.setSize(420, 420);
    // this.setVisible(true);
    
    // this.getContentPane().setBackground(Color.ORANGE);
    // ImageIcon icon = new ImageIcon("this//logo.jpeg");
    // this.setIconImage(icon.getImage());

    }
}
