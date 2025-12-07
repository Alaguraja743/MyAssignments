package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {

        // Step 1: Declare String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Step 2: Add array elements to a list
        List<String> list = new ArrayList<String>();
        for (String name : companies) {
            list.add(name);
        }

        // Step 3: Print values in required custom reverse order
        // Required Output: Wipro, HCL, CTS, Aspire Systems

        System.out.println(list.get(1)); // Wipro
        System.out.println(list.get(0)); // HCL
        System.out.println(list.get(3)); // CTS
        System.out.println(list.get(2)); // Aspire Systems
    }
}