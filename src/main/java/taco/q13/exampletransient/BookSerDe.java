package taco.q13.exampletransient;

import java.io.*;

public class BookSerDe {
    static String fileName = "book.ser";

    public static void main(String[] args) throws Exception {
        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("will not be saved");
        book.setCopies(25);

        BookSerDe.serialize(book);
        Book book2 = BookSerDe.deserialize();

        System.out.println(book2);
    }

    public static void serialize(Book book) throws Exception {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(book);

        out.close();
        file.close();
    }

    public static Book deserialize() throws Exception {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);

        Book book = (Book) in.readObject();

        in.close();
        file.close();

        return book;
    }
}
