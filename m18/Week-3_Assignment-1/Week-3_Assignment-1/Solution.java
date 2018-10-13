import java.util.Scanner;
public class Solution {

	private Solution() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// BST stockname = new BST();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			// Query m = new Query();
			// Query n = new Query();
			
			Stockdata name = new Stockdata(tokens[0], Double.parseDouble(tokens[1]));
			System.out.println(name);


		}
	}
}