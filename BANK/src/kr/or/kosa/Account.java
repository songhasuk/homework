package kr.or.kosa;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String accountNo;				// 계좌번호
	private String name;					// 소유자명
	private long balance;					// 잔고
	private ArrayList<Transaction> transactions = new ArrayList<>();	// 거래내역 (0개이상)
	
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		//잔고 0, 
	}
	
	//1. 입금한다.
	public void deposit(long amount) { // amount 거래금액
				
		this.balance += amount;
		transactions.add(new Transaction(amount, "입금", this.balance));
		
		//transactions.add();
	}
	//2. 출금한다.
	public void withdraw(long amount) { // amount 거래금액
		this.balance -= amount;
		transactions.add(new Transaction(amount, "출금", this.balance));
	}
	//3. 잔고를 확인한다.
	public long getBalance() {
			
			return this.balance;
	}
	//4. 거래내역을 본다.
	public ArrayList<Transaction> getTransaction(){
			

		
			return transactions;
		}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	@Override
	public String toString() {
		return "[계좌번호 : " + accountNo + " 잔액 : " + balance + "]";
	}
	

	
	
}
