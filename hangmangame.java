import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangmangame {
    public static void main(String[] args) {

        String filepath="hangman.txt";
        ArrayList<String>words=new ArrayList<>();


        try(BufferedReader reader= new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line=reader.readLine())!=null) {
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find any file");
        }
        catch(IOException e){
            System.out.println("Something went wrong ");
        }
        Random random=new Random();


        String word=words.get(random.nextInt(words.size()));
        Scanner input=new Scanner(System.in);
        ArrayList<Character> wordstate=new ArrayList<>();
        int wrongguess=0;
        for(int i=0;i<word.length();i++){
            wordstate.add('_');     
        }
        
        System.out.println("********************");
        System.out.println("Welcome to Java Hangman game ");
        System.out.println("********************");

        while (wrongguess<6) {

        System.out.println(gethangman(wrongguess));

            System.out.print("Word : ");

        for(Character c : wordstate){
            System.out.print(c+" ");
        }

        System.out.println();
        System.out.print("Guess a letter ");
        char Guess=input.next().toLowerCase().charAt(0);

        if(word.indexOf(Guess)>=0){
             System.out.println("Correct guess\n");

             for(int i=0;i<word.length();i++)
             {
                if(word.charAt(i)==Guess){
                    wordstate.set(i, Guess);
                }
             }
             if(!wordstate.contains('_')){
                System.out.print(gethangman(wrongguess));
                System.out.println("You Win 🏆 ");
                System.out.println("The word was: "+word);
                break;
             }


        }
        else{
            wrongguess++;
            System.out.println("Wrong guess\n");
        }
        if(wrongguess>=6){
            System.out.println(gethangman(wrongguess));
            System.out.println("Game Over! ☺️");
            System.out.println("the word was "+word);
        }


        }


        input.close();
    }

    static String gethangman(int wrongguess){

        return switch(wrongguess){
            case 0->"""
                    
                    """;

            case 1-> """
                    o

                    """;
            case 2->"""
                     o
                     |
                    """;
            case 3->"""
                     o
                    /|\\ 

                    """;
            case 4->"""
                     o
                    /|\\
                    """;
            case 5->"""
                     o
                    /|\\
                    /
                    """;
            case 6->"""
                     o
                    /|\\
                    / \\
                    """; 
            default -> "   ";
        }; 
    }
}
  