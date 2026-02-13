import java.util.Scanner;

public class circulator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first no");
        int a=input.nextInt();
        System.out.println("enter the operator");
        char b=input.next().charAt(0);
        System.out.println("enter another no");
        int c=input.nextInt();
        switch (b) {
            case '+':
                System.out.println("add is "+(a+c));
                break;
            case '-':
                System.out.println("substraction is "+Math.abs((a-c)));
                break;
            case '*':
                System.out.println("Multiplicaton is "+(a*c));
            case '%':
                System.out.println("remainder is "+(a%c));
            default:
                System.out.println("Please select the operator(+,-,*,%)");
                break;
        }
        input.close();
    }
}
