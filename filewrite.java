import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        
        try(FileWriter write1=new FileWriter("text.txt")){
            write1.write("I like pizza \n It's really good");//we can make a string write text and then 
            //we can pass inside the ()
            System.out.println("you hava written");
        }
        catch(IOException e){
            System.out.println("you cannot write in the file");
        }
    }
}
