import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        String[] fruits; 

        //String[] fruits=new String[3];
        // fruits[0]="apple";
        // fruits[1]="aam";
        // for(String food : fruits)
        // {
        //     System.out.print(food+" ");
        // }
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no of fruits");
        int size= input.nextInt();
        fruits=new String[size];
        System.out.println("enter the name of fruits");
        for (int i=0;i<fruits.length;i++)
        {
            fruits[i]=input.nextLine();
        }
        for (int i=0;i<fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }
        input.close();

    }
}
