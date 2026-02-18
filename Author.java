public class Author{
    //unsure if = is necessary :c
    private String name;
    private String email;
    private char gender; //m or f or u

    //constructor 
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //methods:
    //getter gender
    public char getGender(){
        return gender;
    }

    //getter name
    public String getName(){
        return name;
    }

    //getter email
    public String getEmail(){
        return email;
    }

    //setter email
    public void setEmail(String email){
        this.email = email;
    }
     public static void main(String[] args){
    //I DID IT :D
    Author osman = new Author("Richard Osman", "noone@nowhere.com", 'm');
    System.out.println(osman); // Test toString()
    osman.setEmail("osman@murderclub.com"); // Test setter
    System.out.println("name is: " + osman.getName()); // Test getter
    System.out.println("email is: " + osman.getEmail()); // Test getter
    System.out.println("gender is: " + osman.getGender()); // Test getter
    }


}
