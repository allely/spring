package exam03;

import java.util.Optional;

public class Ex05 {
    public static void main(String[] args) {
        Optional<Book> book = Optional.ofNullable(null);
        /*
        Book b1 = new Book();
        Book b = book.orElse(b1);
        를 한줄로 하면? */
        /*
        Book b = book.orElseGet(() -> new Book());
        를 더 짧게?    */
        Book b = book.orElseGet(Book::new);
    }
}
