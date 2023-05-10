public class Arrays {
  public static void main(String[] args) {
    // int[] numbers = new int[3];
    // char[] charas = new char[4];
    // String[] string = new String[3];

    // Food[] fridge = new Food[3];

    Food food1 = new Food("orange");
    Food food2 = new Food("pasta");
    Food food3 = new Food("bread");

    Food[] fridge = {food1, food2,food3};
    
    // fridge[0] = food1;
    // fridge[1] = food2;
    // fridge[2] = food3;
    System.out.println(fridge[0].name);
    System.out.println(fridge[1].name);
    System.out.println(fridge[2].name);
  }
}
