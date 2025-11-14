package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

        int input = 121;      // given number
        int output = 0;       // to store reversed number
        int temp = input;     // temporary variable to preserve input

        // reverse the number using a loop
        for (; temp > 0; temp = temp / 10) {
            int digit = temp % 10;       // get last digit
            output = (output * 10) + digit;  // build reversed number
        }

        // check palindrome
        if (input == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is Not a Palindrome");
        }
    }
}
