public class PrimeCheck {
    public static void main(String args[]) {

        if(args.length == 0) {
            System.out.println("Please enter a number as command line argument");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int flag = 0;

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println(n + " is Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");
    }
}

