package atmpackages;

public class ATM_variables {
	private double balance;
	private double deposite;
	private double withdrawal;
	public ATM_variables() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	public double getWithdrawl() {
		return withdrawal;
	}
	public void setWithdrawl(double withdrawl) {
		this.withdrawal = withdrawl;
	}
	@Override
	public String toString() {
		return "ATM_variables [balance=" + balance + ", deposite=" + deposite + ", withdrawl=" + withdrawal + "]";
	}

}
