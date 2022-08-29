/*
 * Author Name: Jaival
 * Date: 29-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */

public class Book {
    String ISBN_No;
    String title;
    String description;
    double price;

    Author author;

    public Book() {
    }

    public Book(String ISBN_No, String title, String description, double price, Author author) {
        this.ISBN_No = ISBN_No;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }
}
