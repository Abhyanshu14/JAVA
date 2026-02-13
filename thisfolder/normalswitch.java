import java.util.Scanner;

public class normalswitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the choice");
        int a=input.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("you selected the option 1");
                break;
            case 2:
                System.out.println("you selected the option 2");
                break;
            default:
                System.out.println("its nothing");
                break;
        }
        input.close();
    }
}
