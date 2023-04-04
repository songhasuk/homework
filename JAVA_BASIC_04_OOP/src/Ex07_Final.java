/*
 
  [상수]
  상수 : 한번 값이 [초기화] 되면 변경 불과
  상주자원 : 고유값 : 주민번호, 원주, 시스템번호(버전번호)
  
  [문법]
  상수명 : 대문자
  
  [키워드(사용되는)]
  
  1. Final class Car {] ==> 상속금지
  	(public final class Math extends Object)
  2. public final void print(){} ==> 상속관계에서 재정의 금지
  3. member field(상수)

  [선언과 동시에 초기화 안해도 되는 방법]
  
  1.★명시적 생성자를 만들어 거기서 초기화하는 조작을 하면된다
  2.(이유) = 명시적 생성자를 만들면서 생기는 ==> [강제성]에 의한 초기값 지정 상황을 만들면된다
 	
  [설계자 입장에서]
  53장의 카드 생성 시 ==> 카드마다 다른 상수값을 가지게 하고 싶다
  
 
  
  
  JAVA : final int NUM = 10;
  C# : const integer NUM=10;
  
  
  
 */

class Vcard{

	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		//JAVA API
		System.out.println(Math.PI); //원주율
	}
	
}

class Vcard2 {
	final String KIND;
	final int NUM;
	
	//Vcard2(){}
	
	Vcard2 (String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
	
	@Override
	public String toString() {
		return "Vcard [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}


public class Ex07_Final {
	
	public static void main(String[] args) {
		 Vcard vcard = new Vcard();
		 // vcard.KIND = "AAA"  :변경불과
//		 System.out.println(vcard.KIND);
//		 System.out.println(vcard.NUM);
//		 vcard.method();
		 
		 Vcard2 v1 = new  Vcard2("spade", 1);
		 System.out.println(v1.toString());

		 Vcard2 v2 = new  Vcard2("spade", 2);
		 System.out.println(v2.toString());


		 Vcard2 v3 = new  Vcard2("heart", 3);
		 System.out.println(v3.toString());

		 
		 
	}

}
