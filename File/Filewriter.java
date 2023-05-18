package File;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("poem.txt");
      fw.write("roses are red");
      fw.write("Violets are blue");
      fw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  

  }
}
