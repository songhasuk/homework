/* 
 [call by value]
  함수 사용시 파라미터(매개값)을 전달 or 주소값(참조주소값==ref) ref 전달
  void m (int x) {: x라는 변수 값을 받는다
   x값 출력 : 100
   x = 10000;
  } 
  int y = 100;
  m(y) : 호출
  
 -----------------------------
 [call by ref]
 void m2(Car c) { : c라는 매개변수는 Car객체타입을 가지는 [참조주소값]을 받겠다.
 
 	c.color // "red"
 } 
 
 Car c2 = new Car();  //c2의 주소가 : 0xab...
 c2.color = "red";
 m2(c2);  // == m2(0xab...)
 
 
 */

class Data {
	int i;
}


public class Ex10_Method_Call {
	
	static void scall(Data sdata) { // Data객체 타입을 가진 참조주소값을 가지겠다.(ref)
		
		System.out.println("함수 : "+sdata.i);
		sdata.i = 1111; //...번지에 있는 i변수값을 1111변경
	}
	
	static void vcall(int x) { // 정수값을 받겠다.(value)
		System.out.println("before :" + x);
		x=8888;
		System.out.println("after :"+ x);
	}

	public static void main(String[] args) {
		Data D = new Data();
		D.i = 100;
		System.out.println("d.i:"+D.i);
		
		scall(D); 
		//★ 참조주소를 매개변수로 넣어 메소드 안에서 [객체의 필드를 따로 호출해 필드값]을 조작
		System.out.println("after d.i:"+ D.i); 
		//scall메소드를 통해 조작된 i변수값 출력
		
		vcall(D.i); 
		//★ 직접 객체의 필드값을 매개변수로 넣어 [직접 매개변수 값]으로 조작
		System.out.println("after d.i:"+ D.i); 

	}

}
