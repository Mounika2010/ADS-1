import java.util.Scanner;
import java.util.HashMap;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //function.
    }
    /**
     * main function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        HashMap<String, Studentinfo> hash = new HashMap<String, Studentinfo>();
        sc.nextLine();
        for (int i = 0; i <= m; i++) {
            String[] inputs = sc.nextLine().split(",");
            hash.put(inputs[0], new Student(inputs[0], inputs[1],
                Double.valueOf(inputs[2])));
        }
    }
}
//         int n = sc.nextInt();
//         sc.nextLine();
//         for (int i = 0; i <= n; i++) {
//             String[] inputs = sc.nextLine().split(" ");
//             switch (inputs[2]) {
//                 case "1":
//                 Student s = (hash.get(inputs[1]));
//                 if (s == null) {
//                     System.out.println("Student doesn't exists...");
//                     break;
//                 }
//                 System.out.println(s.getname());
//                 break;
//                 case "2":
//                 Student st = hash.get(inputs[1]);
//                 if (st == null) {
//                     System.out.println("Student doesn't exists...");
//                     break;
//                 }
//                 System.out.println(st.getmarks());
//                 break;
//                 default:
//                 break;
//             }
//         }
//     }
//}