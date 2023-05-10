import java.util.Scanner;


public class scanner {
  public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int rows = scan.nextInt();
    System.out.println("Enter number of columns: ");
    int colums = scan.nextInt();
    System.out.println("Enter symbol to use: ");
    String symbol = scan.next();

    for(int i=1; i<= rows; i++){
      for(int k=1; k<=colums; k++){
        System.out.println(symbol);
      }
    }

    scan.close();
  }
}
