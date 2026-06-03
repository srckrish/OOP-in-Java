public class LoopsInJava {
    public static void main(String args[]) {
        int num = 10;
        while (num > 0) {
            System.out.println("Number is " + num);
            num--;
        }

        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // For Loop
        for (int j = 90; j < 100; j++) {
            System.out.println(j);
        }

    }
}