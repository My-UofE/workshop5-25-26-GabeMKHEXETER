//used Jshell for majority of Task 3
//java.until.Formatter ?

public class StringFormatApp{
    public static void main(String[] args){
        String s = String.format("%.1f",1.234); //1.2
        String s1 = new String("book");
        String s2 = "book";
        String s3 = "book"; 
        System.out.println(s);
        System.out.println("book (object) == book (string): "+ (s1==s2));
        System.out.println("book (string) == book (string): " + (s2==s3));

        System.out.printf("Name: %1$20s Age: %2$3s Height: %3$4s%n", args[0], args[1], args[2]); //I remembered :D (format is close enough..)

        //space height :D (3.3)
        float height = Float.parseFloat(args[2]);
        double spaceHeight = height * 1.023 * 100; //2.3% increase (in cm)
        String formattedHeight = String.format("%.02f", spaceHeight); //had to adjust here, %f was being strange 
        System.out.printf("My space height would be " + formattedHeight +"cm %n");

        //space age (3.4)
        int age = Integer.parseInt(args[1]); 
        double spaceAge = age / 1.88; 
        System.out.printf("On mars, I would be %.0f%n",spaceAge);

    }
}