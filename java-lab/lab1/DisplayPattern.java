// 17. write a program to print the following patterns. 

// public class DisplayPattern {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Output:
// *
// **
// ***
// ****
// *****

public class DisplayPattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
