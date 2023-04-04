package kr.or.kosa;
/*
 
클래스 == 설계도 == 데이터 타입(사용자}

설계도(종이) = 구체와(메모리) 올리는 행위 = 구체화된 자원 = 객체(object), 인스턴스

설계도 : field(고유, 상태, 부품[더 나누어 질 수 있다]) +메소드(기능, 행위) + 생성자

[필드] = 생성되는 객체마라 다른 값을 가질수 있으니, 디폴트가 자동할당되서 무조건 값 초기화를 해줄 필요가 없다  
(리버럴) = 사용자가 변수에 값을 입력하는 행위  
  
*/
public class Person {
	public String name;
	public int age;
	public boolean power;
	
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다",name,age,power);
	}
	
	
}
