package Abstract;

public class Main {
  public static void main(String[] args) {
    // Vehicle vehicle = new Vehicle();
    // vehicle is too abstract to make new instance and it doesn't make any sence. So avoid to cause the situation, use abstract. then you can't make abstarct instance/object
    Car car = new Car();
    car.go();
  }
}
