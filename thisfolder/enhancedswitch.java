import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine().toLowerCase();
        switch (a)
         {
            case "monday","tuesday","wednesday","thrusday","friday"-> System.out.println("this is the weekday");
            case "saturday","sunday"->System.out.println("this is weekend"); 

            default-> System.out.println("this is not day from the week");
        }
        input.close();
    }
}
