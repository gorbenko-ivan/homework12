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
}
