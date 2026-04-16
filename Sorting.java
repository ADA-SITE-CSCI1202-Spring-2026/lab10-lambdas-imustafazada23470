import java.util.ArrayList;
import java.util.Comparator;

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPages(){
        return this.pages;
    }

    @Override
    public String toString(){
        return "title=" + title + ", author=" + author + ", pages=" + pages;
    }
}


public class Sorting {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Crime and Punishement", "Fyodor Dostoyevski", 300));
        books.add(new Book("The Devil", "Leo Tolstoy", 500));

        Comparator<Book> comp =((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
        books.sort(comp);
        books.forEach(System.out::println);


        books.sort(Comparator.comparing(Book::getAuthor));
        books.forEach(System.out::println);


        books.sort((b1, b2) -> b2.getPages() - b1.getPages());
        books.forEach(System.out::println);

        books.sort(
            Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle));
        books.forEach(System.out::println);
    }
}
