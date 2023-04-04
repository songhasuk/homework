
class Unit2 { 
	int hitpoint;     //기본 에너지
	final int MAX_HP; //최대 에너지
	
	Unit2(int hp){
		this.MAX_HP = hp;
	}
	
}

//인터페이스 
// ~ 할 수 있는(의미) == [수리 할수 있는]

interface Irepairable{ 
	
}
//지상유닛 

class GroundUnit extends Unit2{

	GroundUnit(int hp) {
		super(hp);
	}
	
}
//공중유닛 

class AirUint extends Unit2{

	AirUint(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}
//건물

class commandCenter  implements Irepairable {
	
}

//유닛

class Tank2 extends GroundUnit implements Irepairable{

	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "tank2";
	}
	
	
}


class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
	
	
}

//Scv 광물캐기, 수리 (탱크)
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv [구체화 ,  특수화]된 고유한 기능 구현
	//수리하다 (repair)
	//Tank2, Scv, commandCenter s
	
	//전자제품 매장  ==> 제품 1000개 ==> buy() ==> 1000개의 buy함수를 만들지 않았다(x)
	//다형성 buy(Product n) ...
	
	
	
	
	//GroundUnit 부모 (Tank2, Marine2, Scv)
	
	//void repair(Unit2 unit2) { }  //class AirUint extends Unit2(x), Marine2(x)
	//void repair(GroundUnit  gu){ } //Tank2, Marine2(x), Scv
	
	//CommandCenter repair : 서로의 공통점 (연결고리 ==> 부모가 같지 않아요)
	
	//interface Irepairble{}  (o)
	
	//class CommandCenter implements Irepairable { }
	//class Tank2 extends GroundUnit implements Irepairable{ }
	//class Scv extends GroundUnit implements Irepairable{ }
	
	//★★★★부모로써 Irepairable를 가지고 있다 ==> 서로 연관성이 없는 자원에 대해서 
	//★★★★==> 같은 부모를 제공
	
	
	
	//부모는 자식들의 참조변수를 받을 수 있다.
	void repair(Irepairable repairunit) {
		//Tank2, Scv, CommandCenter
		//수리하는 방법이 달라요
		//Tank2, Scv ==> HP필드를 가지고 올려주면 되요
		//다른 방법으로 repair
		
		// repairunit 일반 Unit2 아니냐 판단해서 적용
		if (repairunit instanceof Unit2) {
			//Tank2, Scv의 참조주소가 들어간다
			//★★((Unit2) repairunit).hitpoint;  :: 이렇게 접근하면 저장된 값을 호출 못한다.
			
			Unit2 unit2 = (Unit2) repairunit; 
			if(unit2.hitpoint != unit2.MAX_HP) { //
				unit2.hitpoint = unit2.MAX_HP;  //HP 충전
			}
			
		}else {
			System.out.println("다른 충전 방식을 통해서 repair 합니다");
		}
		
		
	}
}


public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine2 = new Marine2();
		Scv scv = new Scv();
		
		
		commandCenter center = new commandCenter();
		
		//전투 벌어짐
		
		tank.hitpoint -= 20; //공격해서 HP 낮아짐
		System.out.println("탱크 : "+ tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		
		System.out.println("탱크 수리 완료 : "+ tank.hitpoint);
		
		
		// 
		
		

	}

}
