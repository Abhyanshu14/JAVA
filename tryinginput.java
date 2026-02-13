import java.util.Scanner;
public class tryinginput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age=input.nextInt();
        //input.nextLine();
        System.out.println("enter your name");
        String name=input.nextLine();
        System.out.println("name is "+name);
        System.out.println("age is"+age);
        input.close();
    }
}
