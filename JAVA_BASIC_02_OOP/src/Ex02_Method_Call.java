import kr.or.kosa.Fclass;
import kr.or.kosa.Tv;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		Fclass fclass = new Fclass();
		
		fclass.m();
		fclass.m2(10);
		fclass.m3();
		fclass.m4(100);
		
		int result = fclass.m3();
		System.out.println("m3의 반환값:"+result);
		
		result = fclass.m4(10);
		System.out.println("m3의 반환값:"+result);
		
		result = fclass.opSum(-5000);
		System.out.println("opSum의 반환값:"+result);
		
		result = fclass.max(1, 5);
		System.out.println("max의 반환값:"+result);
		
		
		Tv tv = new  Tv();
		
		tv.minus();
		tv.viwe();
		tv.plus();	
		tv.plus();
		tv.viwe();
	}

}
