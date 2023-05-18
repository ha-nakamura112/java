package Music;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
  public static void main(String[] args) {
    File file = new File("Music//music.wav");
    Scanner scan = new Scanner(System.in);
    try {
      AudioInputStream audio = AudioSystem.getAudioInputStream(file);
      Clip clip;
      try {
        clip = AudioSystem.getClip();
        clip.open(audio);

        String res = "";
        while(!res.equals("Q")){
          System.out.println("P: play,S: stop, R: reset, Q: quit");
          System.out.println("Enter your choice: ");
          
          res = scan.next();
          res = res.toUpperCase();

          switch(res){
            case "P":
            clip.start();
            break;

            case "S":
            clip.stop();
            break;

            case "R":
            clip.setMicrosecondPosition(0);
            // clip.start();
            break;

            case "Q":
            clip.close();;
            break;

            default:
            System.out.println("Not valid");
          }
        }

      } catch (LineUnavailableException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
