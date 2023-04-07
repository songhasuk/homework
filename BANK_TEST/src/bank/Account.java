package bank;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

public class Account {
	
	private String accountNo; // 계좌번호
	private String name; // 소유자명
	private long balance; //잔고
	private ArrayList<Transaction> tlist = new ArrayList<>(); // 거래내역(n)
	
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
	}
	
	//입금한다
	public void deposit(long amount) {
		this.balance += amount;
		tlist.add(new Transaction("입금", amount, this.balance));
	}
	//출금한다
	public void withdraw(long amount) {
		this.balance -= amount;
		tlist.add(new Transaction("출금", amount, this.balance));
	}
	//잔고를 확인한다.
	public long getBalance() {
		
		return this.balance;
	}
	//거래내역을 본다.
	public ArrayList<Transaction> getTransactions() {
		ArrayList<Transaction> transactions = new ArrayList<>();
		
		for(Transaction value : tlist) {
			transactions.add(value);
		}
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

	public ArrayList<Transaction> getTlist() {
		return tlist;
	}

	public void setTlist(ArrayList<Transaction> tlist) {
		this.tlist = tlist;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}

	
	public String toString2() {
		return "Account [accountNo=" + accountNo + ", name=" + name + "]";
	}
	
	



	
	
	
	
	

}
