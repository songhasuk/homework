package machine;

import java.util.Scanner;

import recipe.Americano;
import recipe.CafeLatte;
import recipe.CafeMocha;

public class VendingMachine {
	boolean power = true; // 전원
	

	private String serialNumber;
	private String modelName;
	private String music;
	private String menu;
	
	private int water = 1000;
	private int milk = 1000;
	private int sugar = 1000;
	private int bean= 1000;
	private int cup = 1000;
	private int ice = 1000;
	private int inputMoney;
	private int totalMoney = 10000;
	
	private boolean hotOrIce;
	
	
	private Americano americano = new Americano();
	private CafeLatte cafeLatte = new CafeLatte();
	private CafeMocha cafeMocha = new CafeMocha();
	
	Scanner sc = new Scanner(System.in);



	public boolean isHotOrIce() {
		return hotOrIce;
	}

	public void setHotOrIce(boolean hotOrIce) {
		this.hotOrIce = hotOrIce;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}



	
	// 메뉴 출력 기능
	public void printMenu() {
		System.out.println("********************************************");
		System.out.println("Team3 coffe 입니다.");
		System.out.println("메뉴를 골라주세요. ^^ \n");
		System.out.println("1. 아메리카노 " + americano.getPrice() + "원");
		System.out.println("2. 카페라떼 " + cafeLatte.getPrice() + "원");
		System.out.println("3. 카페모카 " + cafeMocha.getPrice() + "원");
		System.out.println("4. 관리자 메뉴");
		System.out.println("********************************************");
	}
	
	// 동전 입력 받는 기능
	public void inputCoin(int price) {
		
		// 받을 수 있는 동전의 종류 100 / 500
		while(true) {
			try {
				System.out.println(price + " 원을 넣어주세요");
				inputMoney = Integer.parseInt(sc.nextLine());
				// 금액 100원 미만 / 금액 500원 초과  
				if(inputMoney < 100 || inputMoney > 500) {
					System.out.println("100원 및 500원 동전만 투입 가능합니다.");
				}
				//500원 이하 100원 이상 인데 100단위로 나눠지지 않을경우  (투입금액 나누기 100이 나머지가 0보다 크면) 
				else if(inputMoney>=100 && inputMoney <=500 && inputMoney%100>0) {
					System.out.println("100원 및 500원 동전만 투입 가능합니다.");
					inputMoney = 0;
					
				}else {
					System.out.println(inputMoney + " 원 을 넣으셨습니다.");
					totalMoney = totalMoney + inputMoney;
					break;
				}
				
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요 ^^");
			}

		}
		
		// int inputMoney;
		//System.out.println(inputMoney + "원 을 넣었습니다.");
		
		
	}
	
	// 잔돈반환해야하는지 검사 + 정산 기능
	public void changeMoney(int inputMoeny,int meunPrice) {
		
		// 넣은 금액과 메뉴의 금액이 일치할 경우
		if(inputMoeny == meunPrice) {
			System.out.println("반환해야 할 돈 : 0원");
		}
		// 넣은 금액이 메뉴의 금액보다 클경우
		if(inputMoeny > meunPrice) {
			System.out.println("====================================================");
			System.out.println("반환 해야할 돈 : " + (inputMoeny -meunPrice) + "원");
			// 잔돈반환 후 totalMoney에서 뺀다 
			totalMoney -= (inputMoeny -meunPrice);
			System.out.println("잔돈반환 완료! 투입구에서 꼭 챙겨가세요 ^^");
			System.out.println("====================================================");
		}
	}
	
	// 재료 체크 
	public void elementChk() {
//		water
//		milk = 1000;
//		sugar = 1000;
//		bean = 1000;
//		cup = 1000;
//		ice = 1000;
		
		
	}
	
	
	// 핫 아이스 선택 기능
	public void hotOrIceChk() {
		System.out.println("1.hot 2.ice");
		int num = 0;
		while(true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				if(num == 1) {
					System.out.println("hot 선택 하셨습니다.");
					hotOrIce = true;
					break;
				}else if (num == 2) {
					System.out.println("ice 선택 하셨습니다.");
					hotOrIce = false;
					break;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 ^^");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 ^^");
			}
			
		}
		
	}
	
	
	public void playMusic(){
		System.out.println("BGM : ~~~~~~~~~~~~~~~~~~~");
		System.out.println("메뉴가 나왔습니다.");
	}
	
	// public void addIce() {}
	
	//		*****
	
	// 관리자 재료 채우기 메뉴
	public void refill() {
		this.water = 1000;
		this.milk = 1000;
		this.sugar = 1000;
		this.bean = 1000;
		this.cup = 1000;
		this.ice = 1000;
		System.out.println("==========================================");
		System.out.println("모든 재료를 1000 만큼 채웠습니다.");
		System.out.println("==========================================");
		
	}
	
	// 관리자 totalMoeny 변경 메뉴
	public void moneySet() {
		while(true) {
			System.out.println("현재 포스기 잔액 입력 10000원 이하일시 오픈 불가");
			int money = 0;
			try {
				money = Integer.parseInt(sc.nextLine());
				totalMoney = money;
				if(totalMoney  < 10000) { // 돈통 금액이 만원보다 적을 경우
					System.out.println("금액이 적습니다. 오픈 할 수 없습니다.");
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		
	}
	
	/* 재료 채우기
	public void fillBean(int bean) {}
	
	public void fillWater(int water) {}
	
	public void fillCup(int cup) {}
	
	public void fillMlik(int mlik) {}
	
	public void fillIce(int ice) {}
	
	public void fillChange(int change) {}
	
	public void fillSugar(int suger) {}
	*/
	
	// 관리자 메뉴 기능
	public void managerMenu() {
		boolean managerPower = true;
		while(managerPower) {
			
			System.out.println("**********************************************");
			System.out.println("관리자 메뉴 입니다.");
			System.out.println("1. 재료 채우기 \n2. 총액 관리 \n3. 자판기 정보 \n4. 이전으로 돌아가기 \n5. 프로그램 종료");
			System.out.println("**********************************************");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
				case 1: {
					// 재료리필
					refill();
					break;
				}
				case 2: {
					// 돈관리
					moneySet();
					break;
				}
				case 3: {

					System.out.println("====================================================================================================");
					System.out.println("보유 금액 : " + totalMoney + "원 \n" + " 물 : " + water +"ml" + "\n 우유 : " + milk + "ml");
					System.out.println(" 설탕 : " + sugar + "g" + "\n 커피콩 : "+bean +"g" + "\n cup : " + cup + "개" + "\n ice : " + ice + "g");
					System.out.println("====================================================================================================");
					break;
				}
				case 4: {
					System.out.println("이전으로 돌아가기");
					managerPower = false;
					break;
				}case 5: {
					System.out.println("프로그램 종료");
					System.exit(10); //
				}
					
			}// switch
		}// while
	} // managerMenu()
	
	
	public void run() {
		boolean power = true; // 전원
		

		while(power) {
			// 메뉴 보여주기
			printMenu();
			int selectNum = 0;
			try {
				selectNum = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
			
			switch (selectNum) {
				case 1:
					// 아메리카노
					System.out.println("====================================================================");
					System.out.println("아메리카노를 선택하셨습니다. ");
					// 핫 아이스 선택 기능
					hotOrIceChk();
					// 동전 입력받기
					inputCoin(americano.getPrice()); 
					System.out.println("현재 투입금액 : " + this.inputMoney + "원 " + "제조 후 반환해야할 금액 : " + (this.inputMoney - americano.getPrice()) + "원");
					//메뉴 만드는 기능
					americano.makeAmericano(this);
					//잔돈 반환 및 정산 기능
					changeMoney(inputMoney, americano.getPrice());
					// 노래 기능 
					playMusic();
					break;
				case 2:
					System.out.println("====================================================================");
					System.out.println("카페라떼를 선택하셨습니다. ");
					hotOrIceChk();
					inputCoin(cafeLatte.getPrice());
					System.out.println("현재 투입금액 : " + this.inputMoney + "원 " + "제조 후 반환해야할 금액 : " + (this.inputMoney - cafeLatte.getPrice()) + "원");
					cafeLatte.makeCafeLatte(this);
					changeMoney(inputMoney, cafeLatte.getPrice());
					playMusic();
					
					break;
				case 3:
					System.out.println("====================================================================");
					System.out.println("카페모카를 선택하셨습니다. ");
					hotOrIceChk();
					inputCoin(cafeMocha.getPrice());
					System.out.println("현재 투입금액 : " + this.inputMoney + "원 " + "제조 후 반환해야할 금액 : " + (this.inputMoney - cafeMocha.getPrice()) + "원");
					cafeMocha.makeCafeMocha(this);
					changeMoney(inputMoney, cafeMocha.getPrice());
					playMusic();
					
					break;
				case 4:
					// 관리자 메뉴 실행
					managerMenu();
					//power = false;
					break;
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
}
