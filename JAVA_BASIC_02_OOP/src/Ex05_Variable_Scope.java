import kr.or.kosa.Airplane;

/*
1.[인스턴스 변수] : class Car { private Strimg color;}
=생성되는 객체마다 다른 값을 가질수 있다.  
=만약 초기값을 설정한다면 어떤 의미? : 기본적으로 어떤 값을 초기화하겠다.
=private String color="black";

2.[지역 변수] class Car { public void move() { int speed=1;}
= 사용이 끝나면 메모리 상에서 사라지는 변수 
= 그래서 꼭 초기화를 해줘야된다. 
= public static void main(String[] args) { 선언된 변수 지역변수 초기화}

3.[블록 변수] : class Car {public void move(){ for(int i=0...} }
= 메소드나 제어문(if, for, while 등) 안에서 선언되는 변수를 말합니다.
= 선언된 블록 안에서만 사용 가능하며, 블록을 벗어나면 해당 변수는 소멸합니다.

4.[공용(static) 변수] : 
= 공유자원 (heap에 생성된 객체간 공유자원)
= 클래스 변수는 [객체(인스턴스)가 생성되지 않아도] 사용할 수 있습니다.
= 객체 생성 이전에 메모리에 올라가는 자원 (클래스==메소드 영역 메모리)
= new 연산자로 객체 생성해해도 [클래스 메모리]에 올라간다.
= 클래스 변수는 모든 객체가 공유하는 변수입니다.
= 클래스 변수는 한 번만 초기화됩니다.
= ★클래스.멤버명, 참조변수면.멤버명(객체선언)으로 호출하는 방식 상관없이 값이 공유된다.

= 설계도를 가지고 구체화(메모리) 올리는 방법 유일 : new
= 자바 메모리 : stact, heap, 클래스 메모리

[javac 컴파일]
java Ex05_Variable_Scope 엔터
1.Ex05_Variable_Scope 분석 (누가, 어떤 자원, 언제...) 정보 메모리 올려요 →
2.안에 static 이런 것이 붙어 있는 필드, 메소드 보이면 → 클래스 메모리에 올린다.
3.그런데 static 함수 중에서 이름이 main이면 약속... 실행하겠다고(진입점, 실행점)

*/


class VariableClass{
	int iv; // iv == 인스턴스 변수
	
	/*
  	1. member field , instance variable
  	2. iv 언제 사용가능 할까요 (메모리에 언제 올라 갈까요) 
  	2.1 VariableClass v = new VariableClass(); >> heap 객체 생성 >> 객체 안에 iv 생성
        VariableClass v2 = new VariableClass();>> heap 객체 생성 >> 객체 안에 iv 생성
    3. 목적 : 데이터 (정보) ,자료 를 담을 목적
    3.1 정보 : 고유 , 상태 , 부품(class)
    -생성되는 객체마다 다른 값을 가질 수 있다
    -그래서 초기화를 해서 값을 강제하지 않는다 
    -default 값을 가지고 있다 (int > 0 , double > 0.0 , char > 빈문자'\u0000' , 
                         boolean >false , String > null, Car > null)
    -iv 변수의 생성 시점 : new 라는 연산자를 통해서 heap  Variable 이름의 객체가 만들어지고 나서 바로생성(그 안에)
   */
	
	
	static int cv; // cv == 공용 변수
	
	/*
	   1. class variable (클래스 변수) , 일반적으로는 static variable (객체간 공유자원)
	   2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
	      >> 생성되는 모든 객체 (heap영역에 생성된 객체들이 공유하는 자원)
	   3. 접근방법 
	      1. class 이름.static변수명 >> VariableClass.cv >> why(객체가 생성되기 전에 ...접근)
	      2. VariableClass v = new VariableClass(); >> v.cv  
	         VariableClass v2 = new VariableClass(); >> v2.cv
	         >> v.cv == v2.cv (같은 주소를 바라본다 : static 변수 주소)
	   4. 생성시점
	      Hello.java > javac Hello.java > Hello.class
	      >java.exe Hello 엔터 실행
	      >JVM > OS > Memory 빌려 > 정리(영역을 나누어요) > class Loader System 분석
	      >클래스 정보(metadata:설명) >> class area(method area) 메모리에 올려요 (
	                                                        언제 ,어떤 자원, 버전..)
	      >그 클래스안에 static variable 또는 static method 있다면 
	      >두 녀석을 class area(method area) 영역에 할당합니다 
	      >그런데 함수의 이름 만약에 main() 이라면 정해진 규칙에 따라서 실행합니다 (Stack 영역) 자원 할당 ..
	            
	   
	  */
	
	void method() {
		int lv = 0; // lv == 지역변수
		
		for(int i = 0 ; i <=100 ; i++) { // i == 블록 변수
			
		}
	}
	
	
}


public class Ex05_Variable_Scope {

	public static void main(String[] args) {

		
		VariableClass.cv = 100; 
		// [호출 방법] : 클래스명.인스턴스맴버명(필드, 메소드)
		
		VariableClass vc = new VariableClass();
		vc.iv = 100;
		vc.method();
		vc.cv = 200; //
		
		VariableClass vc2 = new VariableClass();
		System.out.println(vc2.cv); // 200
		vc2.cv = 400;
		
		//========================================
		
//		Airplane airplane = new Airplane();
//		airplane.setName("순향");
//		airplane.setMember(123);
//		airplane.print();
//		
//		Airplane airplane2 = new Airplane();
//		airplane2.setName("진향");
//		airplane2.setMember(456);
//		airplane2.print();
//		
//		airplane2.totalPrint();
		
		Airplane air1 = new Airplane("순향", 200);
		air1.print();
		air1.totalPrint();
		
		Airplane air2 = new Airplane("진향", 300);
		air2.print();
		air2.totalPrint();
		
		
	}

}
