
/*
 
 OOP 특징 : 여러개의 작은 클래스(설계도)들을 조립해서 하나의 큰 그림(제품)을 만드는 행위
 설게도 : 메인 설계도의 부분 설게도, 메인 설계도의 하위설계도, 별도 독립적인 설계도
 
 1.상속
 2.캡술화(은닉화) : private : 직접할당을 막고 간접할당(getter, setter)을 해주는 것
 3.다형성 : 상속관계에서 부모타입이 자식타입의 주소를 가질수 있다.
 
 [상속] : 특징
 1. 2개 이상의 클래스 다중 상속이 안된다(원칙적으로) ==> 하지만 [계측적 상속]은 가능하다.
 2. [계측적 상속] : 여러개의 클래스를 상속
 3. 다중 상속 지원 : interface만 가능(표준, 약속, 규칙, 규약)을 정의하고 있는 클래스
 3. public로 접근자가 지정된 인스턴스 멤버(필드, 메소드)만 자식객체가 접근이 가능하다.
 3.1 private 접근자로 선언된 멤버는 상속 불가능 :원칙적으론
 3.2 //public 메소드(생성자)를 함수해서 (간접적으로 접근이 가능하다)
 [상속] : 의미
 1. 진정한 의미 : 공통한 인스턴스 맴버의 [재사용성]을 위해 사용
 2. 단점 : [비용(초기 설계 비용)][종속성이 너무 강하다] ... 부모 자식 관계가 느슨한게 선호된다.
 3. 재사용성 ==> 설계 시간 많이 걸리지만 ==> 재사용성이 높아진다.
 
 
 JAVA : child extends Base
 C# : child : Base
 
[메모리 로드 순서]
※모든 클래스는 [메모리에 올라가야] 사용가능하다.

Object객체 ==> GrandFather ==> Father ==> Child

사용자가 만드는 모든 클래스 ==> default(명시하지 않아도) ==> Object를 상속받는다.
class Car extends Object 생략
Object ==> Root ==> 최상위 ==> 모든 클래스의 무도 ==> 조상(뿌리)
 
[생성자]
=자식 객체의 default 생성자를 객체 생성과 동시에 선언하면 
=상속받은 부모 객체의 default 생성자도 같이 호출된다. 
*/

class car{  // == class Car extends Object
	
}
 
class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000; //상속관계에서 접근 불가
								//public 메소드(생성자)를 함수해서 (간접적으로 접근이 가능하다)
	
	public GrandFather() { // 객체 생성과 동시에 호출되는 메소드(생성자)
		System.out.println("할아버지");
	}
}
class Father extends GrandFather {
	public int fmoney = 3000;
	
	public Father() {
		System.out.println("아버지");
	}
	
}
class Child extends Father {   //Child 객체가 GrandFather, Father의 인스턴스 멤버를 모두 사용가능해짐 
	public int cmoney = 100;
	
	public Child () {
		System.out.println("자식");
	}
}
public class Ex01_Inherit {

	public static void main(String[] args) {
		
		
		Child child = new Child(); 		//자식 default생성자 말고도 부모 default생성자도 호출된다.
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		//child.pmoney : 접근 불가
		
		
	}

}
