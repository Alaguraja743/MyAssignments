package week4.day1;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Payment type :Cash on Delivery");
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment type :Gpay");
	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment type :Canara bank Credit card");
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Payment type : Canara Net Banking");
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Payments done via Gpay");
	}
	public static void main (String[] args) {
		
		Amazon amazon = new Amazon();
		amazon.upiPayments();
		amazon.recordPaymentDetails();
		
		
		
	}

}
