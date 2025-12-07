package week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending Request to "+endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println("Sending Request : "+endpoint);
		System.out.println("Requesting the Body "+requestBody);
		System.out.println("Request Done successfully?? : "+requestStatus);
		
	}
    public static void main(String[] args) {
    	
    	APIClient client = new APIClient();
    	
    	client.sendRequest("http://Login Page/");
    	client.sendRequest("http://Home Page/", "{username,pasword}",true);
    	
    	
    }

}
