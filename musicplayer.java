import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class musicplayer {
    public static void main(String[] args) {
        String filepath="Lutt Le Gaya _ Dhurandhar _ Ranveer Singh_ Akshaye Khanna_ Shashwat Sachdev_ Simran Choudhary(MP3_160K).wav";
        File file=new File(filepath);
        Scanner input=new Scanner(System.in);
        try(AudioInputStream audiostream=AudioSystem.getAudioInputStream(file)){
            String response="";
            
            Clip clip1=AudioSystem.getClip();
            clip1.open(audiostream);
            System.out.println("NO problems detected");
            
            while (!response.equals("Q")) {
                System.out.println("P:play");
                System.out.println("R:reset");
                System.out.println("S stop");
                System.out.println("Q:quit");
                System.out.println("enter your choice ");
                response=input.next().toUpperCase();
                
                switch (response) {
                    case "P"->clip1.start();
                    case "S" ->clip1.stop();   
                    case "R"->clip1.setMicrosecondPosition(1000000);
                    case "Q"->clip1.close();
                    default->System.out.println("Invalid choice");        
                }
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(LineUnavailableException e){
            System.out.println("audio not played");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("there is audio error");
        }
        catch(IOException e){
            System.out.println("there is an ioexception");
        }
        finally{
            System.out.println("bye bye 🐥 ");
            
        }
        input.close();
    }
}
