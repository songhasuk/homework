
class Human{ 
	String name;
}

class OverClass{
	
	public int add(int i, int j) {
		return i+j;
	}
	void add (Human human) { // Human객체타입의 참조주소를 매개변수로 받는 메소드

		System.out.println(human.name);

	}
	
	//[main 메소드에서]
	//1. add(new Human());
	//2. Human h = new Human(); 	add(h)
	
	//배열은 객체다  == 배열도 타입입니다.
	
	int add( int param) {
		return param+100;
	}
	
	int[] add(int[] params) { // add(String ... valuses)
		
		int[] target = new int[params.length];
		for(int i = 0; i< target.length ; i++) {
			target[i] = params[i] + 1;
		}
		return target; //참조주소값 (힙에 있는 target 배열의 주소)
		
		//return null;
		//배열, 객체는 [참조주소를 반환] 해줘야되서 기본값인 null을 리턴해줄 수 있다.
		
	}
	//[main 메소드에서]
	//1. int[] arr = {1,2}  	add(arr}  //배열의참조주소를 인수값으로 넣은
	//2. 
	
	//void call(int i, String s, Car[] c, int[] arr){}
	//int[] call(int[] a, int[] b, int[] c), {return null;}
	
}

public class Ex06_Array_Method {
	
	public static void main(String[] args) {
		
		OverClass overt = new OverClass();
		int[] source = {10,20,30,40,50};
		int[] ta = overt.add(source);
		
		for(int value : ta) {
			System.out.println(value);
		}
		
	}

}
