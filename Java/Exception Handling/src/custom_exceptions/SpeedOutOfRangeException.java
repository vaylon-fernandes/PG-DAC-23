package custom_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception{ // Checked Exception 
	public SpeedOutOfRangeException(String errorMessage) {
		super(errorMessage);
	}
}
