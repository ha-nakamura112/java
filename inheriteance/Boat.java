package inheriteance;

public class Boat extends Vehicle {

  Boat(String color,String type){
    super(color,type);
  }
  
  public static void main(String[] args) {

  }

  public void go(){
    System.out.println("The boat is moving");
  }
}
