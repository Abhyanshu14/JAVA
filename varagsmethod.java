public class varagsmethod {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
        System.out.println("avg is "+average(1,2,3));
    }
    static double add(int ... numbers)
    {
        double sum=0;
        for(int number:numbers)
        {
            sum+=number;
        }
        return sum;
    }
    static double average(int ...numbers)//numbers is accepted as array here
    {
        double avg=0;
        int n=numbers.length;
        avg=add(numbers)/n;
        return avg;
    }
}
