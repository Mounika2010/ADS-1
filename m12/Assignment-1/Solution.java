/**
 * imports Scanner class.
 */
import java.util.Scanner;
/**
 * imports Arrays class.
 */
import java.util.Arrays;
/**
 * class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		//unused constructor.
	}
	/**
	 * The driver method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        int qualified = s.nextInt();
        int vacancies = s.nextInt();
        int unreserved = s.nextInt();
        int bcvacancies = s.nextInt();
        int scvacancies = s.nextInt();
        int stvacancies = s.nextInt();
        while (s.hasNext()) {
            s.nextLine();
        }
	}

}
