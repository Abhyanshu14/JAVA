import java.util.Scanner;
public class substirng {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String emailid;
        System.out.println("enter your email id");
        emailid=input.nextLine();
        String username=emailid.substring(0,emailid.indexOf("@"));
        String domain=emailid.substring(emailid.indexOf("@")+1);
        System.out.println("the username is "+username);
        System.out.println("the domain name is "+domain);
        String emailid2="abh123@gmail.com";
        String username1=emailid2.substring(0,6);
        String domain1=emailid2.substring(7);//default is last index
        System.out.println("the username is "+username1);
        System.out.println("the domain name is "+domain1);
        input.close();
    }
}
