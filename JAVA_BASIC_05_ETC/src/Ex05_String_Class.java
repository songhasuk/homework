/*
 
  [String 클래스] : 문자를 여러개 담을 수 있는 클래스
  String 수 많은 함수(메소드)를 가지고 있다. ==> 대부분의 데이터는 문자열 ==> 문자열을(자르고, 합치고, 나누고, 조합)
  [String 가지고 있는 함수] : 
  
 */



public class Ex05_String_Class {

	public static void main(String[] args) {
		String str ="";
		String[] strarr = {"abc", "bbb", "ccc"};
		
		for(String s : strarr) {
			System.out.println(s);
		}
		
		//사용방법 : int, double 값 타입처럼 부담없이 사용함
		
		String st = "홍길동";
		System.out.println(st.length());
		System.out.println(st);
		//st.toString();
		System.out.println(st.hashCode());
		
		//[홍][길]동]  ==> char[]로 관리
		//String타입은 보이지 않을 뿐이지 문자열 배열이다
		//String클래스는 Object 부모 클래스를 가지고 있다 toString()
		//[상속관계] String extend Object  ==> 재정의 (override) ==> 주소에 가서 값을 read해서 그 담긴 [값을 리턴]
		
		
		//[정식 표기]
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String name = "가나다라마";
		//String 내부적으로 char[]형타입 member field >> 배열[가][나][다][라]
		//class String extends Object {private char[] str ..... setter @override toString}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열비교;
		System.out.println(str1); // toString()이 생락되 있다.
		System.out.println(str2.toString()); // toString()재정의 주소값이 아니고 값이 나오도록

		System.out.println(str1 == str2); //논리적으로 보면 주소값이 서로 달라서 : false
		// == : 연자자는 값이 들어가 있는 [메모리의 값(주소)을] 비교 
		// ★★★★★★ 메모리에 실제로 같은 문자열이 있으면 -==> 저장 공간을 재사용한다.
		//그래서 str1 과 str2는 같은 메모리를 참조한다.
		
		
		//문자열의 비교는 무조건 ...equals
		System.out.println(str1.equals(str2));
		//equals는 주소를 찾아가서 [그 안에든 실제 값]을 비교한다.
		
		//문자열 비교(String타입 객체로 선언)
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
		
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);
		s += "A";
		System.out.println(s);
 		
		
		//String 누적쓰면  ... 바보 ....
		//Stringbuilder , String buffer
		
	}

}
