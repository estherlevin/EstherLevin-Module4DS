package stackWithArray;

public class StackOverFlowException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackOverFlowException() {
    	super("stack overflow");
    }
}
