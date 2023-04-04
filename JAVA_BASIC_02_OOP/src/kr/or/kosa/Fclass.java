package kr.or.kosa;

/*
 
 [기능 (행위) 만드는 방법]
 
 =하나의 함수(메소드)는 하나의 기능함 구현해야된다. (ex: 먹는, 자는 기능 두개를 한 메소드에 만들면 안된다)
 
 
 1. void, 매개변수(O) : public void print(String str){실행구문}
 2. void, 매개변수(x) : public void print(){실행구문}
 3. 반환형(O), 매개변수(O) : public int print(int data){return 값;}
 4. 반환형(O), 매개변수(x) : public int print(){return 값;}
 
 [void] = 반환값(return)이 없다
 [반환형] = 8가지 기본형, String, Array[배열], class, interface, collection
 
 public boolean print(){return true}
 Car print(){return Car의 참조주소값(명)} 
 Car print(){return Car의 Car c = new Car(); return c;}
 Car print(){return Car의 return new Car();}
 
 String print(){return "문자열";}
 
 [매개변수 타입] : void print(String 변수명){}
 
 void print (int i){} → 호출 : print(100);
 void print (String str){} → 호출 : print("문자열");
 void print (Car c) {} → 호출 : print(new Car());  
 void print (Car c) {} → 호출 : print(참조변수명);  
 
 void print(int a, int b, int c){} → 호출 : print(1,2,3) 
 //매개변수를 무조건 3개 받아야되는 메소드
 
 [메소드 이름 정의] = 첫단어의 첫글자는 소문자, 나머지 단어 첫글자는 대문자로 (ex: getNumber();)
 
 사원테이블에서 사원의 모든 정보를 가지고 오는 함수를 만들어라 = void getEmpAllList()
 사원테이블에서 사원id로 모든 정보를 가지고 오는 함수를 만들어라 = void getEmpListByEmpno(int empno)
 
 
 
 */

public class Fclass {

	public int data;
	
	//void m() : default void m() = 같은 패키지 내에서만 사용 가능
	//함수의 접근자(수정자) : [public가 70%] , [private 30%]
	//private = 다른 함수를 "도와주는 함수" (공통함수}
	
	public void m() {
		System.out.println("반환값 없는 메소드");
	}
	public void m2(int i) {
		System.out.println("반환값 있는 메소드"+i);
	}
	public int m3() {
		return 100;
	}
	
	public int m4(int data) {
		return 100+data;
	}
	
	//리턴 0, 반환 값 0
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	
	// 함수의 접근자(수정자) 한정자
	// int sum(){}; → default int sum(){};
	// private int sum() → 객체 입장에서 접근 불가 → 같은 클래스 안에서 접근 가능
	// 클래스 내부에서 다른 함루를 도와주는 공통 함수
	
	private int subSum(int i) {
		return i+100;
		//메소드 호출이 안된다
	}
	
	public void callSubSum() {
		int result = subSum(100);
		System.out.println("call result:"+ result);
	}
	
	public int opSum(int data) {
		int result = subSum(data);
		
		if(result > 0) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	/*함수를 생성하는데 
	  정수타입의 매개변수 2개를 받아서 둘중에 큰 값을 리턴하는 함수를 만드세요
	  ex) max(10,5) return 시 10이 반환되면 된다. 
	
	
	*/
	
	public int max(int i, int j) {
	
		int result =0;
		
		if(i > j) {
			result = i;
		}else
			result = j;
		
		return result;
		
		// return (i > j) ? i :j ;
	}
	

}
