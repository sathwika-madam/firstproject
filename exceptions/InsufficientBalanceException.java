package exceptions;
//Custom Exception Class for Handling the Exception
public class InsufficientBalanceException extends Exception {
	//Variable Declaration
	String msg;
	//Using Constructor
	public InsufficientBalanceException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
	


