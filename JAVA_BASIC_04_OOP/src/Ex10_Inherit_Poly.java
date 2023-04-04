/*
 
  다형성(상속관계에서 존재}
  
  1. [다형성] : 여러가지 성질(상태)를 가질 수 있는 능력
  2. 현실 ==> 부모는 자식에게 모든 것을 준다...
  2. 프로그램 ==> 자식이 [부모에게] 조건 없이 드린다... 
  
  
  JAVA : [상속관계] 에서 [하나의 참조변수]가 [[여러개의 타입]]을 가질수 있는것
  1. [하나의 참조변수] = "부모타입" 참조변수
  2. [[여러개의 타입]] = "부모를 상속받은" 자식타입의 참조주소를 가질수 있다.
  
 
  
 */

class Tv2 {
	boolean power;
	int ch;


	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}	

class CapTv extends Tv2{
	
	String text;
	String captionText() {
		return this.text = "현재 자막서비스 처리중";
	}
}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		System.out.println(ct.captionText());
		
		////////////////////////////////////
		
		Tv2 tv2 = ct;
		//상속관계에서 부모타입의 참조변수는 [자식타입의 참조주소]를 가질 수 있다.
		//단 부모는 [자신(부모)의 자원만 접근] 가능 : 자식 인스턴스멤버 접근 불가능
		//단 자식 클래스에서 재정의한 메소드만 제외하곤

		
		System.out.println(tv2.toString()); //CapTv@515f550a //자신이 가지는 타입정보(부모 인스턴스 멤버) 
		System.out.println(ct.toString())   //CapTv@515f550a
		
		;
	}

}
