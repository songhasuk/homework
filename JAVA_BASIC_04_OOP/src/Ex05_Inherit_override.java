import ko.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2{
	int x = 300;
		
	//재정의 
	@Override
	void print() { //오버라이딩
		System.out.println("자식이 부모의 함수를 재정의");
	}
	
	void print(String str) { //오버로딩  : 매개변수 받아서
		System.out.println("자식이 부모의 함수를 재정의"+str);
	}
}

public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println(test3.x);
		test3.print();
		test3.print("오버로딩");
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp); //.toString()이 생략
		//ko.or.kosa.Emp@1c4af82c
		//java파일이 있는 패키지명 + @ + 참조주소값  : 조합된 값
		System.out.println(emp.toString());
		
		/*
		  class Object{
		  	public String toString(){
		  		return java파일이 있는 패키지명 + "@" + 참조주소값;
		  	}
		  
		  }
		  
		  class EmP extend Object{
		  
		 }
		 */
		
		
	}

}
