import kr.or.kosa.dto.Emp;

public class Ex05_Object_Array_Quzi {
	
	public static void main(String[] args) {
		
		Emp[] e = new Emp[3];
		
		
			e[0] = new Emp(1000, "홍길동");
			e[1] = new Emp(2000, "김유신");
			e[2] = new Emp(3000, "유관순");
			
		for(Emp value : e) {
			value.empInfoPrint();
		}
		
		Emp[] e2 = new Emp[] {new Emp(400, "송"), new Emp(500, "하"), new Emp(600, "석")};
		
		for(Emp value : e2) {
			value.empInfoPrint();
		}
		
		
	}

}
