import java.util.*;

class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			
		}
		Arrays.sort(arr);
		int count = 0;
		int check = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				check += 1;

			} else {
				count += check * (check - 1) / 2;
				check = 1;
			}

		}
		System.out.println(count);
	}

}
