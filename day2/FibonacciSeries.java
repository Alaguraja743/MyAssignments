package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;  
        int a = 0, b = 1;

        System.out.println("Fibonacci Series for range " + range + ":");

        for (int i = 1; i <= range; i++) {
        	System.out.print(a + " ");
        	
            int next = a + b;  
            a = b;             
            b = next;
        }
    }
}
