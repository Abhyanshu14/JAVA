import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a no ");
        int a=input.nextInt();
        
        String ne=(a%2==0)?"even":"odd";
        System.out.println(ne);


        input.close();
    }
}
