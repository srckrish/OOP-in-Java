// 16. Write a program to display the 5th element of an array using for each loop? 

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int count = 1;
        for (int i : arr) {
            if (count == 5) {
                System.out.print(i);
                break;
            }
            count++;
        }
    }
}
