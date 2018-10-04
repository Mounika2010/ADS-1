import java.util.Scanner;

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

}


class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {

    	LinkedList linkl = new LinkedList();
        String[] digits = number.split("");
        for (int i = 0; i < digits.length; i++) {
            linkl.push(digits[i]);
        }
        return linkl;
	}

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
