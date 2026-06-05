public class SingleDimensionsArray {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println("The elements at index 2 is: " + nums[2]); // output: 3

        // update value
        nums[2] = 8;
        System.out.println("Updated value at index 2 is: " + nums[2]); // output: 8

        int nums2[] = new int[4];
        System.out.println("Initial value is : " + nums2[1]); // inital value is always 0

        
        nums2[0] = 5;
        nums2[1] = 8;
        nums2[2] = 11;
        nums2[3] = 14;

        for (int i = 0; i < 4; i++) {
            System.out.print(nums2[i] + " ");

        }
    }
}