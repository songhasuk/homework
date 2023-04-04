package ko.or.kosa;


// 새 (공통 자원 : 일반 , 추상) : 날수 있다, 빠르다
public class Bird {
	
	public void fly() {
		System.out.println("flying");
	}//공통기능
	
	protected void moveFast() {
		fly();
	}//설계자 고민
	//Bird 상속하는 당신은 moveFast() : 자원에 대해서 재정의 해서 써야해 ... 강제 ...
	
	

	
}
