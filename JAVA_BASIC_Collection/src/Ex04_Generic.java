import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.kosa.Emp;

/*
 
 1.타입을처음부터 강제
 2. 타입 안정성(타입 강제)
 3. 강제 형변환 필요 없다   [ex : (Car)object ] 필요없어진다.
 
 
 */

class MyGeneric<T>{   //Type 파라미터
	T obj;
	
	void add (T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
	
}

class Person{
	int age = 100;
}

public class Ex04_Generic {

	public static void main(String[] args) {
		MyGeneric<String> mygen = new MyGeneric<String>();
		/*
		 	String obj;
	
			void add (String obj) {
				this.obj=obj;
			}
			String get() {
				return obj;
			}
			
		} 
	    */
		
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동"); 
		//제너릭을 String으로 지정해줘서 add()시 문자열밖에 못넣는다.
		
		ArrayList list2 = new ArrayList<>();
		list2.add(10);
		list2.add("홍길동");
		list2.add(new Person());
		
		
		//개선된 for문 사용해서 Peerson객체는 age 값을 출력하고 나머지는 값을 출력
		for(Object obj : list2) {
			System.out.println(obj);
			
			if( obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p.age);
			}
			else {
				System.out.println(obj);
			}
		}	
		
		
		List<Person> plist = new ArrayList<>();
		plist.add(new Person());
		plist.add(new Person());
		
		
		
		for(Person value : plist) {
			System.out.println(value.age);
		}
		
		
	}

}
