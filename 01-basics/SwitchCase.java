public class SwitchCase {
    public static void main(String args[]) {
        String day = "Monday";

        switch (day) {

            // Using break keyword

            /*
             * case "Saturday", "Sunday":
             * System.out.println("8am");
             * break;
             * 
             * case "Monday":
             * System.out.println("6am");
             * break;
             * 
             * default:
             * System.out.println("7am");
             */

            // Replacing : with ->, it works as break without break keyword
            case "Saturday", "Sunday" -> System.out.println("8am");
            case "Monday" -> System.out.println("6am");
            default -> System.out.println("7am");

        }

        // with Switch expression
        /*
         * String result = "";
         * result = switch (day) {
         * case "Saturday", "Sunday" -> "8am";
         * case "Monday" -> "6am";
         * default -> "7am";
         * };
         * System.out.println(result);
         */

        // Switch expression with yield

        String result = "";
        result = switch (day) {
            case "Saturday", "Sunday":
                yield "8am";
            case "Monday":
                yield "6am";
            default:
                yield "7am";
        };
        System.out.println(result);

    }
}