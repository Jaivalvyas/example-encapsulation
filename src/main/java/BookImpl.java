/*
 * Author Name: Jaival
 * Date: 29-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */

public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author("Larry", "Test");
        Book book = new Book("123456789", "Learn JAVA", "Introduction", 300, author);

        System.out.println(book.displayBookDetails());
    }
}
