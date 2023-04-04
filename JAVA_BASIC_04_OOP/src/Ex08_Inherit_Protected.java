import ko.or.kosa.Pclass;

/*
 [Protected]
  
  =(사용의미) ★ [메소드 재정의]를 해주길(준강제성) 바라는 의미에서 protected를 쓴다
  
  protected 양면선 ==> default , public
  상속 없는 클래스 안에서 protected : default 동일
  상속관계에서의 protected : public
  
 */

class Dclass {
	public int i;
	private int p;
	int s; //default
	protected int k;  //default 동일 ( 상속이 아니면 사용하지 않아요)
	
}

class Child2 extends Pclass{
	void method () {
		this.k = 100; // 상속관계에서 ==> 자식은 부모의 protected 자원을 사용가능(public 처럼)
		//m();
	}

	@Override
	protected void m() {
		// TODO Auto-generated method stub
		super.m();
	}
}


public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pclass = new Pclass();
		//pclass.i; :public 접근
		
		Child2 child2 = new Child2();
		//Child2.m()  : erro;
		//protected는 다른패키지에 있는 main메소드에서는 호출 못한다.
		//그래서 메소드 재정의를 자식 클래스에서 해야지만 호출 가능해진다.
		
 	}

}
