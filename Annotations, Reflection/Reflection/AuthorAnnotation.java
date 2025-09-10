import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name="Ayush Gupta")
class Book {}

public class AuthorAnnotation {
    public static void main(String[] args) {
        Author author = Book.class.getAnnotation(Author.class);
        if (author != null) {
            System.out.println("Author: " + author.name());
        }
    }
}