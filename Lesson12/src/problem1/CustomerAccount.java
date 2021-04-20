package problem1;

public class CustomerAccount {
	private String cus_name;
	private String acc_No;
	private double balance;

	public CustomerAccount(String cus_name, String acc_No, double balance) {
		this.cus_name = cus_name;
		this.acc_No = acc_No;
		this.balance = balance;
	}

	public boolean deposit(double amount) throws InsufficientBalanceException {

		if (amount <= 0) {
			throw new InsufficientBalanceException("Insufficient amount!");
		}
		this.balance += amount;
		return true;
	}

	public boolean withdraw(double amount) throws InsufficientBalanceException {
		if (this.balance < amount) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		this.balance -= amount;
		return true;
	}

	public double getBalance() throws InsufficientBalanceException {
		if (this.balance < 100) {
			throw new InsufficientBalanceException("Balance reach minimum threshold!");
		}
		return this.balance;
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		CustomerAccount ca = new CustomerAccount("Misgan", "1000", 50.0);
		ca.deposit(400);
		ca.withdraw(50);
		System.out.println(ca.getBalance());
		System.out.println(ca.toString());

	}

	@Override
	public String toString() {
		return "CustomerAccount [cus_name=" + cus_name + ", acc_No=" + acc_No + ", balance=" + balance + "]";
	}

}
