package main.java.academy.Class8;

public class Book implements Printable{
    private String name;
    public Book(){
    }
    public Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println( "Book"  + name );

    }
   public static void printBook(Printable[] printable){
        for (Printable p:printable){
            if ( p instanceof Book ){
                p.print();
            }
        }

    }
}
