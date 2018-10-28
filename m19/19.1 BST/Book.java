import java.util.NoSuchElementException;
/**
 * Class for book.
 */
class Book {
	/**
	 * name.
	 */
	private String name;
	/**
	 * author.
	 */
	private String author;
	/**
	 * price.
	 */
	private Double price;
	/**
	 * Constructs the object.
	 *
	 * @param      n     name of the book.
	 * @param      a     Author name.
	 * @param      p     Price of the book.
	 */
	Book(final String n, final String a, final Double p) {
		this.name = n;
		this.author = a;
		this.price = p;
	}
	/**
	 * get name.
	 *
	 * @return     Gets the name.
	 */
	String getname() {
		return this.name;
	}
	/**
	 * get author.
	 *
	 * @return     Gets the author name.
	 */
	String getauthor() {
		return this.author;
	}
	/**
	 * get price.
	 *
	 * @return     Gets the price.
	 */
	Double getprice() {
		return this.price;
	}
	/**
	 * compare.
	 *
	 * @param      that  The that book.
	 *
	 * @return     Integer value.
	 */
	int compareTo(final Book that) {
		if (this.name.compareTo(that.name) > 0) {
			return 1;
		} else if (this.name.compareTo(that.name) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String s = "";
s = name + ", " + author + ", " + price;
		return s;
	}
}
