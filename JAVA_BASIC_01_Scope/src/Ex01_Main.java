import kr.or.kosa.common.Car;

/*

클래스 == 설계도 == 타입(사용자 정의)

클래스 구성요소(설계도라고 판단 할려면 최소한 무엇을 가지고 있어야 한다)
=(필드 + 메소드 + 생성자)

필드(Member field) = 데이터, 자료 정보를 담고있다.(고유정보, 상태정보, 부품정보)
1. 고유정보 = 색상, 2. 상태정보 = 속도, 3.부품정보 = 엔진(나눠질 수 있는 정보)
함수(method) = 기능(행위)를 기술한 것 = 달린다, 소리가 난다, 문을 연다
생성자 = 객체 생성시 필드값을 초기화하기 위해 생성하는 함수 = getter, setter


class 설계도 {
 고유정보, 상태정보, 부품정보
 기능(행위){ 	
 }
}

클래스, 필드, 메소드, 생성자[영역 범위] = 생성되는 장소(위치) or 접근자(한정자, 수정자)

1. 장소(위치) = 폴더(package), 클래스 내부, 함수 내부, 제어문 내부 
2. 접근자 = public, private, default, protected
[public] = 어떤 패키지인지 상관없이 사용가능
		 
package kr.or.kosa.common 패키지 안에 생성한 Car 클래스는 = public class Car() = 모든 패키지 사용가능 
package kr.or.kosa.common 안에 생성한 AirPlane 클래스는 = class AirPlane{} = 같은 패키지 안에서만 사용가능

[default] = 같은 패키지 내에서만 사용가능
하나의 물리적 JAVA파일은 여러개의 클래스를 가질 수  있다
Ex01_Main.java 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다.
1. 개발에서는 필요한 클래스는 package 생성하고 그안에 만들어 사용합니다. (Car 클래스)
2. 그냥 연습...굳이 패키지 생성...물리적 파일 여러개 만들 필요가 있을까?
3. 하나의 물리적 파일(.java)에 여러개의 클래스를 만들어 쓸 수 있게 해줄까
3.1 대신에 물리적파일(.java)에서는 public 접근자로 선언될 클래스는 하나만 인식된다.



[private] = 캡술화(은닉화) 해주는 접근자, get(읽기):set(저장)로 초기값 지정해줘야된다.
		  = 설계자의 의도 = 클래스 내부에서만 사용하는 목적으로 
		  = 설계자의 의도 = 직접 할당을 막고 간접할당(set)을 활동을 제어하겠다.
public String getEname() {
		return ename + "님"; //간접 할당의 장점 = "님"
	}
*/

class Emp {
	
}
class Dept{ // default class

	int deptNo; //default 
	public String dname; //public를 붙여도 다른 패키지에서 사용불가(접근자 사용 의미 無)
	private int count; // 설계자의 의도 = 클래스 내부에서만 사용하는 목적으로 
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) { //간접할당
		if(count < 0) {
		this.count = 0;
		}else {
		this.count = count;
		}
	}
	
	
}


class Test{ //default
	int i;  //default, 인스턴스 변수 = 객체 선언시 생성
	
	void print () { 	//default
		int num = 0;	//지역변수 = 메소드 호출시 생성
		for(int i =0; i<=100; i++){
			//i = for문 실행시 생성
		}
	}
	
}

public class Ex01_Main {

	public static void main(String[] args) {
		
		Apt apt = new Apt();
		//같은 패키지에 있는 클래스 객체 선언
		
		Car car = new Car(); 
		// public Car {} 패키지의 구분없이 어디서나 사용가능
		
		Dept dept = new Dept();
		dept.deptNo =100;
		System.out.println(dept.deptNo);

		
		dept.dname = "IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.getCount());
		
		Test test = new Test();
		test.print();
	}

}
