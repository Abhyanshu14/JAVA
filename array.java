import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        String[] fruits={"apple","mango","banana"};
        //System.out.println(fruits);
        // for(int i=0;i<fruits.length;i++)
        // {
        //     System.out.print(fruits[i]+" ");
        //}

        // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for(String fruit:fruits)
        {
            System.out.print(fruit+" ");
        }
    }
}
