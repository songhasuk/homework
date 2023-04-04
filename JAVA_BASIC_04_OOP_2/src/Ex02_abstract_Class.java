/*
 
 게임 : 유닛(unit)
 
 unit : 공통기능 (이동좌표, 이동, 멈춘다) : 추상화, 일반화
 unit : 이동방법은 다르다 (이동방법은 unit마다 별도의 구현[재정의] 필요(반드시))
  
 class Unit { void move(){}; } ==> move()는 강제성이 없다
 
 ==========================================================
 [객체 타입 비교 연산자]
 instanceof (객체의 타입 비교하는 연산자  true. false)
 if(참조주소명 instanceof 클래스명)
 
 1.★ ~~객체의 주소가 부모를 상속 받은 상태인지 확인하는것
 		if(tank instanceof Unit) {
 2.★ ~~객체1의 주소가 지정한 객체를 가르키는 주소인가 확인 
 		if(tank instanceof Tank) {
 
 
  
 */


abstract class Unit {
	
	int x, y; 
	void stop() {
		System.out.println("unit stop");
	}
	abstract void move(int x, int y) ; // 추상 메소든

}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크 소리내며 이동"+this.x+","+this.y);
		
	}
	//필요에 따라서 구체화, 특수화 구현 (고유 기능)
	void changeMode() {
		System.out.println("탱크모드 변환");
	}
		
}
class Marine extends Unit{

	@Override
	void move(int x, int y) {
				
		this.x = x;
		this.y = y;
		System.out.println("마린 이동 :"+ this.x + ","+ this.y);
	}
		void stimpack() {
			System.out.println("스팀팩기능");
		}
	}
	
	
class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("드랍쉽 하늘로 이동 :"+ this.x + ","+ this.y);
	}
	
	//특수화, 구체화
	void load() {
		System.out.println("Unit load");
	
	}
	void unload() {
		System.out.println("Unit Unload");
	}
}

class Move{
	
	Unit[] u ;
	int index;
	
//	Move(){
//		this(0);
//	}
	
	Move(int index){
		u = new Unit[3];
		this.index = index;
	}
	
	void move(Unit n) {
		u[index++] = n;  
	}
	void totelMoveTank(Unit n) {
		for(int i =0 ; i < index ; i++) {
		u[i] = n;
		u[i].move(600, 800);
		}
	}
	void totelMoveAll(Unit n, Unit n2, Unit n3) {
		for(int i =0 ; i < index ; i++) {
			u[i] = n;
			u[i].move(600, 800);
			}
	}
	
}



public class Ex02_abstract_Class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500, 500);
		tank.stop();
		tank.changeMode();
		
		Marine marine = new Marine();
		marine.move(200, 300);
		marine.stop();
		marine.stimpack();
		
		
	 Move move = new Move(0);
	 
	 move.totelMoveTank(new Tank());
	 System.out.println("dddd");	
			
	 
	 	//1. 탱크 3대를 만들고 같은 좌표로 이동(600, 800)로 이동시키세요
		Tank[] tanklist = { new Tank(), new Tank(), new Tank()};
		
		for(Tank t : tanklist) {
			t.move(600, 800);
		}
		
		//2. 여러개의 Tank 1대, Marine  1사람, Dropship 1대) 생성하고 같은 좌표로 이동
		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
		
		for(Unit u : unitlist) {
			u.move(666, 888);
		}
		
		if(tank instanceof Unit) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		Unit[] unit = new Unit[3]; // 물어보기
		unit[0] = new Unit() {
			
			@Override
			void move(int x, int y) {
				// TODO Auto-generated method stub
				
			}
		};
		
		Unit unit2 = new Unit() {
			
			@Override
			void move(int x, int y) {
				// TODO Auto-generated method stub
				
			}
		};
		
		//왜 추상 클래스는 단일 객체를 생성은 불가능한데
		//왜 객체타입 배열로 하면 가능하나?
		//객체 배열만 선언한거여서
		
		
		
	 	
		
	}		//666, 888
}

