public class TypeCasting {
    public static void main(String args[]) {
        // implicit type casting

        int num1 = 10;
        double num2 = num1;
        System.out.println(num1 + " becomes " + num2);

        // explicit type casting

        double num = 1.67;
        int toInteger = (int) num;
        System.out.println(num + " becomes " + toInteger);
    }
}