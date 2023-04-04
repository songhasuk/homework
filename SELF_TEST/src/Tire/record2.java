package Tire;

import java.util.Scanner;

public class record2 {
	
	public Tire tier;
	public Tire[] tier2;
	public int index;

	public void input() {

		tier.print();
		
		}
	
	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 타이어를 찍어내겠습니까?");
		int chiose = Integer.parseInt(sc.nextLine());
		
			switch (chiose) {
			case 1: {
				tier =  new Ctire();
				tier.print();
				break;
			}case 2: {
				tier =  new Dtird();
				tier.print();
				break;
			}case 3: {
				break;
			}
			default:
				System.out.println("잘못 입력했습니다");
			}
	}
	
	public void intut3(Tire t, int num) {
		
	}
	
	
//	public void serialNumber() {
//		int serial = 
//		System.out.println("시리얼 넘버를 입력해주세요");
//		
//	}
	
}
