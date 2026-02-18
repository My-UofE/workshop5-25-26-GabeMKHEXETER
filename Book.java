public class Book{
    private String name;
    private double price; 
    private int quantity = 0;
    private Authors[] authors;

    //constructor 
    public Book(Author[] authors, String name, double price, int quantity){
        this.authors = authors;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //methods
    //unspecified..
        //guess: only getters except price + quantity
        //getters:
        public Authors[] getAuthors(){ //don't know how to define lists :'C (seems to be only probelm)
        return authors;}

        public String getName(){
        return name;}

        public double getPrice(){
        return price;}

        public int getQuantity(){
        return quantity;}

        //setters:
            public void setPrice(double price){
        this.price = price;}

        public void setQuantity(int quantity){
        this.quantity = quantity;}

    //main
    public static void main(String[] args){
         // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Pip Jones", "pjones@java.org", 'u');
        authors[1] = new Author("Bessie Carter", "b.carter@java.org", 'f');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}