package week4.day1;

public class LearnOverloading {
	
	public void reportStep(String msg, String status) {
		
		System.out.println(msg+" and "+status);
	}
	public void reportStep(String msg, String status, boolean snap) {
		
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
		}
	public static void main(String[] args) {
		
		LearnOverloading learn = new LearnOverloading();
		
		learn.reportStep("Valid","Pass ");
		learn.reportStep("Invalid", "Fail", false);
	}
	
    
}