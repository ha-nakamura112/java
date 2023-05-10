import javax.swing.JOptionPane;
// sysout -> System.out.println

public class joption {
  public static void main(String[] args){

    // String name = JOptionPane.showInputDialog("Enter your name");
    // JOptionPane.showMessageDialog(null, "Hello "+name);

    // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    // JOptionPane.showMessageDialog(null, "Your age is "+age);

    // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    // JOptionPane.showMessageDialog(null, "Your height is "+height+"cm tall");

    // double x = 3.14;
    // double y = 10;
    // double z = Math.sqrt(y);
    // System.out.println(z);

    double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the first side length"));
    double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the second side length"));
 
    double z = Math.sqrt(y*y + x*x);
    JOptionPane.showMessageDialog(null,"Your triangle hypotenuse length is "+ String.format("%.1f", z));


  }
}
