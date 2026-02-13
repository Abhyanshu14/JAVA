public class printf {
    public static void main(String[] args) {
        String name="java";
        char first='j';
        int age =40;
        double version=5.9;
        boolean isgood=true;
        System.out.printf("the language is %s\n",name);
        System.out.printf("the first letter is %c\n",first);
        System.out.printf("the java is %d years old\n",age);
        System.out.printf("the current java version is %.1f\n",version);
        System.out.printf("the java is good language %b\n ",isgood);
        System.out.printf("%s current version is %.1f",name,version);//.1f is setting precision

        double a=99000.500,b=-67.90,c=87.890987;
        System.out.printf("%.2f\n",c);
        System.out.printf("%,.2f\n",a);
        System.out.printf("% .2f\n",b);

        int id1=1;
        int id2=12;
        int id3=123;
        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);



    }
} 
