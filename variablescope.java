public class variablescope {
    static int x=3;//class
    public static void main(String[] args) {
        int x=1;//local
        System.out.println(x);
        dosomething();
    }
    static void dosomething()
    {
      //int   x=2;//local
      System.out.println(x);
    }
}
