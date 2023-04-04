package ko.or.kosa;
/*
 
디자인 패턴 : (생성에 관련된 이야기) : new

싱글톤 : 객체 하나를 만들어 [공유] 하겠다.
(의도) 하나의 [객체를 공유]하는 보장성 코드를 만들어라
  
  
  Singleton s1 = new Singleton();
  Singleton s2 = new Singleton();
  Singleton s3 = new Singleton();
  
 
 
 1. 생성자를 막는다
 2. 공용 객체로 만든다.
 3. 객체가 한상 같은 주소를 보개 해준다
*/




public class Singleton {
	
	private static Singleton p = new Singleton();
	//2. static을 써서 공용 객체로 만들면 된다.
	
	
	private Singleton() { 
		// 1.생성자를 캡술화(은닉화 : private) 
		// 생성자 접근자 private ==> 디폴트 생성자 호출하지못해서 객체 new 하게 못하게함
	}
	
	public static Singleton getInstance() {
		if( p == null) {
			p = new Singleton();
		}
		return p;
		
		//static로 선언되어서 ==> 클래스에리어에 메모리에 올라와
		//항상 같은 주소(메모리) 보장해준다.
		//3.같은 주소 보장을 해주기 위해서
		
		
	}
	//같은 클래스에서 public, static는 호출에 문제없다.
	
}
