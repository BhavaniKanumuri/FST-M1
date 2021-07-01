package activities;

class CustomException extends Exception{
	private String message=null;
	//Add Constructor
	public CustomException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}

public class Activity8 {

	public static void main(String[] args) {
	
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
		}
		catch(CustomException cmsg) {
			System.out.println("THis is inside Catch block: "+ cmsg.getMessage());
		}

	}
	static void exceptionTest(String str) throws CustomException{
		if(str==null) {
			throw new CustomException("Srting value is null");
		}
		else {
			System.out.println(str);
		}
	}

}
