package stackWithArray;

public class StackUnderFlowException extends RuntimeException {
	public StackUnderFlowException() {
		super("stack empty exception");
	}

}
