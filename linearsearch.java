public class linearsearch {
    public static void main(String[] args) {
        int [] number={1,2,3,4,5};
        int target=4;
        int pos=-1;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==target)
            {
                 pos=i+1;
                 break;
            }
        }
        if(pos<1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element found at pos "+pos);
        }
    }
}
