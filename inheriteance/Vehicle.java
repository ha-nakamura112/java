package inheriteance;

//parent class
public class Vehicle {
  double speed;
  String type;
  String color;
  public static void main(String[] args) {
    
  }

  //if you write like this, the cildren's should have the same or more parameter's constructor
  Vehicle( String color, String type){
    this.color = color;
    this.type = type;
  }

  public void go(){
    System.out.println("The vehicle is moving");
  }

  public String toString(){
    return "Vehicle: " + color + " " + type + " " + speed;
  }
  
  // void go(){
  //   System.out.println("this vahicle is moving");
  // }

  void stop(){
    System.out.println("this vahicle is stoppped");
  }
}
