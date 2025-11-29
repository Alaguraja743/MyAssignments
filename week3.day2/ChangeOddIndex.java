package week3.day2;

public class ChangeOddIndex {
	
	public static void main(String[] args) {

        String test = "changeme";

        char[] charArray = test.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
        	
            if (i % 2 != 0) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        
        System.out.print("Output: ");
        for (char c : charArray) {
            System.out.print(c);
        }
    }

}
