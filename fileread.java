import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//bufferreader+filereader is used to read file line and line and best for reading text file 


public class fileread {
    public static void main(String[] args) {
        
        try (BufferedReader reader=new BufferedReader(new FileReader("text.txt"))){
            String line;
            while ((line=reader.readLine())!=null) {
                 System.out.println(line);
            }
            
        } 
        catch(IOException e){
            System.out.println("IO exeption");
        }
        // catch (FileNotFoundException e) {
        //     System.out.println("File not found");
        // }
    }
}
