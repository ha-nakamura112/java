package inheriteance;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("BMW","white", "car");
    Car car2 = new Car("stella","yellow", "small car");
    // car.go();  
    Boat boat = new Boat("white","boat");

    Bicycle bike = new Bicycle("black", "bike");
    // bike.stop();

    Vehicle[] races = { bike,car, boat };

    for(Vehicle z : races){
      z.go();
    }
    // System.out.println(car.speed);
//     System.out.println(car.doors);
// System.out.println(bike.paddles);
// car.stop();
// System.out.println(car.color);
// System.out.println(car.name);
// System.out.println(car.type);
System.out.println(car);
  }
}
