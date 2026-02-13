import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        int radius=input.nextInt();
        System.out.printf("the circumference of circle is %.2f \n",(2*Math.PI*radius));
        System.out.printf("the area of circle is %.2f",(Math.PI*Math.pow(radius, 2)));
        System.out.printf("the volume of sphere is %.5f",(4/3*Math.PI*Math.pow(radius,3)));
        input.close();
    }
}
