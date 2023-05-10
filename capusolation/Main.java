package capusolation;

import Pacage.Pacage2.C;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("BMW", "Camero", 2021);
    // Car car2 = new Car("BMW", "Camero", 2021);
    //make another method in Car obj to copy which has different paras from Car();
    Car car2 = new Car(car);
    System.out.println(car.getMake());
    //how to copy obj itself
    // car2.copy(car);
  }
}
