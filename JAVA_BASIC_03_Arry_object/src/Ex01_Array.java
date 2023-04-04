import java.util.Arrays;
import java.util.Iterator;

/*
 
  배열은 객체다(Array)
  
  1. 참조주소값을 가져서 ==> new를 통해서 생성한다 ==> heap 메모리 저장된다(관리자원)
  2. 정적배열(고정배열) : 배열은 한번 선언하면(크기를 선언) ==> 변경 불가
  3. Collection(동적) : API 클래스
  4. 자료구조(알고리즘) : 제어문(결합) : 기초적인 자료구조 
  
  [선언 방식(정적배열==>배열 크기고정)]
  1. 타입형[] 배열명 = new 타입	형[배열크기];
  2. 타입형[] 배열명 = new 타입형[] { 값 ... } ; //들어가는 값 갯수에 따라 배결 크기 결정
  3. 타입형[] 배열명 = { 값 ... }                //컴파일러가 자동으로 new처리를 해줌
  [선업 방식(객체 타입)]
  1.클래스명[] 배열명 = new 클래스명[]; 
 */


public class Ex01_Array {

	public static void main(String[] args) {
		int[] score = new int[5];
		//정수형 타입의 변수 5개를 ==> 힙에 생성 ==> 연소된 공간 ==> 방이름 제공[0][1][2][3][4] 
		
		
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		System.out.println();
		
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);  
		//	[100, 200, 300, 400, 500]
		
		
		Arrays.sort(score);
		
		//
		
		int[] arr = new int[5];
		int[] arr2 = new int[]  {10,20,30,40,50};
		int[] arr3 =  {11,22,33};
		
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//배열 == 객체  (new(생성) ... 힙(저장))
		int[] arr4; // 스택에 arr4 참조변수 생성 (null) ==> 힙 메모리에 없어요
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4); // 주소값을 가지고 있다.
		
		
		int[] arr5  = arr4; //주소값 할당  ==> arr4의 주소값을 넣어줌
		
		System.out.println(arr4 == arr5);
		
		//배열은 타입형을 몇개 가질수 있나? : 8가지 + String + 클래스(객체 타입)
		
		
		String[] strarr = new String[] {"가", "나", "다"};
		for(int i =0 ; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		Car[] cararr = new Car[3]; // 객체 타입형 배열 선언
		
		// cararr[0] ==> car객체 타입의 참조주소값
		
		// Car c = new Car();
		//cararr[0] = c;                 // cararr[0]
	}
	
class Car{ // 클래스 == 설계도 == 데이터 타입
	
}

}
