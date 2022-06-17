// 은행 계좌
// 필드 : 잔고(int)
// 메소드 : 입금(int) : void
//		    출금 (int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마?)를 발생시켜 throws..
//        getter() : int
class BankWithdrawException extends RuntimeException {
	private int lack;

	public BankWithdrawException(String message, int lack) {
		super(message);
		this.lack = lack;
	}
	
	public int getLack() {
		return lack;
	}
}

class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) throws BankWithdrawException {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new BankWithdrawException("잔고가 부족함", amount - balance);
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}


public class Main6 {
	public static void main(String[] args) {
		BankAccount b = new BankAccount(1000);
		// 입금 계좌 객체 생성
		
		b.deposit(1000); //1000원입금
//	System.out.println("1.입금   2.출금  3.계좌내역  4.종료");
	try {
		b.withdraw(2500);
		System.out.println(b.getBalance());
	} catch (BankWithdrawException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getLack());
	}
	
	
	
		// 은행계좌 객체 생성
		// 입금 / 출금/ 게터 테스트
		// 출금 호출 >> 예외 처리(try - catch)

	}

}
