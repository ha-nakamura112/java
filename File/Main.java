package File;
import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // File file = new File("C:\\Users\\bknb1\\OneDrive\\デスクトップ\\test_java\\File\\test.txt");
    // if(file.exists()){
    //   System.out.println("File exists");
    //   System.out.println(file.exists());
    //   file.delete();
    //   System.out.println(file.getAbsolutePath());
    // }else{
    //   System.out.println("File does not exist");
    // }

    // try {
    //   FileWriter fw = new FileWriter("File/poem.txt");
    //   fw.write("roses are red\n");
    //   fw.append("this should be the last");
    //   fw.write("Violets are blue");
    //   fw.close();
    // } catch (Exception e) {
    //   System.out.println(e);
    //   e.printStackTrace();
    // }

    try {
      // path name starts from one upper direction
      FileReader fr = new FileReader("File/poem.txt");
      int data = fr.read();
      while(data != -1){
        System.out.print((char)data);
        // println -> print line by line
        data = fr.read();
        //if int = -1, it means there is no more data to be read
      }
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }catch ( IOException e){
      e.printStackTrace();
    }
  }
}
