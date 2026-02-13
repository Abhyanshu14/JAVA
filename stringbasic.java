public class stringbasic {
    public static void main(String[] args) {
        String name=" Bro code ";
        int length=name.length();
        System.out.println("the length of stirng is "+length);

        char letter=name.charAt(2);
        System.out.println("the character at index 4 is "+letter);

        int index=name.indexOf("ro");
        System.out.println("the the index of first occurence of ro "+index);

        int lastindex=name.lastIndexOf("o");
        System.out.println("the last index of o is "+lastindex);

        System.out.println("all uppercase "+name.toUpperCase());//name=name.touppercase()

        System.out.println("all lowercase "+name.toLowerCase());
        String name1=name.trim();

        System.out.print("trim the spaces "+name1);

        name=name.replace("d", "a");

        //boolean a=name.isEmpty(); return true if name is empty
        //boolean a=name.contains("a") return true if a name contains a 
        //boolean b=name.equals("password") return true if  password is equal to name case sensitive
        //boolean b=name.equalsIgnoreCase("Password") return true if  password is equal to name not cse sensitive
    }
}
