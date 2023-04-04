package print;

public class Car extends BooleanTest {
	
	public int model;
	public final int NUMBER;

	
	public Car(){
		super();
		this.NUMBER=10;
		this.model = 1234;
	}
	
	 public Car(int x, int y, int model, int NUMBER){
		//super(x, y);
		//super(10,20);
		this.model=model;
		this.NUMBER = NUMBER;
		super.x = x;
		super.y = y;
	}
	
	
	public void sum() {
		System.out.println(super.x + super.y + this.model);
		super.pirnt(x, y);
		this.pirnt(model, NUMBER);
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", x=" + x + ", y=" + y + "]";
	}
	@Override
	public void pirnt(int x, int y) {
		System.out.println(x+y);
	}
	@Override
	public void viwe() {
		System.out.println("Car");
	}
	


	
	
}
