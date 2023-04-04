/*
 
  for문 ==> 향상된 for문, 개선된 for문
  
  JAVA : for(타입형 변수명 : 배열명 or Collection명) { 실행블록 } 
   
  1. 개선된 for문
 	for(타입형 for참조변수명 : 배열명)
  
  1.1 개선된 for문으로 [호출하기]
  		★★★★★for참조변수명.멤버명         //필드, 메소드
  
  JAVA
  
 */


public class Ex03_Array_For {

	public static void main(String[] args) {
	
		int[] arr = {5,6,7,8,9};
		
		
		//for문 == 기존
		for(int i =0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		//개선된 for문
		for(int value : arr) {
			System.out.println(value);
		}
		
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		
		for(String value : strarr) {
			System.out.println(value);
		}
		
		
	}

}
