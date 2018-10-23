import java.util.Scanner;

class MinHeap<E extends Comparable<E>> {
	    
	public void MinHeap(E[] arr) {
	    	this.array = arr;
	}

	public boolean isMinHeap(E[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            if (!less(arr1[i], arr1[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public boolean less(final E i, final E j) {
        return i.compareTo(j) <= 0;
    }

    public class Solution {
   
    Solution() {
    }

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        










