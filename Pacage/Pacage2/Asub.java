package Pacage.Pacage2;

import Pacage.Pacage1.A;

public class Asub extends A{
  // public static void main(String[] args) {
  //   C c = new C();
  //   System.out.println(c.defaultmessage);
    
  // }
  public static void main(String[] args) {
    C c = new C();
    System.out.println(c.publicMsg);

    Asub asub = new Asub();
    System.out.println(asub.protectMsg);
  }
}
