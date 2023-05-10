package Static;

public class Friend {
  // static = modifier. A single copy of a variable/method is created and shared. The class "owns" the static member. static is shared by all method/vatriable


  String name;
  static int numberOffFriends;

  Friend(String name){
    this.name = name;
    numberOffFriends++;
  }

  static void displayFriends(){
    
    //this variable should be static
     System.out.println("You have "+numberOffFriends+" friends");
  }
}
