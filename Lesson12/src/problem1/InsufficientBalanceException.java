package problem1;

public class InsufficientBalanceException extends Exception {
	String message;

	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}
