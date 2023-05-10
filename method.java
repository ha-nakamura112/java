
public class method {
  public static void main(String[] args) {
    Pizza pizza = new Pizza("crust","tomato","mozzerella");

    System.out.println("Here are the ingredients of your pizze:");
    // System.out.println(pizza.bread);
    // System.out.println(pizza.sauce);
    // System.out.println(pizza.cheese);
    // System.out.println(pizza.topping);
    
    //these are same result, so you can write code implicity and expricity. If you don't write toString method in Pizza class, it just shows the place of this file

    //explicity
    System.out.println(pizza.toString());
    //immplicity
    System.out.println(pizza);
  }
}
