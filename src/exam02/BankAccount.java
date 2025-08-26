package exam02;

public class BankAccount {
	 String accountNumber;
	 String owner;
	 int balance;
	 
	 public BankAccount() {};
	 public BankAccount(String accountNumber, String owner, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	 
	 public void deposit(int x) {
		 balance += x;
		 System.out.println("입금 후 잔액은 " + balance + " 입니다");
	 }
	 
	 public void withdraw(int x) {
		 balance += x;
		 System.out.println("출금 후 잔액은 " + balance + " 입니다");
	 }
	 
	 public void balance() {
		 System.out.println(this.getOwner()+" 님의 잔액은 " + balance + " 입니다");
	 }
	 
		/*
		 * public int transfer(int amuont, String BankAccount, String otherAccount) {
		 * return }
		 */
	 public String getOwner() {
		 return owner;
	 }
	 public void setOwner(String owner) {
		 this.owner = owner;
	 }
	 
}
