import java.util.*;
public class ParenthesisClient {
	public static boolean main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcases = Integer.parseInt(scan.nextLine());
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < testcases; i++) {
			String line = scan.nextLine();
			int j = 0;
			for (j = 0; j < line.length(); j++) {
				char ch = line.charAt(j);
				if (ch == '('|| ch == '[' || ch == '{') {
					stack.push(ch);
				
				} else {
					if (stack.isEmpty()) {
						return false;
					}
					if (ch == '}' && stack.top() == '{') {
						stack.pop();
					} else if (ch == ']' && stack.top() == '[') {
						stack.pop();

					} else {
						return false;
					}
				}
				
			}
			return stack.isEmpty();
		}
	}
}