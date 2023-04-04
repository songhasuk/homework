package bank;

public class Transaction {
	
	
	
	private String transactionDate; // 거래일
	private String transactionTime; // 거래시간
	private String kind; // 구분(입금, 출금)
	private long amount; // 거래금액
	private long balance; // 잔고
	
	public Transaction(String kind, long amount, long balance) {
		
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
		
	}

	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
}
