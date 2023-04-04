package kr.or.kosa;

public class Tv {
	
	public int channel = 100;
	public String brand = "순향";

	public void plus() {
		channel+=1;
	}
	public void minus() {
		channel-=1;
	}
	

	public void viwe() {
		System.out.println("[채널]:"+channel+"[브랜드]:"+brand);
	}

}
