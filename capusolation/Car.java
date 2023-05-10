package capusolation;

public class Car {
  private String make;
  private String model;
  private int year;

  Car(String make, String model, int year){
    // this.make = make;
    // this.model = model;
    // this.year = year;
    this.setMake(make);
    this.setModel(model);
    this.setYear(year);
  }

  Car(Car car){
    this.setMake(car.getMake());
    this.setModel(car.getModel());
    this.setYear(car.getYaer());
  }

  public String getMake(){
    return this.make;
  }
  public String getModel(){
    return this.model;
  }
  public int getYaer(){
    return this.year;
  }

  public void setMake(String make){
    this.make = make;
  }
  public void setModel(String model){
    this.model = model;
  }
  public void setYear(int year){
    this.year = year;
  }

  public void copy(Car car){
    this.setMake(car.getMake());
    this.setModel(car.getModel());
    this.setYear(car.getYaer());
    // cannot do car.make, cause these values are private
  }
}
