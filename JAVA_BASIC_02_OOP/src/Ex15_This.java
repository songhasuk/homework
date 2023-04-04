/*
  
 [this (이것)]
 1. 객체 자기자신을 가르키는 this : (앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
 == 인스턴스(객체) 자신을 가리키는 참조변수, 인스턴스(객체)의 주소가 저장되어있다.
 2.	★this 객체 자신(주소) : 생성자 호출 (원칙적으로 생성자는 객체 생성시 한개만 호출 가능)
 == ★그런데 this를 활용하면 예외적으로 this를 통해서 여러개의 생성자를 호출 할수 있다.
 == (사용 이유) : 코드의 중복을 줄여준다.
  
 */

class Test5{
	int i;
	int j;
	
	public Test5() { // 디폴트 생성자
	
	}
	
	//1.객체 자기자신을 가르키는 this
	public Test5(int i, int j) { // 생성자 오버로딩
		this.i = i;
		this.j = j;
	}
	
}

class Book2{
	String bookName;
	
	public Book2(String name) {
		this.bookName =  name;
	}
}

//2, 생성자를 호출하는 this(중복 감소)

class Socar{
	String color;
	String gearType;
	int door;
	
	public Socar(){ //디폴트 생성자
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	}
	
	public Socar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void socarPrint() {
		System.out.println(this.color+" , "+ this.gearType+ " , "+this.door);
	}
	
	
	
}
public class Ex15_This {

	public static void main(String[] args) {
		
		Test5 test5 = new Test5(10, 20);
		
		Socar socar = new Socar();
		socar.socarPrint();
		
		Socar socar2 = new Socar("gold", "auto", 6);
		socar2.socarPrint();
	}

}
