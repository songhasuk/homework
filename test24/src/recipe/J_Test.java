package recipe;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

class Car{
	int speed;
	String model;
	
	public Car(int speed, String model) {
		this.speed = speed;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", model=" + model + "]";
	}
}
class SuperCar  {
	int color;
	
	
	public Car add(Car sc) {
		
		Car c = sc;
		c.model = "df";
		c.speed =10;
		
		return c;
	}

	
	
}

public class J_Test {

	public static void main(String[] args) {
		List<Car> clist = new ArrayList<>();
		
		clist.add(new Car(100, "ccc"));
		clist.add(new Car(200, "ccc"));
		clist.add(new Car(300, "ccc"));
		clist.add(new Car(400, "ccc"));
		clist.add(new Car(500, "ccc"));
		

		for(int i = 0 ; i < clist.size() ; i++) {
			System.out.p	rintln(clist.get(i).toString());
		}
		
		for(Car car : clist) {
			System.out.println(car.toString());
		}
		
		
		SuperCar sc = new SuperCar();
		Car c = new Car(200, "dfdfdfdf");
		Car c2 = sc.add(c);
		
		System.out.println(c.speed); 
		
	}

}
