package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int number = 29;   // Change this number to test any value
        boolean isPrime = true;

        // 0, 1 and negative numbers are NOT prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;   // no need to continue checking
                }
            }
        }

        // printing result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}