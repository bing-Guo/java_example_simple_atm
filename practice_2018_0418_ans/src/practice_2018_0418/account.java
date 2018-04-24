package practice_2018_0418;

public class account {
	private String name;
	private String accountId;
	private int balance;
	
	public account(String name, String id) {
		this.name = name;
		this.accountId = id;
		this.balance = 0;
	}
	
	public account(String name, String id, int balance) {
		this.name = name;
		this.accountId = id;
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount){
		if(amount > 0){
			this.balance += amount;
		}else{
			System.out.println("™˜√Bø˘ª~°C");
		}
	}
	
	public void withdraw(int amount) {
		if(this.balance >= amount){
			this.balance -= amount;
		}else{
			System.out.println("æl√B§£®¨°C");
		}
	}
	
	public String toSting() {
		return String.format("Account(%s, %s, %d)", this.name, this.accountId, this.balance);
	}
	
	public void transfer(account toAccount, int amount) {
		if(this.balance >= amount){
			this.withdraw(amount);
			toAccount.deposit(amount);
		}else{
			System.out.println("æl√B§£®¨°C");
		}
	}
}
