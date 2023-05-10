import java.util.ArrayList;
import java.util.HashMap;

public class forEach {
  public static void main(String[] args) {
    // String[] animals = {"cat", "dog", "rat" };
    ArrayList<String> animals = new ArrayList<String>();
    HashMap<String> books = new HashMap<String>(0, 0)

    animals.add("cat");
    animals.add("dog");
    animals.add("rat");

    //can't access to index
    // for(String i :animals){
    //   System.out.println(i);
    // }

    for(int i=0; i <= animals.size()+1;i++){
      System.out.println(animals.get(i));
      System.out.println(i);
    }
  }
}
