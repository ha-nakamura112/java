import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello
 */
public class gameboard {
  public static void main(String[] args) {
    // Animal a = new Animal();
    // String dog = a.iAmDog();
    // nameExtension(dog);
    // ArrayList<Integer> a = new ArrayList<>();
    
    char[][] gameBoard = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
    printGameBoard(gameBoard);
    // Fizvazz("hash;hash:you:hash;to;do");

    
    // while(true){
      //to acccess all input data = scanner
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your placement (1-9):");
      // System.out.println("Enter your user name:" );
      //access int value from input
      int pos = scan.nextInt();
      // String user = scan.next();
      // placePiece(gameBoard, pos, user);
      placePiece(gameBoard, pos, "Player");
      Random rand = new Random();
      //nextInt generates random nums in the range of 0 to upperbound-1, nextFloat generate 0.0 to 1.0, nextDouble generates 0.0 to 1.0
      int cpuRan = rand.nextInt(9) + 1;
     
      placePiece(gameBoard, cpuRan, "cpu");
      printGameBoard(gameBoard);
    // }

  }

  public static String Fizvazz(String str){
    Map<String, Integer>wordCount = new HashMap<>();
    String[] words = str.split("[\\s,;:.!?]+");
    for(String word: words){
      word = word.toLowerCase();
      if(wordCount.containsKey(word)){
        wordCount.put(word, wordCount.get(word)+1);
      }else{
        wordCount.put(word, 1);
      }
    }

    String mostCommonWord = "";
    int maxCount = 0;

    for(Map.Entry<String, Integer> entry: wordCount.entrySet()){
      if(entry.getValue()> maxCount){
        mostCommonWord = entry.getKey();
        maxCount = entry.getValue();
      }
    }

    return mostCommonWord;
  }

  public static void printGameBoard(char[][] gameBoard){
    for(char[] row : gameBoard){
      for(char c: row){
        System.out.print(c);
      }
      System.out.println();
      // sysout: System.out.println();
    }
  }

  public static void placePiece(char[][] gameBoard, int pos, String user){

    //user == "player" and user.equals("Player") are different. the first one means user refers "Player", but the other one means the content of user is same as "Player". It's better to use .equals when you compare string
    char simbol = 'X';
    if(user.equals("Player")){
      simbol = 'X';
    }else{
      simbol = 'O';
    }
      switch(pos){
        case 1:
          gameBoard[0][0] = simbol;
          break;
        case 2:
          gameBoard[0][2] = simbol;
          break;
        case 3:
          gameBoard[0][4] = simbol;
          break;
        case 4:
          gameBoard[2][0] = simbol;
          break;
        case 5:
          gameBoard[2][2] = simbol;
          break;
        case 6:
          gameBoard[2][4] = simbol;
          break;
        case 7:
          gameBoard[4][0] = simbol;
          break;
        case 8:
          gameBoard[4][2] = simbol;
          break;
        case 9:
          gameBoard[4][4] = simbol;
          break;
        default:
          break;
      }
    //   switch(pos){
    //     case 1:
    //       gameBoard[4][4] = 'X';
    //       break;
    //     case 2:
    //       gameBoard[4][2] = 'X';
    //       break;
    //     case 3:
    //       gameBoard[4][0] = 'X';
    //       break;
    //     case 4:
    //       gameBoard[2][4] = 'X';
    //       break;
    //     case 5:
    //       gameBoard[2][2] = 'X';
    //       break;
    //     case 6:
    //       gameBoard[2][0] = 'X';
    //       break;
    //     case 7:
    //       gameBoard[0][4] = 'X';
    //       break;
    //     case 8:
    //       gameBoard[0][2] = 'X';
    //       break;
    //     case 9:
    //       gameBoard[0][0] = 'X';
    //       break;
    //   }
    // }


  }



  // public static String checkWinner(char[][] gameBoard){

  //   List topRow = Arrays.asList(1,2,3);
  // }

  // public static void nameExtension(String name){
  //   System.out.println(name);
  // }
  
  // public static void arrayFunc(){
  //   ArrayList<Integer> a = new ArrayList<>();
  // }
}