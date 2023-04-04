/*
 OOP 객체 지향 프로그래밍 (여러개의 작은 조각[작은 설계도]만들어서 조합하는[큰설계도]로 만드는 행위)
 (이렇게 만드는 이유) == 재사용성을 높이기 위해서
 
 
 [객체지향의 특징]
 1. 상속 : (재사용성) : 코드의 간결화로 가독성을 높인다. 
 2. 캡술화 : private(get, set) : (정보은닉) : 직접 할당을 막고 → 간접 할당을 통해 데이터 보호
 3. 다형성 : 하나의 타입[객체]으로 여러개 객체의 주소를 가질 수 있는 것
  
  
  [메소드 → 오버로딩]
  = 하나의 이름으로 여러가지 기능을 하는 함수
  = 초기값을 지정하는 생성자를 여러개 만들어 [매개변수 : 수량, 타입]에 따라 다르게 만들어주는것
  = [사용 이유] : 성능에 직접적인 영향을 주진 않는다 → 단순히 개발자가 편히 사용하기 위해 씀
  
  (규칙) 
  1. 메소드명을 class명이랑 같게 정의한다. 매개변수의 개수와 타입을 다르게한다.
  1.1 메소드 이름 일동
  1.2 매개변수 개수, 타입 다르게
  1.3 반환값(return) 타입은 오버로딩의 판단 기준이 아니다. : [메소드의 반환형 선언부]
  (ex: void add(), int add(), String add()) ← [실행 오류]
  1.4 ★☆매개변수의 [선언 순서의 다르게] 하는것도 인정(yes)
  1.5 ★☆★☆매개변수로 [참조변수]가 들어가도 다르다는걸 인정해준다.
  
  
 */

class Human{
	String name;
	int age;
}

class OverT {
	
	int add(int i) {
		return 100+i;
	}
	
//	void add(int i) { //충돌 문제 생김 : 클래스명이 같은 함수[생성자]가  
//					  //같은 함수명을 중복 선언하는건 : 오버로딩이라 인식해 오류생김	
//	}				  //☆★ 메소드의 반환형 선언부을 다르게 해줘도 영향을 주지못한다.
	
	int add(int i, int j) {  //수량 다름
		return i+j;
	}
	String add(String str) { //타입다름
		return str;
	}
	
	String add(String s, int i) { 
		return "hello" + s;
	}
	String add(int i, String s) {
		return "hello" + s;
	}
	
	void add(Human human) {
		human.age=100;
		human.name="송하석";
		
	}
	

}

public class Ex11_Method_Overloading {
	
	
	public static void main(String[] args) {
		OverT overT = new OverT();
		
		overT.add(10, 10);
		overT.add("a");
		
		Human human = new Human(); // 1 : 다른 객체로 참조할 수 있다 
		overT.add(human);
		
		overT.add(new Human());// 2 : Human객체만 이용가능하다.
		
		// 1, 2번의 차이는 참조주소에 들어갈 객체를 다르게 넣을 수 있냐 없냐로 따질 수 있다.
		// 2번은 특정 하나의 객체만을 이용하겠다는 거다.
		
		
		
	}

}
