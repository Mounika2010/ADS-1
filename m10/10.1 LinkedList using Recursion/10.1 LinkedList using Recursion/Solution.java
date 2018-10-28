import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {

    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (s.hasNextLine()) {
            String[] input = s.nextLine().split(" ");
            switch (input[0]) {
                case "insertAt" :
                try {
                ll.insertAt(Integer.parseInt(input[1]), input[2]);
                ll.display();
            } catch (Exception e) {
                    System.out.println("Can't insert at this position.");
                }
                break;
                case "reverse" :
                try {
                ll.reverse();
                ll.display();
            } catch (Exception e) {
                System.out.println("No elements to reverse.");
                }
                break;
                default : ;
            }
        }
    }
}
class Node {
    String data;
    Node next;
    Node(String val) {
        this.data = val;
    }
}
class LinkedList {
    Node first;
    int size;
    LinkedList() {
        first = null;
        size = 0;
    }
    void insertAt(int index, String val) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception();
        }
        Node element = new Node(val);
        first = insertAt(index, first, element, 0);
    }
    Node insertAt(int index, Node first, Node element, int count) {
        if (count == index) {
            element.next = first;
            size++;
            return element;
        }
        first.next = insertAt(index, first.next, element, count+1);
        return first;
    }
    void reverse() throws Exception {
        if (first == null) {
            throw new Exception();
        }
        reverse (null, first);
    }
    void reverse(Node prev, Node current) {
        if(current != null) {
            reverse(current, current.next);
            current.next = prev;
        } else {
            first = prev;
        }

        
    }
    void display() {
        Node temp = first;
        String str = "";
        while(temp != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length()-2));
    }
}