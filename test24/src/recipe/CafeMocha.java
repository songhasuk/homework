package recipe;

import machine.VendingMachine;

public class CafeMocha {
	
	private int bean = 50;
	private int milk = 100;
	private int suger = 10;
	private int ice = 50;
	
	private int price = 200;
	
	public int getPrice() {
		return price;
	}
	
	public void makeCafeMocha(VendingMachine machine) {
		
		machine.setBean(machine.getBean()-bean);
		machine.setMilk(machine.getMilk()-milk);
		machine.setSugar(machine.getSugar()-suger);
		
		// 아이스일경우
		if(machine.isHotOrIce() == false) {
			machine.setIce(machine.getIce() - ice);
			System.out.println("===================================");
			System.out.println(" \n ice CafeMocha 제조 완료 \n");
			System.out.println("===================================");
		}else { // 핫일 경우
			System.out.println("===================================");
			System.out.println(" \n hot CafeMocha 제조 완료 \n");
			System.out.println("===================================");
		}
		
	}

}
