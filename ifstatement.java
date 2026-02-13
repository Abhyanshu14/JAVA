import java.util.Scanner;
public class ifstatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float number;
        System.out.println("enter a no  ");
        number =input.nextFloat();
        if (number>0)
        {
            System.out.println("entered number is +ve");
        }
        else if(number<0)
        {
            System.out.println("entered number is -ve");
        }
        else
        {
            System.out.println("entered number is zero");
        }
        input.close(); 
    }
}
