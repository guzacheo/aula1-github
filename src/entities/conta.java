package entities;

public class conta {
	private int accnumber;
	private String holder;
	private double balance;
	
	
	public conta(int accnumber, String holder, double inicialDeposit) {
		this.accnumber = accnumber;
		this.holder = holder;
		
		// Se a regra de depositos muda, o deposito inicial se adapta automaticamente
		deposit(inicialDeposit);
	}
	
	public conta(int accnumber, String holder) {
		this.accnumber = accnumber;
		this.holder = holder;
	}	
	
	public int getAccnumber() {
		return accnumber;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw + 5;
	}
	
	public String toString() {
		return "Account: " + accnumber +
				", Holder: " + holder +
				", Balance: $ " + String.format("%.2f", balance);
	}
}
