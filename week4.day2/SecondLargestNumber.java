package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

        // Step 1: Declare the array
        int[] numbers = {3, 2, 11, 4, 6, 7};

        // Step 2: Add values to a list
        List<Integer> list = new ArrayList<Integer>();
        for (int n : numbers) {
            list.add(n);
        }

        // Step 3: Sort the list in ascending order
        Collections.sort(list);

        // Step 4: Get the second largest → last index - 1
        int secondLargest = list.get(list.size() - 2);

        // Step 5: Print the result
        System.out.println("Second largest number: " + secondLargest);
    }
}
