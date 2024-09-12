import java.util.Objects;

public class Author {
    private String firstname;
    private String lastname;

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) & Objects.equals(lastname, author.lastname);

    }
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    public String toString() {
        return "Автор-" +  firstname + '\'' +  lastname + '\'' ;
    }
}
