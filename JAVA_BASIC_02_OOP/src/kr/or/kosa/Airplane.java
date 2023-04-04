package kr.or.kosa;

//public class Airplane {
//	
//	private String name;
//	private int member;
//	private static int Total;
//	
//	public void print() {
//		System.out.println("이름:"+name+"\t번호:"+member);
//	}
//	public void totalPrint() {
//		System.out.println("누적대수:"+Total);
//	}
//
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		Total++;
//		this.name = name;
//	}
//
//	public int getMember() {
//		return member;
//	}
//
//	public void setMember(int member) {
//		this.member = member;
//	}
//
//	
//	
//
//}

public class Airplane {
	
	private String name;
	private int member;
	private static int Total;
	
	public void print() {
		System.out.println("이름:"+name+"\t번호:"+member);
	}
	public void totalPrint() {
		System.out.println("누적대수:"+Total);
	}

	public Airplane(String a_name, int a_momber) {
		this.name =a_name;
		this.member = a_momber;
		Total++;
	}

	
	

}
