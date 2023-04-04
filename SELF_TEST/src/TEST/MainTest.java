package TEST;



import java.util.Scanner;

import Tire.Ctire;
import Tire.Dtird;
import Tire.record2;
import print.BooleanTest;
import print.Car;

public class MainTest {

	public static void main(String[] args) {
		Box1 box1 = new Box1(10, 20, 50);
		
		Box1 lar = new Box1(10, 30, 30);
		Box1 box2 = box1.whosLargest(box1, lar);
		System.out.println(box1.volume);
		System.out.println(lar.volume);
		

		System.out.println(box1 == box2);
		
		System.out.println(box1.equals(lar));
		
		Scanner sc = new Scanner(System.in);
	
		//box1.setAdd(sc.nextInt());
		
		
		int value[] = {2,4,20,40};
		System.out.println(box1.array(2,3,20,30));
		System.out.println(box1.array(value));

		 Car c = new Car(10,20,30,1000);
		 
		c.pirnt(10, 20);
	
		 
		BooleanTest bt = new BooleanTest();
		
		
		
		System.out.println(c.toString());
		
		BooleanTest bt2 = new BooleanTest();
		
		c.sum();
		
		Car c2 = (Car) bt2;
	
		
				
		//===========================================
		
		record2 record2 = new record2();
		Ctire ctire = new  Ctire(100);
		Dtird dtire = new Dtird(200);
	
		

		
		record2.tier = new Ctire(100);
		record2.input();
		record2.tier = new Dtird(200);
		record2.input();
		
		record2.input2();
		record2.input2();
		
	}

}
