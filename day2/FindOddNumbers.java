package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange = 10; // maximum range set to 10

        System.out.println("Odd numbers from 1 to " + maxRange + ":");

        // Loop from 1 to maxRange
        for (int i = 1; i <= maxRange; i++) {
            // Check if remainder when divided by 2 is 1
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

