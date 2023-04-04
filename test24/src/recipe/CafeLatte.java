package recipe;

import machine.VendingMachine;

public class CafeLatte {
	
	private int bean = 50;
	private int milk = 100;
	private int ice = 50;
	
	private int price = 200;
	
	public int getPrice() {
		return price;
	}

	public void makeCafeLatte(VendingMachine machine) {
		
		machine.setBean(machine.getBean()- bean);
		machine.setMilk(machine.getMilk()- milk);
		
		// 아이스일경우
		if(machine.isHotOrIce() == false) {
			machine.setIce(machine.getIce() - ice);
			System.out.println("===================================");
			System.out.println(" \n ice CafeLatte 제조 완료 \n");
			System.out.println("===================================");
		}else { // 핫일 경우
			System.out.println("===================================");
			System.out.println(" \n hot CafeLatte 제조 완료 \n");
			System.out.println("===================================");
		}
		
	}
	
	
}
