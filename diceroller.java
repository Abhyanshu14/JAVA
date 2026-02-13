import java.util.Random;
import java.util.Scanner;

public class diceroller {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int numofdice,total=0;
        System.out.println("enter the no of dice ");
        numofdice=input.nextInt();
        if(numofdice<=0)
        {
            System.out.println("no of dice should be greated then 0");
        }
        else {
            for(int i=0;i<numofdice;i++)
            {
                int roll=random.nextInt(6)+1;
                printdie(roll);
                System.out.println("you rolled "+roll);
                total=total+roll;
            }
            System.out.println("total "+total);
        }
        input.close();
    }
    static void printdie(int roll)
    {
        String dice1="""
                 --------
                |        |
                |    ✹   |
                |        |
                 --------
                """;
        String dice2="""
                 --------
                |  ✹     |
                |        |
                |      ✹ |
                 --------
                """;
        String dice3="""
                 --------
                | ✹      |
                |    ✹   |
                |       ✹|
                 --------
                """;
        String dice4="""
                 --------
                | ✹   ✹  |
                |        |
                | ✹    ✹ |
                 --------
                """;
        String dice5="""
                 --------
                | ✹   ✹  |
                |   ✹    |
                | ✹    ✹ |
                 --------
                """;
        String dice6="""
                 --------
                | ✹   ✹  |
                | ✹   ✹  |
                | ✹   ✹  |
                 --------
                """;
        switch (roll) {
            case 1->System.out.println(dice1);
            case 2->System.out.println(dice2);
            case 3->System.out.println(dice3);
            case 4->System.out.println(dice4);
            case 5->System.out.println(dice5);
            case 6->System.out.println(dice6);    
        }
    }
}
