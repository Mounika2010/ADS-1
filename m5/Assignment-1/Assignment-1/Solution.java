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

// class LinkedList {
// 	Node start;
// 	Node last;
// 	int size;

// 	LinkedList() { 
// 		this.start = null;
// 		this.size = 0;
// 	}
// class Node {
// 	String data;
//     Node next;
   
//     Node(String data) {

// 		this.data = data;
// 	}

// 	public int size() {
// 		return this.size;
// 	}
// }

// 	public boolean isEmpty() {
// 		return first == null;

// 	}

// 	public void push(int item) {
// 		Node temp = new Node();
// 		// if (temp == null) {
// 		// 	throw new Exception("Stack is full");
// 		// }

// 		temp.data = item;
// 		temp.next = first;
// 		first = temp;
// 	}

// 	public int pop() {
// 	// if (first == null) {
// 	// 		throw new  NoSuchElementException("Stack is empty");
// 	// 	}
// 	int data = first.data;
// 	first = first.next;
// 	size--;
// 	return data;
// 	}

// }
class LinkedList {
    Node start = null;
    Node last = null;
    int size = 0;

    LinkedList() { 
		this.start = null;
		this.size = 0;
	}
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void push(String item) {
        Node newnode = new Node(item);
        if (isEmpty()) {
            start = newnode;
            last = start;
            last.next = null;
            size++;
            return;
        }

    }
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String item = start.data;
        start = start.next;
        size--;
        return item;

}
	public void List() {
        Node firstnode = start;
        while (firstnode != null) {
            System.out.print(firstnode.data + " ");
            firstnode = firstnode.next;
	}
}
}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {

    	LinkedList linkl = new LinkedList();
        String[] digits = number.split("");
        // String[] digits = new String[](number);
        for (int i = 0; i < digits.length; i++) {
            linkl.push(digits[i]);
        }
        return linkl;
	}
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
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                // LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                // System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
