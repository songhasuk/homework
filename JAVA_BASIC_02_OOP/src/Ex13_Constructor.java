
/*
 [생성자 함수(constructor)]
 
 1.(목적) = 인스턴스 멤버의 필드값을 초기화 해주는것 (ex) static{}
 2.(실제사레적 목적) = 고객이 옵션을 선택할 수 있게 하는 프로그램을 만들때 (ex: 배민 추가옵션)
 
 
 [일반 메소든와 다른점]
 1. 함수명이 클래스명과 같아야된다. (함수이름 == 클래스이름)
 2. 반환형(retrun) 메소드 선언부에 반환타입을 쓸필요가 없다 (무조건 void로 작성)
 3. 실행시점 ==> new연산자로 객체 생성 ==> heap 메모리 생성 ==> member field 자리 ==> 자동으로 생성자 함수 호출
 4. ★반환형이 없기 때문에 void를 선언부에서 생략할 수 있다.(public 클래스명(){})
  
 [만드는 이유]
 =[생성되는 객체]마다 [강제적]으로 멤버 필드를 초기화 하고 싶다.
 
 class  Car{String color;}
 =설계도를 만든이는 아무다 자동자 색상은 니가 알아서 해(안해도 어쩔 수 없다.)
  
 class Car{String color = "blue"}
 =이 설계도대로 객체를 생성하면 무조건 자동차의 색상은 blue가 된다 
 
 문제) 자동차의 색상을 정하기 않고 출고하면
 	  설계도를 사용하는 사람이 자동차를 만들 때 색상을 넣지 않으면 출고 안되게 하고 싶어요
= 생성자 설계를 [강제]하지 않으면 객체 안 만들어져요

 [생성자 함수를 1개만 만들까?]
 생성자 함수는 오버로딩 할수가 있다.
 
 ★생성자 함수 쓰는 목적 : 멤버 필드 ==> [강제적] 초기화
  
 */

//★ 디폴트 생성자만 있을 경우엔 : 값을 넣어도 되고 않넣어도 되고 마음대로 해도된다.
class Car{
	String carname="포니";
	
	
	//★디폴트 생성자 ==> 이렇게 선언부를 작성안해도 사용가능하다
	public Car() {
		System.out.println("기본 생성자");
		carname = "내마음"; //필드값 변경
	}
}

class Car2{ //생성자 생략 ==> 자동 생성 호출
	String carName;
	
}

class Car3{
	String carName; //null
	
	public Car3() {
		carName = "포니";
	}
}

//자동차 만드는데 있어서 2가지 선택이 가능하게 해주는 설계도
class Car4{
	String carName;
	public Car4() {
		carName = "기본이름";
		
	}
	//오버로딩(함수) ==> 생성자 함수(특수함) ==> 생성자도 가능
	
	public Car4(String name) {
		carName = name;
	}
}

//자동차를 만드는데 [무조건(강제적) 이름을 가진 차]를 만들수 있게 해주는 설게도
//★디폴트 생성자를 몇시를 안하고(x), 따로 생성자를 명시(o) 했을 때 
//★명시 생성자로 인해, 디폴트 생성자는 작동하지 않는다.
//★이럴 경우엔 강제적으로 Car5 car = new Car5() 했을 지 값을 [무조건 강제적]으로 지정해줘야된다 
class Car5{
	String carName;
	
	public Car5(String name) {
		carName = name;
	}
}

class Car6{
	String carColor;
	int door;
	
	public Car6() {
		carColor ="blue";
		door =4;
	}
	
	public Car6(int num) {
		carColor = "blue";
		door = num;
	}
	public Car6(String color) {
		carColor = color;
		door = 4;
	}
	public Car6(int num, String color) {
		carColor = color;
		door = num;
	}
	
	
}


class School{  //디폴트 생성자를 선언안해도 ==> 컴파일러시 자동으로 생성된다.
	String schoolName="강남";
	
	//public School(){}
	//컴퍼일러가 School객체생성(new School()) 때 생성자 함수가 정의된게 아무것도 없어도
	//자동으로 디폴트 생성자가 만들어져서 실행
	
}

public class Ex13_Constructor {

	public static void main(String[] args) {
		Car car = new Car(); //Car() ==> 디폴트 생성자인 Car()를 호출한다는 뜻이다.
							 //클래스에 선언하지 않아도 자동으로 생성되 실행된다.
		System.out.println(car.carname);
		School school = new School();
		
		Car4 car4 = new Car4();
		Car4 car41 = new Car4("순향");
		
		//★일반 생성자(this[x])는 한 객체당 생성자를 하나밖에 생성못한다
		//★하지만 this포함한 생성자는 한 객체당 생성자를 여러개 만들 수 있다. 
		
		

	}

}
