/*
  
 [인터페이스]
 1. 약속, 규칙, 규약, 표준 을 [만드는 것] 
 2. 설계 최상위 단계 ..... 
 3. 초급 개발자 : 인터페이스 사용 방법을  익히면 됨 .....
 4. ★★★ 인터페이스는 [다중 상속(구현)이 가능]하다
  ============================================================
  [추상 클래스와 인터페이스 공통점]
 5. 공통점 : 스스로 객체 생성 불가능( new 연산자 사용 불간 )
 6. 두놈의 차이점 : 추상 클래스 (완성 + 미완성), 인터페이스 (모든 것이 미완성)
 [사용법]
 추상 클래스 : extends
 인터페이스 : implements
 
  class Car extends Abclass { }
  class Car implements Ia {}
 			
  두개 다 추상자원을 가지고 있다 ==> [강제적]  구현이 목적 ( 재정의 ) 			
 
 
  [추상 클래스와 인터페이스 다른점]
  1. [ 추상클래스 : 완성부 코드를 일부분 가지고 있다 ]
  2. [ 인터페이스 : 전체가 미완성 코드 ] : (상수 + default 함수)
  3. 원칙적으로 : 클래스는 다중상속(x) ==> 계층적 상속, 포함관계를 해서 
  4. 그러나 인터페이스 [다중 구현]이 가능하다 ==> 여러개의 작은 인터페이스들을 모아서
  Ia, Ib, Ic
  
  class Test extends Object implements  Ia, Ib, Ic
  
  5. 인터페이스와 [인터페이스끼리는 서로간에 [상속]]이 가능하다.
        
  6. 인터페이스 == 상수를 제외한 나머지는 미완성 추상 함수)  >> JDK8 ( default, static)
  
  [초급 개발자 시전으로]
  1. 인터페이스를 [다형성] 입장으로 접근( 인터페이스 모든 타입 부모)
  2. 서로 연관성이 없는 클래스를 하나로 묶어주는 역활( 같은 부모를 가지게 함으로써 )
  3. JAVA API 수 많은 인터페이스를 생성해 놓았다. ==> (설계하지 않아도 사용할 수 있다.)
  4. 인터페이스 (~able) : 날수있는, 수리할 수 있는 
  5. 객체간 연결 고리 역활을 한다. (객체간 [소통]의 역활 ) == [[다형성]]
  
  
  [interface]
  1. 실제 구현부를 가지고 있지 않다 ==> 실행블록이 없다 ==> 약속
  
  interface Ia { void move(int x, int y); }  //구현(재정의) 해야되는 강제성 선언(추상 메소드)
  JAVA ==> Collection ==> 시작 인터페이스 ==> List, Set, Map
  
  
  [생성방법]
  1. [상수구현 가능]
  public static final 타입형 대문자_변수명 = 1     //컴파일러가 알아서 public static final붙여준다.
  재정의 해야되니(public) 
  2. [추상함수]
  public abstract void run();  				       // 컴파일러가 알아서 public abstract붙여준다.
  
  [종류]
  interface Aable{ } : 아무 자원도 없어요 (같은 가족으로 묶어 줄때)
  interface Aable{ int NUM = 10; } 
  interface Aable{ void run(); }
  
  
  
  
  
  
  
     
  
  
 */ 

interface Ia{
	 int AGE=100;
	 String GENDER="남";  //인터페이스에서의 [필드]는 [public static final]를 디폴트로 가지고 있다.
	
	String print();
	void messge (String str); //인터페이스에서의 [메소드]는 [public abstract] 를 디폴트로 가지고 있다.
	
}

interface Ib { 
	int AGE = 10;
	void info();
	String val(String s);
}

class Test2 extends Object implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messge(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
class Test3 extends Object implements Ia, Ib{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messge(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
			
		Ia ia = t2;
		ia.messge("재정의"); //★ 인터페이스가 자식 객체에서 ==> 재정의된 추상메소드를 호출한다. 
		//부모는 자식객체의 주소를 가질 수 있다.
		//자식 클래스에서 재정의해서 기능 구현된 ==> 인터페이스의 추상 메소드를 호출 할수 있다.
		
		System.out.println(ia.GENDER);
		
		
		// ===================================================
		
		Test3  t3 = new Test3();
		
		Ia ia2 = t3; 
		
		Ib ib2 = t3;
		
		System.out.println(ia2.GENDER);
		System.out.println(ia2.AGE);
		
		
		
	}

}
