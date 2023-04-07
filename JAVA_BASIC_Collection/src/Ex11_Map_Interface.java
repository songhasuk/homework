import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
(key , value) 쌍의 구조를 갖는 배열
ex)  지역번호 (02,서울) (031,경기)

key 중복(x)   >> Set ...
value 중복(0) >> List ...

Generic 지원

Map 인터페이스 구현하는 클래스: 동기화(Thread : stack 여러개 사용하기)
구버전 : HashTable (동기화) 보장 : 한강 화장실 (Lock) 자원보호
신버전 : HashMap   (동기화) 보장하지 않아요 :한강 비빕밥 (성능) ******

ArrayList , HashMap  + Generic >> 기본적인 CRUD >> DB
*/
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004"); // id, pwd
		map.put("scott", "1004");
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); //대소문자 구별 (false)
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1007"));
		
		//key 제공 .... value 값
		System.out.println(map.get("Tiger")); // value
		System.out.println(map.get("hong")); //null
		
		//만약에
		System.out.println(map.size());
		map.put("Tiger", "1008");  //key 동일하면 value (replace) 
		System.out.println(map.size());
		System.out.println(map.get("Tiger"));
		System.out.println(map.toString());
		
		Object value = map.remove("Superman");
		System.out.println("삭제된 value : " + value);
		System.out.println(map.toString());
		
		//응용(이해)
		Set set = map.keySet();
		//keySet() 함수는 Set 인터페이스를 구현하고 있는 객체를 생성하고 데이터 담아서
		//그 주소 리턴
		//부모타입인 Set 인터페이스를 통해서 자식객체의 주소를 받을 수 있다
		//표준환된 출력
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	   Collection clist =	map.values();
	   System.out.println(clist.toString());
	}

}
