import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int balance=100,bet,payout;
        String[] row;
        boolean playagain=true;
        System.out.println("************");
                
        System.out.println("Welcome to the Slot machine ");
        System.out.println("*************");
        System.out.println("Symbols 🏆 ❤️ 💕 🥶 🐥 ");
        while (balance>0&&playagain) {
            System.out.println("current balence : $"+balance);
            System.out.println("enter your bet amount ");
            bet=input.nextInt(); 
            if(bet>balance) 
            {
                System.out.println("insufficient balence");
                continue;
            }
            else if(bet<=0)
            {
                System.out.println("bet must be greater than 0");
                continue;
            }
            else
             {
                balance=balance-bet;
             }
             System.out.println("spinning ... ");
             row=spinrow();
             printrow(row);
              payout = getPayout(row,bet);
             if(payout>0)
                {
                 System.out.println("You won! Payout: $" + payout);
                 balance = balance + payout;
                } 
             else
                {
                 System.out.println("You lost this round.");
                }
            System.out.println("do you want to play again{true/false}");
            playagain=input.nextBoolean();

        }
        System.out.println("thankyou for playing 🙏 ");
        System.out.println("your final balance is $"+balance);
        input.close();

    }
    static String[] spinrow()
    {
        String[] symbol={"🏆", "❤️","💕","🥶","🐥"};
        String [] row = new String[3];
        Random random=new Random();
        for(int i=0;i<3;i++)
        {
            row[i]=symbol[random.nextInt(symbol.length)];
        }

        return row;
    }
    static void printrow(String[] row)
    {
        System.out.println("*************************");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("*************************");
    }
    static int getPayout(String[] row, int bet) {
        // Three of a kind
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🥶": return bet * 7;
                case "🐥": return bet * 9;
                case "💕": return bet * 12;
                case "❤️": return bet * 15;
                case "🏆": return bet * 20;
                default: return 0;
            }
        }

        // Any two of a kind
        else if (row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])) {
            String matched = row[0].equals(row[1]) ? row[0] : (row[1].equals(row[2]) ? row[1] : row[0]);
            switch (matched) {
                case "🥶": return bet * 2;
                case "🐥": return bet * 3;
                case "💕": return bet * 4;
                case "❤️": return bet * 5;
                case "🏆": return bet * 6;
                default: return 0;
            }
        }

        // No matches
        return 0;
    }

}
               
