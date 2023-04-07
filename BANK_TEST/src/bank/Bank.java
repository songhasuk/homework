package bank;

import java.security.AllPermission;
import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> alist = new ArrayList<>(); //계좌
	private int totalAccount ;  //총계좌수
	
	//계좌를 생성한다
	public void addAccount(String accountNo, String name) {
		alist.add(new Account(accountNo, name));
		
	}
	
	//계좌를 찾는다(계좌번호로)
	public Account getAccount(String accountNo) {
		Account account = null;
		
//		for(Account value : alist) {
//			if(accountNo.equals(value.getAccountNo())) {
//				account = value;
//			}
//		}
		
		for (int i =0 ; i < alist.size() ; i++) {
			
			if(accountNo.equals(alist.get(i).getAccountNo())) {
				account = alist.get(i);
			}
		}
		
		return account;
	}
	
	//계좌를 찾는다(소유자명으로)
	public ArrayList<Account> getAccounts(String name){
		
		ArrayList<Account> accounts = new  ArrayList<>();
		
//		for(Account account : alist) {
//			if(name.equals(account.getName())) {
//				accounts.add(account);
//				
//			}
//		}
		
		for (int i =0 ; i < alist.size() ; i++) {
			
			if(name.equals(alist.get(i).getName())) {
				accounts.add(alist.get(i));
			}
		}
		
		
		return accounts;
	}
	
	//계좌목록을 본다.
	public ArrayList<Account> getAccounts(){
		return this.alist;
	}
	
	//총계좌수를 반환한다.
	public int getTotalAccount() {
		int num = this.alist.size();
		return num;
	}
	
	
	

	public ArrayList<Account> getAlist() {
		return alist;
	}

	public void setAlist(ArrayList<Account> alist) {
		this.alist = alist;
	}

	public void setTotalAccount(int totalAccount) {
		this.totalAccount = totalAccount;
	}
	
	
	
	
}
