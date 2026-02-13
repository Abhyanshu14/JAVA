import java.util.Scanner;
public class hypotenuse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the sides of triangel");
        int a=input.nextInt();
        int b=input.nextInt();
        double hypotenuse=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        
        System.out.println("the hypotenuse of triangle "+hypotenuse);
        input.close();
    }
}
