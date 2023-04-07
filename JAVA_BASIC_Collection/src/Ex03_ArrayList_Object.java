import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {
	
	
	public static void main(String[] args) {
		//1. 사원 1명을 만드세요
		
		Emp emp = new Emp(1000, "김유신", "장군");
		System.out.println(emp.toString());
		
		//2. 사원 2명을 한번에 만드세요     //[정적배열]이라 방의 크기가 고정
		Emp[] emplist = {new Emp(100, "김씨", "영업"), new Emp(200, "박씨", "IT")};
		
		for(Emp value : emplist) {
			System.out.println(value);
		}
		
		//3. ArrayLise 사용해서	 //[동적배열]이라 방의 크기가 데이터를 넣을 때마다 증설
		ArrayList elist = new ArrayList<>();
		elist.add(new Emp(100, "김씨", "영업"));
		elist.add(new Emp(200, "박씨", "IT"));
		elist.add(new Emp(100, "김씨", "영업"));
		
		
		for(int i =0 ; i < elist.size() ; i++ ) {
			System.out.println(elist.get(i).toString());
		    //elist.get(i) ==> .toString()이 default로 생략된거라 ==> 똑같이 값이 출력되긴함
		}
		
		//toString() 사용하지 말고 3명의 사원 정보를 출력하세요
		//getter를 사용
		//ArrayList : 내부적으로 object[] ... 데이터 출력 관리가 힘들다.
		//object로 출력되서, 개별 데이터 타입별 검사를 매번 해줘야되서.
		
		for(int i =0 ; i < elist.size() ; i++ ) {
			Object obj = elist.get(i);
			System.out.println(obj);  // 재정의된 toString();
			//★★부모타입의 참조변수는 자식타입의 주소값을 받을때 
			//★★자식의 인스턴스 멤버(자원)에 접근하지 못한다 (재정의 제외)
			//★★그래서 자식타입으로 [강제 타입 변환] 해줘야된다.
			
			Emp e = (Emp)obj; //[강제 타입 변환] : 부모 ==> 자식 : 다운캐스팅
			System.out.println(e.getEmpno()+","+e.getEname());	
		}
		
		//현업 개발자 ( object ==> 다운캐스팅 ==< 자식 [자원] 접근_
		//object는 쓰지 말자 ==> 대신에 ==> 타입 강제(그 타입을 쓰게 하자)
		//데이터의 관리는 불편해도 하나의 타입으로 ==> 타입은 필요시에 사용해야된다.
		//↑[[제너릭]] : 
		
		ArrayList<Emp> list2 = new ArrayList<>();
		//★★★ 컬랙션명<자식클래스명> 참조주소 = new ~~()<>;
		list2.add(new Emp(1, "A", "IT"));
		
		for(Emp value : list2) {
			System.out.println(value.getEmpno());
		}
		
		
		
		
		
	}

}
