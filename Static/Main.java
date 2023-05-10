package Static;

public class Main {
  // static = modifier. A single copy of a variable/method is created and shared. The class "owns" the static member

  public static void main(String[] args) {
    
Friend friend1 = new Friend("Spongebob");
Friend friend2 = new Friend("Patrick");
Friend friend3 = new Friend("Squid");
    
// this static variable is owned by the class itself. So it better to access from the class's name, not new instance
// System.out.println(friend1.numberOffFriends); <- this is not good way
// System.out.println(Friend.numberOffFriends); 

  Friend.displayFriends();
  }
}
