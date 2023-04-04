package kr.or.kosa;

//1.모든 member field 캡술화 : private
//2.간접 처리(get, set)를 필요에 따라 구현
//3.데이터를 받을 수 있는 클래스(VO, DTO, DOMAIN) : 1건의 데이터를 담을 수 있는 클래스

/*
 Lombok이란 : java 라이브러리로 반복되는 getter, setter, toString 등을 코딩없이 없이, 코드수를 줄여주는 라이브러리
 
  
  n
 */

public class Car {

	private int window;
	private int sppe;
	
	
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	public int getSppe() {
		return sppe;
	}
	public void setSppe(int sppe) {
		this.sppe = sppe;
	}
}
