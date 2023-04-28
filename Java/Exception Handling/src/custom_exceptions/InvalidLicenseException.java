package custom_exceptions;

@SuppressWarnings("serial") // suppress serial buffer related warning 
public class InvalidLicenseException extends RuntimeException{ // extend Runtime Exception to make a unchecked Exception 
	public InvalidLicenseException(String errorMsg) {
		super(errorMsg);
	}
}

