package main.java.academy.Class8;

public class TestBook {
    public static void main(String[] args) {
        Printable array[] = new Printable[5];
        array[0] = new Book("Колобок");
        array[1] = new Book("Колобок1");
        array[2] = new Book("Колобок3");
        array[3] = new Magazine("GQ", 12);
        array[4] = new Magazine("Vogue", 8);

        for (Printable p : array) {
            p.print();
        }
        System.out.println("___________");
        System.out.println("Book ");
        System.out.println("___________");
        Book.printBook(array);

    }
}
