package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter whole number to devide");
      int x = scanner.nextInt();
      System.out.println("Enter whole number to devide by");
      int y = scanner.nextInt();
      double result = x / y;
      System.out.println("Result is: " + result);
    }catch(ArithmeticException  error){
      System.out.println("Error : " + error.getMessage());
    }
    catch(InputMismatchException  error){
      System.out.println("Error : " + error.getMessage());
    }catch(Exception e){
      System.out.println("Error : " + e.getMessage());
    }finally{
      System.out.println("Done");
    }
  }
}
