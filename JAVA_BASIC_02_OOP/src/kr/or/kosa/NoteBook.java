package kr.or.kosa;

/*
 
  1.노트북은 마우스를 가지고 있다.      			//마우스 = 부품데이터
  2.마우스는 휠 1개, 버튼 2개, 좌표값을 가지고 있다. 
  3.ㄴ노트북은 색상과 생산년도를 가졌다 
  
  노트북을 구성하는 마우스를 만드는 마우스 설계도(클래스)를 만들어야된다.
  
  [정보] = 고유데이터(정보), 상태데이터(정보), 부품데이터(정보) 
  





class Mouse{
	int x,y;
}


 */

public class NoteBook {
	
	 
	//1.노트북은 마우스를 가지고 있다. 
	//2.노트북은 마우스를 [필요에 따라] 가지고 있을 수 있다
	//(가진다) : 생성된 마우스의 주소값(객체:필드,메소드)을 가질 수 있다(heap)
	
	//public Mouse mouse = new Mouse(); : 통합 제품(라이플 싸이클이 같아서 다같이 삭제됨)
	
	public void handLeMouse(Mouse mouse) {
		 mouse.setX(100);
		 mouse.setY(200);
		 mouse.getReadMouseData();
	}
	// ↑필요에 따라서 내가 노트북에 마우스를 꽂아주는(할당) 해주는 메소드
	// Mouse객체의 인스턴스 멤버(필드, 메소드)를 이 메소드에서 사용가능하게 된다.
	
	
	private String color;
	private int year;
	
	public String getColor() {
		return color + "색상";
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	//함수 생성 (특수한 목정의 함수 : private member field 간접적으로 read, write)
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<0) {
			this.year = 1999;
		}else {
			this.year=year;
		}
		//private로 음수가 입력되는 것을 방지하는 코드를 작성함 
		//이렇게 간접할당으로 특정 입정값에 대한 조건을 걸어 줄 수 있는 장점이 있음
		
	}
	public void noteBookInfo() {
		System.out.println("[노트북 생상]:"+color+"[노트북 출시년도]:"+year);
	}
	
	/*
	 [객체지향언어 특성] : 캡술화(은닉화) = 직접할당을 막고 간접할당을 제어해줌(정보보호)
	 (사용법) : 자원을 private로 선언해 get, set로 간접접근해 자원할당한다.
	 (참조변수 입장에서 객체 접근 했을 때 자원이 보이지 않으면)
	 
	 1. 모든 member field 캡술화
	 2. 직접할당을 막고 간접할당을 통해서 원하는 값 제어
	 3. 간접 : 개발자가 직접 논리를 제어하겠다.
	 4. 간접 접근 함수 생성(get, set)
	 4.1 읽기, 쓰기를 마음대로 취사선택하여 작성할 수 있다(모두 쓸 필요 無)
	  
	  
	 */
	

}

