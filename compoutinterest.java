import java.util.Scanner;
public class compoutinterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the principal amout rate of interest and the time");
        double principal=input.nextDouble();
        double rate=input.nextDouble();
        int time =input.nextInt();
        double amout=principal *Math.pow( (1+rate/100),time);
        System.out.printf("the total amout is %.2f",amout);
        input.close();
    }
}
