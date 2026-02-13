import java.util.Scanner;

public class bankingprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double balance=0;
        boolean isrunning=true;
        int choice;
        while (isrunning) {
        System.out.println("********************");
        System.out.println("banking program");
        System.out.println("********************");
        System.out.println("1.Check Balence");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
        System.out.println("********************");
        System.out.println("enter your choice ");
        choice=input.nextInt();
        switch (choice)
        {
            case 1 -> showbalence(balance);
            case 2 -> balance = deposit(balance, input);
            case 3 -> balance = withdraw(balance, input);
            case 4 -> isrunning = exit();
            default->
            System.out.println("choose the correct choice");

        }
    }
    input.close();

    }
    static void showbalence(double balance)
    {
        System.out.printf("your current account balance is $%.2f\n",balance);
    }
    static double deposit(double balance, Scanner input)
    {
        System.out.println("enter the amount you want to deposit");
        double x = input.nextDouble();
        if(x<0)
        {
            System.out.println("balence cannot be negative ");
            return balance;
        }
        return balance + x;    
    }
    static double withdraw(double balance, Scanner input)
    {
        System.out.println("enter the amount you want to withdraw ");
        double x = input.nextDouble();
        if (x > balance)
             {
            System.out.println("your account doesnot have the balence ");
            return balance;
             }
        else if(x<0)
        {
            System.out.println("balence cannot be negative ");
            return balance;
        }
        else {
            return balance - x;
        }          
    }
    static boolean exit()
    {

        System.out.println("Thankyou for using out bank service ");
        boolean isrunning=false;
        return isrunning;
    }
    
}
