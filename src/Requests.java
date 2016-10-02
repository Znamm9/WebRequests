public class Requests {

	public static void main(String[] args) throws Exception{
		
		HttpRequestExampleGET getRequest = new HttpRequestExampleGET();
		getRequest.sendGet();
		
		HttpExamplePOST postRequest = new HttpExamplePOST();
		postRequest.sendPost();
		
	}
	
}
