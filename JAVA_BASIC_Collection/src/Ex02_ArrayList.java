import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 
 //List 인터페이스를 구현하고 있는 클래스 ==> ArrayList : 순서(o) , 중복 데이터(o)
 //식당 번호표, 은행 번호표 (동명이인)
 



*/


public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList(); // ctrl+shift+o

		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i = 0 ; i< arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println(arraylist.toString());
	
		
		//add 함수는 데이터를 순차적으로 넣기 작업을 함
		
		arraylist.add(400); //[3]번째 방에 들어감ㄴ
		arraylist.add(0, 1111); 
		//특정 위치(방)에 접근해 값을 변경해주는것
		//★★그러나 이전 값은 그대로 유지된 상태로 
		//★★이전 값은 변경된 [방 위치에서 한칸씩 뒤로] 간다. 
		
		System.out.println("0번재 방에 1111추가"+arraylist.toString());
		
		//1. 비순차적인 데이터 추가, 삭제 ==> 성능이 좋지가 않다. ==> 순서가 있는 데이터 집합
		//2. 순차적인 데이터 추가, 삭제 ==> 유리한 장점이 있다.
		
		//어떤 데이터가 나열됐을 때 
		
		System.out.println(arraylist.size());
		arraylist.clear();
		System.out.println(arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		
		System.out.println(arraylist.isEmpty());
		System.out.println(arraylist.size());
		
		Object value = arraylist.remove(0);    //0번째 방 데이터(101) 삭제
		System.out.println(arraylist.toString()); 
	
		//★★★★★★★★★★★★★
		//인터페이스를 부모타입으로 ... 다형성(확장성, 유연성)
		
		//ArrayList arraylist = new ArrayList();
		List li = new ArrayList();
		//부모타입의 참조변수 li는 자식객체(ArrayList, LinkList)의 주소값(객체)를 가질수 있다.
		//인터페이스는 구현코드가 없어요 ... 재정의 ... 자식의 함수 실행
		//필요에 따라 ArrayList를 사용하거나 LinkList를 사용 할수 있게 해주기 위해
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		System.out.println(li.toString());
		
		List li2 =  li.subList(0, 2);
		//★★ li.subList(0, 2) : 0~2번째 값을 새로운 list의 li2에 가져와 넣겠다는 함수
		//★★ list참조주소.subList(0, 2);
		
		//내부적으로 List 인터페이스 ... 코드
		System.out.println(li2);
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString());
		Collections.sort(alist); //낮은 값부터 정렬 : 오름차순
		System.out.println(alist.toString());
		Collections.reverse(alist);//높은 값부터 정렬 : 내림차순
		System.out.println(alist.toString());
		
		
		
		
		
	}
	

}
