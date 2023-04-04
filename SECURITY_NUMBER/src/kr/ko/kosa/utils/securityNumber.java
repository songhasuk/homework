package kr.ko.kosa.utils;

import java.awt.CheckboxGroup;
import java.util.Scanner;

public class securityNumber {
	
	private String gender;
	private String front, back;
	private String securityNumber;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public boolean numberlength() {
		boolean length;
		if(securityNumber.length() <= 14) {
			length = true;
			
			return length;
		}else {
			length = false;
			
			return length;
		}
		
	}
	
	public void checkGender() {
		if(securityNumber.charAt(7) == '1' || securityNumber.charAt(7) == '3') {
			gender = "남성";
			System.out.println(gender+"입니다.");
		}else if(securityNumber.charAt(7) == '2' || securityNumber.charAt(7) == '4') {
			gender = "여성";
			System.out.println(gender+"입니다.");
		}
	}
	
	public boolean checkBackNumber() {
		System.out.println(securityNumber);
		
		String a = securityNumber.substring(7, 8);
		System.out.println("주민 뒷첫자리 : " + a);
		
		int num = Integer.parseInt(a);
		
		if(num >= 1 && num <= 4) {
			System.out.println("주민 맞음");
			return true;
		}else {
			
			System.out.println("주민 틀림");
			return false;
		}
		
		//return (num >= 1 && num <= 4) ?  true : false;
		
		
	}
	
	public void prirntMenu() {
		System.out.println("1. 주민번호를 입력");
		System.out.println("2. 프로그램종료");
		
	}
	
	

	public void run() {
		
		
		while (true) {	
			prirntMenu();
			int menuNum =intChk();
			switch (menuNum) {
				case 1: {
					inputSecurityNumber();
					checkGender();
					checkBackNumber();
					checkGender();
					break;
				}case 2:{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			} //switch
		}//while
	} // run
	
	public int intChk() {
		int num = 0;
		boolean power = true;
		while (power) {
			try {
				num = Integer.parseInt(sc.nextLine());
				power = false;
			} catch (Exception e) {
				System.out.println("숫자를 제대로 입력해주세요");
			}
		}
		return num;
	}//
	
	public void inputSecurityNumber(){
		
		while(true) {
			System.out.println("주민번호 입력해주세요");
			securityNumber = sc.nextLine();
			if(securityNumber instanceof String) {
				return;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		
	}
	
	
	public String getSecurityNumber() {
		return securityNumber;
	}


	public void setSecurityNumber(String securityNumber) {
		

		this.securityNumber = securityNumber;
			
			
	}


}
