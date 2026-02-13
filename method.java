public class method {
    public static void main(String[] args) {
        happy();
        happybirthday("ram",39);
    }
    static void happy(){
        System.out.println("happy birthday");
    }
    static void happybirthday(String name,int age)
    {
        System.out.println("happy birthday "+name);
        System.out.printf("you are %d years old",age);
    }
}
