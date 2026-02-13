import java.util.Random;
import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Random random=new Random();
        String[] choice={"rock","paper","scissor"};
        String player_choice;
        String computer_choice;
        String playagain="yes";
        while (playagain.equals("yes")) {
            
        
        System.out.println("enter your choice(rock,paper,scissor)");
        player_choice=input.nextLine().toLowerCase();

        if(!player_choice.equals("rock")&&
            !player_choice.equals("paper")&&
              !player_choice.equals("scissor"))
              {
                System.out.println("Invalid Choice");
                continue;
              }
        computer_choice=choice[random.nextInt(3)]; 
        System.out.println("computer choice : "+computer_choice);
        if(player_choice.equals(computer_choice))
        {
           System.out.println("Its a tie ☺️"); 
        }
        else if((player_choice.equals("rock")&&computer_choice.equals("scissor"))||(player_choice.equals("paper")&&computer_choice.equals("rock"))||(player_choice.equals("scissor")&&computer_choice.equals("paper")))
        {
            System.out.println("you win 🏆");
        }
        else{
            System.out.println("you lose 😌");
        }
        System.out.println("Do you want to continue the game (yes/no)");
        playagain=input.nextLine().toLowerCase();
    }
    System.out.println("Thankyou for playing ☺️");

       input.close();
    }
}
