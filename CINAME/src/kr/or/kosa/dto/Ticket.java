package kr.or.kosa.dto;

import java.util.Scanner;

public class Ticket {
	private String[][] t_seat = new String[4][5];;
	private int[][] ticket = new int[4][5] ;
	private int row =0, columm =0; 
	
	Scanner sc = new Scanner(System.in);
	//Cinema cinema = new Cinema();
	
	public String getT_seat(int j, int i) {
		return t_seat[j][i];
	}
	public void setT_seat(int j, int i, String c_seat) {
		this.t_seat[j][i] = c_seat;
		
	}
	public int getTicket(int j, int i) {
		return ticket[j][i];
	}
	public void setTicket(int j, int i, int ticketMumber) {
		this.ticket[j][i] = ticketMumber;

	}
	
	public void searchTicket() {
		
		
		System.out.println("예매하신 번호를 입력해주세요:");
		int ticketMumber = sc.nextInt();
		for(int i =0 ; i<ticket.length ; i++) {  // 좌석 초기값 지정
			for(int j=0; j<ticket[i].length ; j++ ) {
				if(ticket[i][j] == ticketMumber) {
					System.out.println("고객님의 예매하신 좌석은"+t_seat[i][j]+"입니다.");
					row = j;
					columm = i;
				}
				
				
			}
		
		}

		
	}
	public void cancelTicket(Cinema cinema) {
		
			int num;
			System.out.println("예매를 취소하시겠습니까?");
			System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요");
			num = sc.nextInt();
			System.out.println(row);
			System.out.println(columm);
			System.out.println(t_seat[columm][row]);
			cinema.setSeat(row, columm, t_seat[columm][row]); 
		System.out.println("예매가 취소되었습니다. 감사합니다.");
		
		
	}

	
	

}
