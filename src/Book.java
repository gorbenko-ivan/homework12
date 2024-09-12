import java.util.Objects;

public class Book {
    private String bookname;
    private Author author;
    private int yearOfPublication;

    public Book(String bookname, Author author, int yearOfPublication) {
        this.bookname = bookname;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookname() {
        return this.bookname;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookname, book.bookname) && Objects.equals(author, book.author);

    }

    @Override
    public int hashCode() {
        return Objects.hash(bookname, author, yearOfPublication);
    }

    public String toString() {
return "Book{"+"bookName'"+bookname+'\''+author+",yearOfPublication="+yearOfPublication+'}';
    }
}

