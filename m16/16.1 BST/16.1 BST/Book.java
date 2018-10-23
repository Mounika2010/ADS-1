public class Book {

    String bookname;
    String authorname;
    double price;

    Book(String bookname, String authorname, double price) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.price = price;
    }

    public String getBookname() {
        return this.bookname;
    }

    public String getAuthorname() {
        return this.authorname;
    }

    public double getprice() {
        return this.price;
    }

    public void setBookname(String bookname1) {
        this.bookname = bookname1;
    }

    public void setAuthorname(String authorname1) {
        this.authorname = authorname1;
    }

    public void setPrice(double price1) {
        this.price = price1;
    }

    public int compareTo(Book that) {
        if (this.getAuthorname().compareTo(that.getAuthorname()) > 0) {
            return 1;
        } else if (this.getAuthorname().compareTo(that.getAuthorname()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}