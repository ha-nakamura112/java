public class Pizza {

  String bread;
  String sauce;
  String cheese;
  String topping;

  Pizza(String bread, String sauce,String cheese){
  // Pizza(String bread,String sauce,String cheese){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
  }
  //overloaded constructures
  Pizza(String bread, String sauce, String cheese, String topping){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
  }

  public String toString(){
    String myString = bread + "\n"+ sauce + "\n" + cheese;
    return myString;
  }
  

}
