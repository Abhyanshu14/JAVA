import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rando=new Random();
        
        int number;
        number=rando.nextInt(1,7);
        System.out.println("you get "+number+" on dice");
        
        boolean ans=rando.nextBoolean();
        System.out.println("give answer is "+ans);

        float error=rando.nextFloat();
        System.out.println("there is "+error+"% error in experiment");
    }
}
