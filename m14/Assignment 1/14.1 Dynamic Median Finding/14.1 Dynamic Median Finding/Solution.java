import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        MinPQ<Float> minpq = new MinPQ<Float>(n);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(n);

        Float median = 0.0f;
        for (int i = 0; i < n; i++) {
            Float val = scan.nextFloat();
            if (val > median) {
                minpq.insert(val);
            } else {
                maxpq.insert(val);
            }

            if (maxpq.size() - minpq.size() > 1) {
                maxpq.insert(minpq.delMin());
                
            }

            if (minpq.size() == maxpq.size()) {
                median = (minpq.min() + maxpq.max()) / 2;
                System.out.println(median);
            }

            else if (minpq.size() > maxpq.size()) {
                median = minpq.min();
                System.out.println(median);
            }

            median = minpq.min();
            System.out.println(median);

        }

    }
}
