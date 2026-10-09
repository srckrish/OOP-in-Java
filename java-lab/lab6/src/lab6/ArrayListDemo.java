package lab6;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        // Access element by index
        System.out.println("Element at index 2: " + list.get(2));

        // Remove an element
        list.remove("Banana");

        // Iterate using enhanced for loop
        System.out.println("Elements in the list:");

        for (String item : list) {
            System.out.println(item);
        }
    }
}