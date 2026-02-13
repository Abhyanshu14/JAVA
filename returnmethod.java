import java.util.Scanner;

public class returnmethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a no ");
        int num=input.nextInt();
        int x=square(num);
        System.out.println("square of a no is "+x);
        input.close();
    }
    static int square(int x)
    { 
        return x*x;
    }
}
