import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdown {
    public static void main(String[] args) {
        Timer timer=new Timer();
        Scanner input =new Scanner(System.in);
        System.out.println("enter the no you want to start the countdown");
        int resposnse=input.nextInt();
 
        
        TimerTask task =new TimerTask() {
            
            int count=resposnse;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Happy New Year");
                    timer.cancel(); 
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0,1000 );
        input.close();
    }
}
