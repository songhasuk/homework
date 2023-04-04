package Tire;

public class Ctire extends Tire {
	
	public int c_number;
	
	public Ctire() {
		
	}
	
	public Ctire(int number) {
		super(number);
		this.c_number = number;
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("C타이어"+c_number);
	}
}
