
class Pbase{
	int p = 100;
	
}
class Cbase extends Pbase{
	int c = 200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {
	
	public static void main(String[] args) {
	//상속관계에서 [부모타입의 참조변수]는 [[여러개의 자식타입 주소]]를 가질수있다
	
	Cbase cbase = new  Cbase();
	System.out.println(cbase.toString());

	Pbase pbase = cbase;
	
	Dbase dbase = new Dbase();
	
	pbase = dbase;
	
	System.out.println(pbase.toString());
	
	/////////////////////////////////////////
	
	//부모주소를 자식에게 줄수.....불과(x)...강제 변환
	
	Cbase ccc = (Cbase)pbase; //down casting
	System.out.println(ccc.p);
	
	
	}
}
