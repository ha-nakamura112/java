package inheriteance;

//child class
public class Bicycle extends Vehicle{
  int wheels = 2;
  int paddles = 2;

  Bicycle(String color,String type){
    super(color,type);
  }
  
  public void go(){
    System.out.println("The bike is moving");
  }
}
