import java.util.Vector;

/*
Collection FrameWork
[다수의 데이터]를 다루는 [표준화된 인터페이스]를 구현하고 있는 [클래스 집합]

Collection 인터페이스  >> 상속 List >> 구현 ArrayList
Collection 인터페이스  >> 상속 Set  >> 구현 HashSet

* ArrayList 의 부모타입은 List 이다 (0) >> 다형성
* Collection 인터페이스는 ArrayList 부모타입니다 (0) 
* instanceof 검증

Map 인터페이스 (key , value) 쌍의 배열 >> 구현 HashMap


1. List (줄을 서시오) 
순서가 있는 데이터 집합(번호표) ... 중복 허용 >> 순서(0),중복(0) 데이터 집합
>> Tip) Array 관리 >> [홍길동][홍길동][홍길동][][] >> [0] 번째 방 ... 단점.... 

1.1  Vector   (구버전) -> 동기화 보장 (0)  >> Lock default
              Vector (화장실) -> 멀티 스레드 환경(Lock) -> 성능(x), 보안(0)
1.2  ArrayList(신버전) -> 동기화 보장 (x)  >> Lock option
              ArrayList (비빕밥) -> 멀티 스레드 환경(Lock) -> 성능(0), 보안(x) 
Vector 유지보수,학습용
ArrayList 활용

----------------------------------------------------------------------
다수의 데이터를 다루는 방법 (Array >> 정적 ,고정
*******방의 개수가 한번 정해지면 (방의 크기는 변경 불가) ***********
1. int[] arr = new int[5];
2. int[] arr2 = new int[]{10,20,30};
3. int[] arr3 = {100,200,300};
arr3 놀고 있는데 데이터가 100건이 추가
int[] arr4 = new int[100];  
******새로운 배열 생성하고 데이터 이동 (코드로 직접 개발자 구현)********

Array 
1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car()}  2개
2. 접근방법   (index) >>  cars[0] ,,,, n(length-1)

List 인터페이스를 구현하고 있는 ArrayList , Vector는 
1. 배열의 크기가 동적으로 확장 or 축소 가능 >> ** 진실은 컴파일러가 새로운 배열을 만들고 데이터 이동 ...**
2. 순서를 유지 (내부적으로 Array) 사용 , 중복값 허용
3. 중복값 허용 (index 를 통해서 제어)
*/

public class Ex01_Vecter {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 용량 :"+v.capacity()); //10개
		System.out.println("size : 값의 크기(개수) :"+ v.size());
		
		v.add("AA");  //순서 [0]
		v.add("BB");  //순서 [1]
		v.add("CC");  //순서 [2]
		v.add(10);    //순서 [3]
		
		System.out.println("size : 값의 크기(개수) :"+ v.size());
		System.out.println(v.toString());
		
		//Array ==> 배열의 갯수 ==> length  : 방(공간)의 갯수
		//Collection ==> size()  			: 값의 갯수
		
		for(int i = 0 ; i < v.size() ; i++) {
			System.out.println(v.get(i));  
			//get(index} return 배열 값이
		}
		
		for (Object vlaue : v) {
			System.out.println(vlaue);
		}
		
		//단점 : 작은 데이터(같은 타입의 데이터) ==> 가장 큰 타입을 사용해서 얻는 것이 불합리
		//제너릭 ==> 타입을 강제 
		
		Vector<String> v2 = new Vector<String>();
		v2.add("Hello");
		v2.add("world");
		
		for(String value : v2) {
			System.out.println(value);
		}
		
		Vector v3 = new Vector<>();
		System.out.println(v3.capacity()); 
		//기본적으로 항당해주는 크기를 반환
		//Object[] obj = new Object[10] 동적
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); 
		v3.add("A"); //11번째
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity());  //방이 추가로 들어가면 알아서 증설해준다.
		
		
		//컬랙션은 공간이 부족하면 = 새로운 배열을 만들고 이사시킨다.
		
		
		
	}

}
