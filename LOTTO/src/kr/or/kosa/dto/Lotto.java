package kr.or.kosa.dto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/*
로또 시스템 class 설계 하세요 ^^
목적 : 클래스의 구성 요소를 이해하고 활용 할 수 있다
member field , constructor (초기화) , method 활용
접근자 한정자의 사용 , ....
기능을 함수 단위로 분리 할 수 있다 ^^
함수의 return type 과 parameter 를 활용할 수 있다

결국 Ex07_Array_Lotto_Quiz main함수 있는 내용을 별도의 기능으로 구현하세요

그러면
Ex08_Lotto 의 main 함수안에서

Lotto lotto = new Lotto();
lotto.start(); 
이런식으로 실행하면
메뉴가 나오고  .... 선택시 번호 추출하고 ..... 선택시 종료 되는 기능을 구현하시면 됩니다

그리고 조별만의 특수한 기능을 하나 추가하세요  
예를 들면 Lotto 배열의 평균이 특정 범위에 있으면 재추출
예를 들면  특정 값을 입력하면 Lotto 번호에서 배재하기
예를 들면  짝수값 배재하기 , 홀수값 배재하기 
지난차수  번호와 동일하면 재추출 등 1개 추가적인 선택 
*/
public class Lotto {
	//아래와 같이 ....
	private static Scanner scanner;
	private static int[][] rotto ;
	private static int[][] f_rotto = new int[5][6];
	private static int conunt; 
	



	public static int getConunt() {
		return conunt;
	}



	public void setCount(int count) {
		this.conunt = count;
	}



	public static int[][] getRotto() {
		return rotto;
	}

	public static void setRotto(int[][] rotto) { // value
		Lotto.rotto = rotto;
//		if()
//		for(int i = 0 ; i < f_rotto.length ; i++) {
//			 for(int j = 0 ; j < f_rotto[i].length ; j++) {
//				 if()
//				 System.out.print("유지"+f_rotto[i][j]);
//			 	}
//			 	System.out.println();
//			}
		
//		else
	
		 System.out.println(f_rotto.length);
	
	}

public void random(int value) {
		
		System.out.println("수량"+value);

		  
		  Random random = new Random();
	        
	        int[][] arr = new int[value][6];
	        // 중복 없는 6개의 난수 생성
	       if(value != 0 ) {
	        for (int i = 0 ; i < arr.length; i++) {
	            // 중복 없는 6개의 난수 생성
	            for (int j = 0; j < arr[i].length; j++) {
	                int num = random.nextInt(45) + 1;
	                // 한 행 내에서 중복된 값을 수정
	                for (int k = 0; k < j; k++) {
	                    if (arr[i][k] == num) {
	                        // 중복된 값이 있으면 1~45 사이의 난수를 다시 생성하여 대입
	                        num = random.nextInt(45) + 1;
	                        // 다시 중복을 확인
	                        k = -1;
	                    }
	                }
	                // 중복된 값이 없으면 해당 값을 2차원 배열에 저장s
	                arr[i][j] = num;
	            }
	        }
	       }else{
	        System.out.println("[복권 수량을 먼저 선택하십시요]");
	        
	       }
	       for (int i = 0; i < arr.length; i++) {
	            Arrays.sort(arr[i]);
	        }
	       
	       
	       setRotto(arr);

//	        for (int[] row : getRotto()) {
//	            for (int num : row) {
//	            	if(num == 0) {
//	            		
//	            		continue;
//	            	}else {
//	            		System.out.print(num + " ");
//	            	}
//	                
//	            }
//	            System.out.println();
//	        }
	  	 for(int i = 0 ; i < rotto.length ; i++) {
			 for(int j = 0 ; j < rotto[i].length ; j++) {
				 if (Lotto.f_rotto[i][j] == 0){
					 
						f_rotto[i][j] = rotto[i][j]; 
						
					}
				 System.out.print(f_rotto[i][j]+" ");
				
		 }
			 System.out.println();
	 }
	   
	         // 공용 2차원 배열 필드에 값 초기화

	 
	}

	public Lotto() {
		scanner = new Scanner(System.in);
	}
	
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 로또 구매 수량 정하기**");
		System.out.println("**2. 당첨 예상 번호 추출하기**");
		System.out.println("**3. 로또 번호 수정하기**");
		System.out.println("**6. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 :");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	//여러가지 기능을 가지는 함수를 생성 활용하세요
	// 기능 >> method >> 함수 하나당 기능 하나
	// public >> 참조변수
	// private >> 내부 사용 (공통)
	// 실번호 추출해 주세요
	// 중복값 나오면 안되요
	// 낮은 순으로 정렬해 주세요
	// 화면에 출력해 주세요
	// 메뉴 기능을 만들어 주세요 ( 실행 )
	
	// 로또를 몇장 구매하시겠습니까?
	// 램덤으로 배치받은 번호 중 특정 번호만 수정할 수 있게 만드는 코드
	
	
	
	public static void someLotto() {
	   
	
		
		System.out.println("몇 개의 로또를 구매하실 예정이십니까? : (1~5개)");
		//conunt = Integer.parseInt(scanner.nextLine());
		int num = Integer.parseInt(scanner.nextLine());
		if(num <= 5 && num >= 1 )
			System.out.println(conunt+","+num);
			conunt += num ;
			if(conunt <= 5) {
				System.out.println("[앞으로 구매 가능한 매수] :"+(5-conunt));
			}else {
				System.out.println("[하루 구매 수량 한도를 넘었습니다.]");
				
				
				
			}
		
			
	}

	
	
	
	public void upbateNumber() {
		
		 for(int i = 0 ; i < rotto.length ; i++) {
			 for(int j = 0 ; j < rotto[i].length ; j++) {
			
				 System.out.print(f_rotto[i][j]+" ");
				
		 }
			 System.out.println();
	 }
		System.out.println("수정하실 로또 장수를 선택해주세요:");
		int row = Integer.parseInt(scanner.nextLine());
		
	  	
	  System.out.println("몇자리 번호를 수정하시겠습니까?");
	 int clomm =  Integer.parseInt(scanner.nextLine());
	 System.out.println("수정하실 번호를 입력해주세요");
	 int input = Integer.parseInt(scanner.nextLine());
	 f_rotto[row-1][clomm-1] = input;  
	System.out.println("[수정완료]");	
		
	}
	

	public void run() {
		
		
		boolean power = true;
		
		
		while(power) {
			switch (showMenu()) {
				case "1":  {
					someLotto();
					break;
				}case "2": {
					random(conunt);
					break;
				}case "3": {
					upbateNumber();
					break;
				}case "4": {
					break;
				}case "5": {
					break;
				}case "6": {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
			
			} // switch
		}// while
	} //run
	
	
}