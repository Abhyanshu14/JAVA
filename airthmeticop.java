import java.util.Scanner;
public class airthmeticop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a no");
        int a=input.nextInt();
        System.out.println("enter a no");
        int b=input.nextInt();
        System.out.println("addition of two no is "+(a+b));
        System.out.println("substraction of two no is "+(a-b));
        System.out.println("multiplication of two no is "+(a*b));
        System.out.println("division of two no is "+(a/b));
        System.out.println("modulus of two no is "+(a%b));
        //argumented assignment operator
        a+=b;
        System.out.println("argumented addition of two no is "+a);
        input.close();
    }
}
