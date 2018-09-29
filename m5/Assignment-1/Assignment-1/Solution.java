import java.util.Scanner;

// class Node {
// 	public String str;
// 	public Node digit;

// 	Node(int data) {
// 		 this.data = data;
// 		 this.link = null;
// 	}

// 	public int getString() {
// 		return this.str;
// 	}

// 	public Node getDigit() {
// 		return this.digit;
// 	}

// 	public void setString(int str) {
// 		this.data = data;
// 	}

// 	public void setDigit(Node digit) {
// 		this.digit = digit;
// 	}

// }

class LinkedList {
	private Node start;
	private int size;

	LinkedList() { 
		this.start = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	private static class Node {
		private int data;
		private Node next;
	}

	private Node first;
	public boolean isEmpty() {
		return first == null;

	}

	public void push(int item) {
		Node temp = new Node();
		// if (temp == null) {
		// 	throw new Exception("Stack is full");
		// }

		temp.data = item;
		temp.next = first;
		first = temp;
	}

	public int pop() {
	// if (first == null) {
	// 		throw new  NoSuchElementException("Stack is empty");
	// 	}
	int data = first.data;
	first = first.next;
	size--;
	return data;
	}
}

class AddLargeNumbers {
    
 //    public static LinkedList numberToDigits(String number) {

 //    	LinkedList linkl = new LinkedList();
 //        String[] digits = number.split("");
 //        // String[] digits = new String[](number);
 //        for (int i = 0; i < digits.length; i++) {
 //            linkl.push(digits[i]);
 //        }
 //        return linkl;
	// }
	
  //   	if (start == null) {
		// 	Node newnode = new Node(number);
		// 	start = newnode;
		// } else {
		// 	Node newNode = new Node(number);
		// 	Node a = start;
		// 	Node temp = start;
		// 	while (temp.getString() != null) {
		// 		temp = temp.getDigit();
		// 	}
		// 	temp.setString(newNode);
		// }
		// size++;
  		
	

    public static String digitsToNumber(LinkedList list) {
    	String num = "";
        while (!list.isEmpty()) {
            num += list.pop();
        }
        return num;
	}



   //  public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
   //  	return;
  	// }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                // LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                // LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                // System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                // System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                // pDigits = AddLargeNumbers.numberToDigits(p);
                // qDigits = AddLargeNumbers.numberToDigits(q);
                // LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                // System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
