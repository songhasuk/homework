import kr.or.kosa.Tv;

public class Ex03_Ref_Method_call {

	public static void main(String[] args) {
		Tv lgtv = new  Tv(); //heep메모리에 객체를 올리세요, stack메모리엔 참조주소
		lgtv.brand="LG";
		lgtv.viwe();
		
		lgtv.plus();
		lgtv.plus();
		lgtv.plus();
		lgtv.viwe();
		
		lgtv.minus();
		lgtv.viwe();
		
		Tv shstv = new  Tv();
		shstv.brand="SHS";
		
		Tv ktv = shstv; // 같은 참조주소를 가진
						// 해당 코드엔 객체가 2개만 있는거다.
		
		
	}

}
