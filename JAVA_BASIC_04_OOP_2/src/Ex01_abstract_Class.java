import javax.crypto.Cipher;

/*
 [추상 클래스] 
 : 미완성 클래스 (설계도)
 
 1. 완성된 코드 + 미완성 코드
 2. [미완성 코드] : 미완성 메소드 ==> 실행블록이 없는 함수  public void run();  (x){}
 3. 미완성된 클래스 ==> (스스로 객체 생성이 불가능하다)
 
 
 [설계도를 만드는 입장에서]
 1. 미완성 설계도 제작(미완성 메소드) ==> 의도 ==> 믿지못하니까 ==> [강제성]을 부여해 구현하길 목적으로 함ㄴ
  
 [문법]
 1. 클래스와 추상 메소드에 abstract 키워드 작성
 2. 추상 클래스를 상속해 ==> 추상 메소드를 재정의
 3.
  
 */

class Car{
	void run() {} 
	// { 블록만 있으면 객체 생성하고 사용하는데 문네없다 }
	// 재정의에 대한 [강제성은 없다] 
	// 그래서 재정의에 대한 보장이 없는 상황이다.
}

class Hcar extends Car{
	@Override
	void run() {
		System.out.println("재정의 했어요");
	}
}


abstract class Abclass {
	//[abstract class] : 클래스 안에는 최소 1개 이상의 추상함수를 가지고 있겠다.
	int pos;
	void run() {
		pos++;
	}
	
	abstract void stop();
	//[abstract 메소드] : 실행블록이 없어요 {} : 반드시 상속 통해서 구현 ==> 추상 메소드 재정의
}
class Child extends Abclass{

	@Override
	void stop() {
		//구현하는 사람 마음대로 재정의...
		
		this.pos = 0;
		System.out.println("stop :"+this.pos);
		
	}

}
class Child2 extends Abclass{

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop :"+this.pos);
		
	}
	
}

public class Ex01_abstract_Class {

	public static void main(String[] args) {
		Hcar he = new Hcar();
		he.run();
		
		
		//Abclass ab = new Abclass() {
			

		Child child = new Child();
		child.run();
		child.run();
		child.stop();
		
		Child2 child2 = new Child2();
		child2.run();
		child2.stop();
		
		Abclass ab = child;
		//★★★상속관계에서 부모타입의 참조변수가 자식타입객체'들'의 주소를 가질 수 있다.
		//★★★단 ... 부모는 자식의 인스턴스 멤버는 사용할 수 없다.
		//★★★단 ... 자식이 재정의한 메소드는 사용가능하다
		
		ab.run();
		ab.stop(); // 재정의된 자식 함수를 호출
	}

}
