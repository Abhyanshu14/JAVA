import java.util.Scanner;
public class shoppingbill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the food you want to eat");
        String food=input.nextLine();
        System.out.println("enter the price of "+food);
        int cost=input.nextInt();
        System.out.println("enter the no of item ");
        int n=input.nextInt();
        System.out.println("the total amout you have to pay is "+(cost*n));
        input.close();
    }
}
