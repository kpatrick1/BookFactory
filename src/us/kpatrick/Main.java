package us.kpatrick;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    BookFactory bookFactory = new BookFactory();
	    ArrayList<Book> books = new ArrayList<>();

	    books.add(bookFactory.getBook(BookType.FICTION));
        books.add(bookFactory.getBook(BookType.BIOGRAPHY));
        books.add(bookFactory.getBook(BookType.GRAPHIC_NOVEL));
        books.add(bookFactory.getBook(BookType.GRAPHIC_NOVEL));

        for (Book b:books) {
            b.displayBook();
        }
    }
}
