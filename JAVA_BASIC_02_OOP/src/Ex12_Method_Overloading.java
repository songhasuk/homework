class Human2{
	String name;
	int age;
	
}
class Book{
	int num;
	int page;
}

class Test3{
	int aaa;
	
	
	Human2 add(Human2 h) { //HUman2객체의 참조주소를 받아서 필드값 호출해 정의해주는 메소드
		//return h;(x)
		
		h.name = "아무개";
		h.age = 100;
		return h; 
		
		//
		//★★★★★반환형이 객체니까 [return 참조변수명] == 참조변수에 Human2객체를 연결해서 반환해준다(new Human())  
	
		//★return null; :주소를 가지고 있지 않아 : 리턴값이 NULL이여도 된다.
	}
	
	Human2 add(Human2 h, Human2 h2) {
		//return null;
		h2.name = h.name;
		h2.age = h.age;
		return h2;
	}
	Book bAdd(Book b) {
		b.num =10;
		b.page=20;
		return b;
	}
	Test3 add (Test3 t) {
		return t;
	}
}
public class Ex12_Method_Overloading {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		
		
		Human2 man = new Human2();
		System.out.println(man.age);
		Human2 man2 = t3.add(man);
		

		System.out.println(man == man2); //주소번지값이 같다.
		Human2 man4 = new Human2();
		Human2 man3 = t3.add(man, man4); //★
		System.out.println(man3.age);
		System.out.println(man.age=200);
		System.out.println(man2.age);
		System.out.println(man3.age);
		System.out.println(man.hashCode());
		System.out.println(man2.hashCode());
		System.out.println(man3.hashCode());
		System.out.println(man4.hashCode());
		
		
		
		Book b = new Book();
		b.page=10;
		Book b2 = new Book();
		t3.bAdd(b);
		System.out.println(b2.page);
		b2.page=20;
		System.out.println(b.page);
		System.out.println(b2==b);
		//[Q] : 
	}

}
