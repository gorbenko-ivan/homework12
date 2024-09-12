public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Александр", "Пушкин");
        Author bookTwo = new Author("Николай", "Гоголь");
        Book one = new Book("Евгений Онегин", bookOne, 1833);
        Book two = new Book("Тарас Бульба", bookTwo, 1835);
        System.out.println(one.getAuthor().getFirstname() + " " + one.getAuthor().getLastname() + " " + one.getYearOfPublication());
        System.out.println(two.getAuthor().getFirstname() + " " + two.getAuthor().getLastname() + " " + two.getYearOfPublication());
        one.setYearOfPublication(1900);
        System.out.println(one.getAuthor().getFirstname() + " " + one.getAuthor().getLastname() + " " + one.getYearOfPublication());

        System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.println(bookOne.equals(bookTwo));
        System.out.println(one);
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
    }

}