package Tire;

public class Dtird extends Tire {
	
	public int t_number;
	
	public Dtird() {
		
	}
	
	public Dtird(int number) {
		super(number);
		this.t_number = number;
		
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("D타이어"+t_number);
	}

}
