


import kr.or.kosa.Book2;
import kr.or.kosa.SalCar;

	public class Ex14_Constructor {
	
		public static void main(String[] args) {
			SalCar car = new SalCar();
			
			SalCar car2 = new SalCar(40);
			
			SalCar car3 = new SalCar("blue");
	
			SalCar car4 = new SalCar("yello", 45);
			
			
			Book2 ba = new Book2("순양", 20);
			ba.viwe();
			System.out.println(ba.v_name());
			System.out.println(ba.v_price());
			
		
			//원칙적인 방법은 객체 생성시 한번에 하나의 생성자만 호출한다.
			
	
		}
	
	}
