import java.util.Scanner;
import java.util.Random;
public class numbergussing {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input =new Scanner(System.in);
        int defaut=0;
        
        int attempt=0;
        int guess=0;
        System.out.println("Gussing game");
        System.out.println("Guss a no b/w 1-10");
        do{
            System.out.println("enter a guess");
            
            guess=input.nextInt();
            defaut=random.nextInt(1,11);
            System.out.println("current default value is "+defaut);
            attempt++;
        }while(guess!=defaut);
        System.out.println("you guess it right in "+attempt+"attempts");
        input.close();
    }
}
