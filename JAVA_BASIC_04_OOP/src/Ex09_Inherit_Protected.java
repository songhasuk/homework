import ko.or.kosa.Bird;

class Bi extends Bird{

	@Override
	public void moveFast() {
		// TODO Auto-generated method stub
		super.moveFast();
	}
	
}

class Ostrich extends Bird{ //특수화, 구체화
	
	void run() {
		System.out.println("run...");
	}

	@Override
	protected void moveFast() {
		run();
	}
	
	
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast();

		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();
	}

}
