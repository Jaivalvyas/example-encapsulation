/*
 * Author Name: Jaival
 * Date: 29-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */

public class Author {
    String author_name;
    String author_pen_name;

    public Author() {
    }

    public Author(String author_name, String author_pen_name) {
        this.author_name = author_name;
        this.author_pen_name = author_pen_name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_name='" + author_name + '\'' +
                ", author_pen_name='" + author_pen_name + '\'' +
                '}';
    }
}
