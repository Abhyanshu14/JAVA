import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        int i,count=0;
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("not a prime no");
        }
        else
        {
            System.out.println("prime no");
        }
        input.close();
    }
}
