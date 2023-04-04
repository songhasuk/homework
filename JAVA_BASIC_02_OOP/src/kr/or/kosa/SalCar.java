package kr.or.kosa;

public class SalCar {
	
	String color; 
	int door; 
	
	
	public SalCar() {
		color = "red";
		door = 4;
		System.out.println("기본사양\t"+color+"\t"+door);
	}
	public SalCar(int num) {
		color = "red";
		door = num;
		System.out.println("[옵션]: [문 변경]:"+door+"[자동차의 색상 기본]:"+color);
	}
	public SalCar(String cor) {
		color = cor;
		door = 4;
		System.out.println("[옵션]: [자동차의 색상 변경]:"+color+"[문 기본]:"+door);
	}
	public SalCar(String cor, int num) {
		color = cor;
		door = num;
		System.out.println("[옵션]: [자동차의 색상 변경]:"+color+"[문 변경]:"+door);
	}

}
