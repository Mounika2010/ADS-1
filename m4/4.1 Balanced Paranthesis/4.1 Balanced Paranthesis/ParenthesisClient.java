import java.util.*;
public class ParenthesisClient {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int testcases = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < testcases; i++) {
			String line = scan.nextLine();
			Stack<Character> stack = new Stack<Character>();
			int j = 0;
			for (j = 0; j < line.length(); j++) {
				char ch = line.charAt(j);
				if (ch == '('|| ch == '[' || ch == '{') {
					stack.push(ch);
				
				} else {
					if (stack.isEmpty() == false && ch == ')' && stack.top() == '(')
						stack.pop();
					else if (stack.isEmpty() == false && ch == ']' && stack.top() == '[')
						stack.pop();
					else if (stack.isEmpty() == false && ch == '}' && stack.top() == '{')
						stack.pop();
					else 
						break;
				}
			}
			if (j == line.length() && stack.isEmpty())
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}