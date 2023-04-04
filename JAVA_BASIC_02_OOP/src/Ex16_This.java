
/*
 
  (원칙) : 객체를 생성할 때 생성자는 1개만 호출가능 [new Zcar() ... new Zcar(10)]
  
  ★this. : 객체 자신
  
  ★Zcar() == this() : 디폴트 생성자는 this(인수값...)이랑 같은 역활을 해준다.
  	  

  
 */
 

class Zcar{
	String color;
	String gearType;
	int door;
	
	public Zcar(){ //디폴트 생성자
//		this.color = "red";
//		this.gearType = "auto";
//		this.door = 2;
		this("red", "auto", 2); //★ 위의 3줄 코드와 같은 역활 해준다.
		
	}
	
	public Zcar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void zcarPrint() {
		System.out.println(this.color+" , "+ this.gearType+ " , "+this.door);
	}
}

class Zcar2{
	String color;
	String gearType;
	int door;
	
	public Zcar2() {
		this("red",2);
		System.out.println("디폴트");
		//1.기본옵션(red, 2, auto)
	}
	
	public Zcar2(String color, int door){ //기어 기본설정, 색상, 문의 갯수 변경
		this(color,"auto",door);
		System.out.println("오버로딩 매개변수 2개 콜");
		//2.옵션(color, door, (기어: 기본값 auto)
		
	}
	
	public Zcar2(String color, String gearType, int door) { // 생상, 기어, 문의 갯수 변경
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("오버로딩 매개변수 3개 콜");
	}
	
	void zcarPrint() {
		System.out.println(this.color+" , "+ this.gearType+ " , "+this.door);
	}
}
	
public class Ex16_This {

	public static void main(String[] args) {
		Zcar zcar = new Zcar();
		zcar.zcarPrint();
		
		Zcar zcar2 = new Zcar("ddd", "ddd", 2);
		zcar2.zcarPrint();

		Zcar2 zcar22 = new Zcar2(); // 기본옵션
		
		Zcar2 zcar23 = new Zcar2("gold", 10); 
		
		Zcar2 zcar24 = new Zcar2("gold","auto2", 10);
	}

}
