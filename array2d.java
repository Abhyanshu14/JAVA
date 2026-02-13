public class array2d {
public static void main(String[] args){
    // int[] array1={1,2,3};
    // int [] array2={4,5,6};
    // int[] array3={7,8,9,0};
    //int[][] array={array1,array2,array3};
    int[][] array={
        {1,2,3},
        {4,5,6},
        {7,8,9,0}
    };
    array[0][2]=57;
    for(int[] nums:array)
    {
        for(int n:nums)
        {
            System.out.print(n);
        }
        System.out.println();
    }

}
    
}
