package kr.or.kosa;

public class Book2 {
	String name ;
	int price;
	
	public Book2(String s_name, int s_price) {
		name = s_name;
		price =s_price;
	}
	
	public void viwe() {
		System.out.println("[이름]:"+name+"[가격]:"+price);
	}
	public String v_name() {
		return name;
	}
	public int v_price() {
		return price;
	}

}
