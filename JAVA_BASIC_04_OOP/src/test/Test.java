package test;

class Car {
	int speed; 
	
	public Car() {
		this.speed= speed;
	}
	
	public Car (int speed){
		this.speed = speed;
	}
}

class SuperCar{
	
	Car[] car = new Car[3];
	int color;
	
	SuperCar() {
		
		//this.car[0] = new Car(10); 
		this(new Car[] { new Car(10), new Car(20), new Car(30) });
		
	}
	
	SuperCar(Car[] car){
		
		this.car = car; 
		//★명시적 생성자를 하나 생성해줘야지
		//★디폴트 생성자에 this()로 축약해서 사용이 가능해진다.
		
	}
//	SuperCar (int color){
//		this.color = color;
//	}
	
	public void print() {
		for(Car value : car) {
			System.out.println(value.speed);
		}
	}
}



public class Test {

	public static void main(String[] args) {
		
		//디폴트 생성자 호출 
		SuperCar sc = new SuperCar();
		//명시적 생성자 호출 ; SuperCar(Car[] car){ this.car=car} 
		SuperCar sc2 = new SuperCar(new Car[] {new Car(11), new Car(21), new Car(31)} );
		
		
		sc.print();
		System.out.println();
		sc2.print();
		
		
		
		
	}

}
