public class forloop {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
        }

        int i;
        for(i=10;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("countdown completed");//nested loop is just like nested loop in c or c++
    }
}
