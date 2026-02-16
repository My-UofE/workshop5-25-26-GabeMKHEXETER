//used Jshell for majority of Task 3

public class StringFormatApp{
    public static void main(String[] args){
        String s = String.format("%.1f",1.234); //1.2
        String s1 = new String("book");
        String s2 = "book";
        String s3 = "book"; 
        System.out.println(s);
        System.out.println("book (object) == book (string): "+ (s1==s2));
        System.out.println("book (string) == book (string): " + (s2==s3));

        int age = Integer.parseInt(args[0]);
        float height = Float.parseFloat(args[1]);
        //String name = String.parseStr(args[2]); //how to without scanner..? :<
        System.out.printf("Age: %d Height: %d%n", age, height);
    }
}