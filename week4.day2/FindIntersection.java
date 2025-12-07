package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

    public static void main(String[] args) {

        // Step 1: Declare both arrays
        int[] arr1 = {3, 2, 11, 4, 6, 7};
        int[] arr2 = {1, 2, 8, 4, 9, 7};

        // Step 2: Add array1 values to list1
        List<Integer> list1 = new ArrayList<Integer>();
        for (int n : arr1) {
            list1.add(n);
        }

        // Step 3: Add array2 values to list2
        List<Integer> list2 = new ArrayList<Integer>();
        for (int n : arr2) {
            list2.add(n);
        }

        // Step 4: Compare both lists and find matching numbers
        System.out.println("Intersection values:");
        for (int i = 0; i < list1.size(); i++) {

            if (list2.contains(list1.get(i))) {  // check if value exists in second list
                System.out.println(list1.get(i));
            }
        }
    }
}
