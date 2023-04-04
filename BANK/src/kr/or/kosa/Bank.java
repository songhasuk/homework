package kr.or.kosa;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private ArrayList<Account> accounts = new ArrayList<>(); // 계좌 (0개이상)
	private int totalAccount = accounts.size(); 		// 총계좌수
	
	
	
	// 계좌를 생성한다.
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
	}
	// 계좌를 찾는다 (계좌번호로)
	public Account getAccount(String accountNo) {
		
		Account result = null; 
		
		
		for (int i =0; i < accounts.size() ; i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				result = accounts.get(i);
				//컬랙션참조변수명.get(i)
			    //해당 제네릭 타입의 클래의 객체 중에서 
				//조건문에 해당되는 객체의 주소값을 대입해준다.			
			}
		}
		
		return result; 
		//반환형이 Account여서 account의 객체값이 반환된다. 
	}
	// 계좌를 찾는다 (소유자명으로) 여러개나옴
	public ArrayList<Account> findAccounts(String name){
		ArrayList<Account> result = new ArrayList<>();
		
//		for(Account value : accounts) {
//			if(value.getName().equals(name)) {
//				result.add(value);
//				
//			}
//		
//		}
		
		for (int i =0; i < accounts.size() ; i++) {
			if(accounts.get(i).getName().equals(name)) {
				result.add(accounts.get(i));
				
			}
		}
		
		return result;
	}
	// 계좌목록을 본다.
	public ArrayList<Account> getAccounts(){
		
		
		
		return this.accounts;
	}
	// 총계좌수를 반환한다.
	public int getTotalAccount() {
		int num = this.accounts.size();
		
	
		return num;
	}
	
	
	
	
}
