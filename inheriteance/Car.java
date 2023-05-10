package inheriteance;

public class Car extends Vehicle{
  int wheels = 4;
  int doors = 4;
  String name;

  @Override  
  void stop(){
    System.out.println("The car is stopped");
  }

  public void go(){
    System.out.println("The car is moving");
  }

  Car(String name, String color, String type){
    super(color, type);
    this.name = name;
  }

  public String toString(){
    return super.toString()+" "+ name;
  }
  
}
