
class Person{
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name, int age){ //강제 생성자
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println(this.name+ "  :  "+this.age);
	}

}



/*
  
  [객체 타입형 배열]
  1. 호출 방법 : 참조주소명[배열위치값].맴버명     //필드, 메소드 사용가능
 
 */
	

public class Ex04_Object_Array {

	public static void main(String[] args) {
			int[] intarr = new int[10];
			
			boolean[] boolarr = new boolean[5]; //false(디폴트값)
			
			
			
			Person p = new Person(); // local 참조 변수 p ==> p라는 변수는 주소값을 가진다.
			p.name = "홍길동";
			p.age = 100;
			
			//Person 객체타입의 사람 3명을 만드세요 ==> 힙에 객체를 3개 저장한다
			//방만 만들고 방에 아무도 살지 않아요 ==> Person 타입이 오는방
			Person[] person = new Person[3];
			//System.out.println(person[0].age = 200);
			//방이 비워져 있어요 ==> new 연산자로 객체를 생성 안해서 error
			
			person[0] = new Person();  //방은 참조주소값을 갖는다
		
			Person p5 = new Person();
			person[1] = p5;
			
			person[2] = new Person();	
			person[2].name="송하석";
			person[2].age=200;
			
			System.out.println(person[2].age);
			System.out.println(person[2].name);
			
			//★★★객체 배열 ==> [1.방을 만드는] 작업과 [2.방을 채우는] 작업은 별도로 수행해야된다. 

			
			//[★객체 배열 생성 방법★]
			// 1. int[] arr = new int[10]
			Person[] parray = new Person[10]; 
			//[1.방만 만들어져]있는 상태 ==> default 값 null
			//parray[0] == null 인 상태
			//방에 들어갈 주소도 만들어야 합니다 (Person 타입과 동일)
			
			for(int i =0 ; i < parray.length; i++) {
				parray[i] = new Person();
			}
			//[2.방을 채우는(참조주소를)] 
			
			
			//2. int[] arr = new int[] {10,20,30}
			Person[] parray2 = new Person[] {new Person(), new Person(), new Person() } ;
			
			//3. int[] arr = {10,20,30}
			Person[] parray3 = {new Person(), new Person(), new Person()} ;
			
			
			
	}

}
