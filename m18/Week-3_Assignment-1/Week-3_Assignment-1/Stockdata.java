/**
 * Class for stockdata.
 */
class Stockdata {
	String name;
	double change;

	Stockdata(String name, double change) {
		this.name = name;
		this.change = change;
	}
/**
 * Gets the name.
 *
 * @return     The name.
 */
	public String getName() {
		return this.name;
	}
	/**
	 * Gets the changepercent.
	 *
	 * @return     The changepercent.
	 */
	public double getChangepercent() {
		return this.change;
	}
	/**
	 * Sets the name.
	 *
	 * @param      name1  The name 1
	 */
	public void setName(String name1) {
		this.name = name1;
	}
	/**
	 * Sets the changepercent.
	 *
	 * @param      change1  The change 1
	 */
	public void setChangepercent(double change1) {
		this.change = change1;
	}
	/**
	 * Compares the %change in the stocks.
	 *
	 * @param      that  The that
	 *
	 * @return     1 or -1 or 0, if greater, less or any other condition.
	 */
	public int compareTo(Stockdata that) {
		if (this.getName().compareTo(that.getName()) > 0) {
			return 1;
		} else if (this.getName().compareTo(that.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
}