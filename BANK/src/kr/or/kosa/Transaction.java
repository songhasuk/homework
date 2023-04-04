package kr.or.kosa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Transaction  {

	 DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	 DateTimeFormatter sdf2 = DateTimeFormatter.ofPattern("HH:mm:ss");

    
	

	private String transactionDate;	// 거래일
	private String transactionTime; // 거래시간
	private String kind;			// 구분 (입금 or 출금)
	private long amount;			// 거래금액
	private long balance;			// 잔액
	
	
	
	public Transaction(long amount, String kind, long balance) {
		LocalDate now = LocalDate.now();
		LocalTime now2 = LocalTime.now();
		this.transactionDate = now.format(sdf);
		this.transactionTime = now2.format(sdf2);
		this.amount = amount;
		this.kind = kind;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "[거래금액: " + amount +  ", 잔액 : "+balance+" 원 / "+transactionDate+" "+transactionTime+ "]";
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
