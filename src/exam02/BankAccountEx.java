package exam02;

public class BankAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("111-111-111","홍길동",1000);
		BankAccount account2 = new BankAccount("222-222-222","임꺽정",200);
		
		//입급
		account1.deposit(200);
		//출금
		account2.withdraw(100);
		//잔액조회
		account1.balance();
	}

}
