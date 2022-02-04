package neu.jia.assignment01;

/* Question 10: Implement a class Box class Box {
  double width;
  double height;
  double depth;
}
* */
public class Book {
    private String name;
    private int bookId;
    private String genre;
    private double price;

    //A constructor for Book, and should pass all 4 values to create a new book
    public Book(String name, int bookId, String genre, double price) {
        this.name = name;
        this.bookId = bookId;
        this.genre = genre;
        this.price = price;
    }

    //getters and setters for all variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
