import java.util.Scanner;
public class arearectangle {
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
     System.out.println("enter length of rectangle");
     float length=input.nextFloat();
     System.out.println("enter the breadth");
     float breadth=input.nextFloat();
     System.out.println("area of rectange is "+length*breadth+"cm²");
     input.close();
    }
}
