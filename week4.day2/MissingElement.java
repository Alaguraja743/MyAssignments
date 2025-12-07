package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

    public static void main(String[] args) {

        // Step 1: Declare the array
        int[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Add array values to a list
        List<Integer> list = new ArrayList<Integer>();
        for (int n : arr) {
            list.add(n);
        }

        // Step 3: Arrange the list in ascending order
        Collections.sort(list);

        // Step 4: Find missing numbers
        System.out.println("Missing numbers are:");

        for (int i = 0; i < list.size() - 1; i++) {

            int current = list.get(i);
            int next = list.get(i + 1);

            // Step 5: Check if there is a gap
            if (current + 1 != next) {

                // Print all numbers between current and next
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
    }
}