package recipe;

import machine.VendingMachine;

public class Americano {
	
	private int bean = 50;
	private int water = 100;
	private int ice = 50;
	
	private int price = 100;
	
	public int getPrice() {
		return price;
	}

	public void makeAmericano(VendingMachine machine) {
		
		// System.out.println("제조 전 - 커피콩 : " + machine.getBean() + " 물 : " + machine.getWater());
		machine.setBean(machine.getBean()-bean);
		machine.setWater(machine.getWater()-water);
		// System.out.println("제조 후 - 커피콩 : " + machine.getBean() + " 물 : " + machine.getWater());

		// 아이스일경우
		if(machine.isHotOrIce() == false) {
			machine.setIce(machine.getIce() - ice);
			System.out.println("===================================");
			System.out.println(" \n ice americano 제조 완료 \n");
			System.out.println("===================================");
		}else { // 핫일 경우
			System.out.println("===================================");
			System.out.println(" \n hot americano 제조 완료 \n");
			System.out.println("===================================");
		}
		

		
	}
	
	//public int getBean() {}
	
	//public int getWater() {}
	
	//public int getPrice(){}

}
