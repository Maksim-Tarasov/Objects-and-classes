import java.util.Objects;

public class Book {
    private int year;
    private String title;
    private Author author;

    public Book(int year, String title, Author author) {
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("error");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return
                "Год " + year +
                        ", название '" + title + '\'' +
                        ", автор " + author
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, author);
    }
}
