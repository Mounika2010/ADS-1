import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while (scan.hasNext()) {
			sb.append(scan.nextLine().split("::"));
		}
		String[] lines = sb.toString().split("::");
		Team[] teams = new Team[lines.length];
		for (String line : lines) {
			String[] tokens = line.split(",");
			teams[i++] = new Team(tokens[0], Integer.parseInt(tokens[1],
			 						Integer.parseInt(tokens[2]), 
			 						Integer.parseInt(tokens[3])));
		}

		SelectionSort.sort(teams);
		String output = Arrays.toString(teams).replace("[", "").replace("]","").replace(", ", ",");
		System.out.println(output);

	}
}
