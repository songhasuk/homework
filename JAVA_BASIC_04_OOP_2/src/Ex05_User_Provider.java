/*
 
  user : 사용자 <> provider : 제공자
  
  class A{}
  class B{}
  
  관계 : A는 B를 사용합니다.
  
  1. 상속 : A extends B
  2. 포함 : A라는 클래스가 member field  B를 사용 : class A { B b = new B;}
 
  
  ================================================================
  [2.1 전체 포함(집합)]
  class B{}
  class A{
  	int i;
  	B b;   //★★★A는 B를 사용합니다[포함]
  	
  	A(){
  	 	b = new B();
  	}
  	
   }
   
   main(){
   	A a = new A ();
   	a=null;   			// 
   	a.b.멤버명			//  
   }
   
   // A와 B는 같은 라이프 사이클을 가졌다. : 같은 시점에 객체 생성되었다.
   // ★★B는 A에 종속되어서 ==> 독자적인 객체 생성이 불가능하다 == 
   // 공통운명체 (전체집합)
   // 자동차 엔진, 노트북과 CPU
   
   ================================================================
   [2.1 부분 포함(집합)]
   
  class B{}
  class A{
  	int i;
  	B b; 	//A는 B를 사용합니다(포함)
  	
  	A(){	//생성자
  		
  	}
  	
  	void m (B b){  //메소드(객체타입을 매개변수로 받는)
  		this.b = b;
  }
  
  main(){
   	A a = new A ();
   	B b = new B ();
   	
   	a.m(b);
   }
   
   //필요에 따라서 , 운명공동체가 아니다(x) 
   //노트북과 마우스, 학교와 학생
  
  ================================================================
  
  A는 B를 사용합니다(참조)  ==> 포함 ==> A가 B를 member field ==> 생성(같이) , 따로
 
 */

interface Icall {
	void m(); 	//public abstract 생략
	
}

class D implements Icall{ //[구현 클래스]

	@Override
	public void m() {
		System.out.println("D ... Icall 인터페이스의 m() 재정의 ... 함");		
	}
	
	
}

class F implements Icall{  //[구현 클래스]
	@Override
	public void m() {
		System.out.println("F ... Icall 인터페이스의 m() 재정의 ... 함");		
	}
}

//현대적인 프로그래밍 방식은 (interface가 대세) ==> [유연성]을 선호함 ==> 느슨하게 만듬
//↑다형성 : 유연하게 : 느슨하게  ==> 대표적인 것 ==> 인터페이스(interface)




class C {
	
	void method(Icall ic) { 
		//★★★★★함수의 parameter에는 Icall을 구현하고 있는 (부모)로 두고 있는 모든 객체의 주소는 올 수 있다.
		//★★★★★인터페이스를 받는(부모로: implements로 받는) 구현 클래스(자식클래스)의 참조주소가 모두 올수 있다. 
		//★★★★★[구현 클래스] = 인터페이스에 추상메소드를 오버라이드(재정의)한 클래스
	}
}



public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();

		c.method(f);
		
		
	}

}
