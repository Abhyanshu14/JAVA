import java.util.Scanner;
//abhyanshu 2400320100058
public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a no");
        int a=input.nextInt();
        int b=a;
        int rev=0;
        while(b>0){
            int rem=b%10;
            rev=rev*10+rem;
            b/=10;
        }
        if(rev==a)
        {
            System.out.println("no is palindrome");
        }
        else{
            System.out.println("no is not palindrome");
        }

        input.close();
    }
}
