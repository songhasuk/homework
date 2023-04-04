import kr.or.kosa.Car;

public class Ex06_Static_init {
/*
 
  [static의 초기값]
  1.static : 공유자원 (객체들 간의 공유자원) : 객체마다 같은 값을 공유할 거야  
  2.인스턴스 변수 : 생성되는 객체마다 다른 값을 가지게 하겠다.
  
  1,2번은 default값 : 초기화는 필요에 따라 할수 있고 않할 수도 있고
  
  
 */
class Test_S{
	static int cv = 10; //1.초기화
	static int cv2; //default = 0
	int iv = 9; //2.초기
	
	
	//초기화를 안해도 1,2번은 사용하는데 있어서 문제가없다.
	//★초기화 작업을 무조건 선언부에서 할 필요가 없다.
	
	//3. static 자원 초기화 : static {}
	
	static { 
		//static 실행되는 시점 :  static int cv, static int cv2가 실행되고 나서 메모리에 올라감
		//static블록 안에서는 조작된 표현이 가능 : if, for문을 이용한 데이터 조작
		cv = 1111; 
		cv2 = cv + 2222;
		
	}
	
	//4. 일반 자원(인스턴스 변수) 초기화 블록 : { }
	//★4.은 일반 생성자랑 기능이 똑같아서 안쓰인다.
	{
		//int iv = 9; : 메모리 → Test_s test = new Test_s();
		//{} 초기화 블록 언제? : 멤버 필드가 heap 올라간(객체 생성된) 직후 블록문 실행
		
		System.out.println("초기화 블록 실행");
		if(iv<10) iv=10000;
	}
}


	
	
	
	public static void main(String[] args) {
	
		System.out.println(Test_S.cv);
		System.out.println(Test_S.cv2);

		//Test_S t = new Test_S();
		
		
	}

}
