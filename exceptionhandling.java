import java.util.Scanner;
//import java.util.InputMismatchException;
public class exceptionhandling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("enter a number");
            int x=input.nextInt();
            System.out.println(x);
        }
        // catch(InputMismatchException e){
        //     System.out.println("you cannot enter a string");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("You cannot divide by 0");
        // }
        catch(Exception e){
            System.out.println("Something went wrong");//this block will handle everything
            
        }
        finally{
            input.close();
            System.out.println("this code always execute");
        }
        
    }
}
