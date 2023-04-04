
public class Ex09_Static_Method {
	
	void method() {
		System.out.println("나 일반 메소드야");
	}
	
	static void smethod() {
		System.out.println("나 static 메소드야");
	}
	
	public static void main(String[] args) {
		
		
		Ex09_Static_Method me = new Ex09_Static_Method();
		me.method();
		
		Ex09_Static_Method.smethod();
		smethod(); 
	
	}
	

}
