/*
 
 [객체 한개만 가지고 있을땐]
 this : 객체 자신을 가리키는 this (this.emno , this.ename)
 this : 생성자(명시적)를 호출하는 this ( this(100, "red") )

 [상속관게: 부모 ,자식]
 
 super : 상속관계에서 자식이 부모의 자원을 접근 하는 [주소 제공] ==> 상속관계에서 부모에 접근
 
 1. super : 상속관계에서 부모의 [자원에 접근]
 2. super : 상속관계에서 부모의 [생성자를 호출]
 
 
 */

class Base{ 
	String baesname;
	
	 Base() {
		System.out.println("부모 클래스 : 디폴트 생성자");
	}
	 Base(String basename) {
		this.baesname = basename; 
		System.out.println("basename : "+ this.baesname);
		}
	 
	 void method() {
		 System.out.println("부모함수");
	 }


	 
}

class Derived extends Base {
	String dname;
	
	Derived(){ // default 생성자
		System.out.println("자식 클래스 : 디폴트 생성자");
	}
	Derived(String dname){
		super(dname);
		this.dname = dname;
		System.out.println("dname : "+this.dname);
	}
	//부모의 생성자(명시적) 호출 : super();
	
	
	@Override
	void method() {
		
		//super.method();
		System.out.println("부모함수 재정의");
	}
	
	void pMethod() {
		super.method(); 
		
		//부모 자원[필드,메소드] 사용하고 싶으면
		//자식객체의 함수 안에서 ==> super. 사용
		
	}
	
}


public class Ex06_Inherit_Suber {

	public static void main(String[] args) {
		//Derived derived = new Derived();
		
		Derived derived = new Derived("홍길동");
		
		//상속을 받은 자식 클래스의 생성자를 호출하면 
		//기본적으로는 [부모 클래스 ==> 디폴트 생성자]도 같이 호출된다
		//그런데 super()로 [부모 클래스 -==> 명시적 생성자]를 호출해준다.
		
		
		derived.method();
		derived.pMethod();
	}

}
