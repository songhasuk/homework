package kr.or.kosa.dto;

import java.awt.Choice;
import java.util.Random;
import java.util.Scanner;

public class Cinema {
	
	private String[][] seat = new String[4][5];
	
	private String c_seat ;
	private int ticketMumber;
	
	
	
	Ticket ticket = new Ticket();
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	public String print() {
		
		System.out.println("1.예매하기");
		System.out.println("2.예매조회");
		System.out.println("3.예매취소");
		String choice = sc.nextLine();
		return choice;
	}


	public void run() {
		
		fist_seat();
		
		while(true) {
		switch (print()) {
			case "1":  {
				Ticketing();
				break;
			}case "2": {
				ticket.searchTicket();
				break;
			}case "3": {
				ticket.searchTicket();
				ticket.cancelTicket(this);
				break;
			}default:
				System.out.println("잘못 입력했습니다.");
			}
		}

	}
	
	
	
	
	public void Ticketing() {
		
		
		for(int i =0 ; i<seat.length ; i++) {  // 좌석 초기값 지정
			for(int j=0; j<seat[i].length ; j++ ) {
				System.out.print("["+seat[i][j]+"]\t");
			}
			System.out.println();
		}
		
		
		System.out.println("좌석을 선택해주세요. (ex: 1-1)");
		c_seat = sc.nextLine();
		boolean b_seat = false ;
		int row=0, column = 0;
		
	
		for(int i =0 ; i<seat.length ; i++) {
			for(int j=0; j<seat[i].length ; j++ ) {
				if(seat[i][j].equals(c_seat) == true) {
					b_seat = true;
					row = i;
					column = j;
					
					ticket.setTicket(row, column, random.nextInt(90000000) + 10000000);
					ticket.setT_seat(row, column, seat[i][j]);
			}
		}
			
}
		if(b_seat == true) {
			
			System.out.println("[좌석번호] :"+ticket.getT_seat(row, column)+" [예매번호]"+ticket.getTicket(row, column));
			System.out.println("예매 가능합니다, 예매하시겠습니까?");
			System.out.println("네(1), 아니오(2), 초기화면(0)");
			String choice = sc.nextLine();
			
			switch (choice) {
			case "1": {
				seat(column,row);
				break;
			}case "2": {
				Ticketing();
				break;
			}case "0": {
				print();
				break;
			}
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
}
			
				

	
	
	public void fist_seat() {
	
	
		for(int i =0 ; i<seat.length ; i++) {  // 좌석 초기값 지정
			for(int j=0; j<seat[i].length ; j++ ) {
				seat[i][j] = String.valueOf(i+1) + "-" + String.valueOf(j+1) ;
				
			}
		
		}
		}
	
	
	public void seat(int i, int j) {
	
	
		//System.out.println(seat[i][j]);
		seat[j][i] = "예매"; 
		//System.out.println(seat[i][j]);
		
	}
	
	
	public String[][] getSeat() {
		return seat;
	}




	public void setSeat(int j, int i, String t_seat) {
		this.seat[i][j] = t_seat;
	}


}
