//2개의 설계도 : Tv, Vcr

class Tv {
	boolean power;
	int ch;
	
	void Power() { 
		this.power = !this.power;  //false
		
		// 두개의 기능을 하나의 함수 처리
	}
	void chUp() {
		this.ch++; //증가
	}
	void chDown() {
		this.ch--; //감소
	}
}

class Vcr { // 비디오 플레이어
	boolean power;
	void Power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하긴");
	}
	void rew() {}
	void ff() {}
}
/*
	제품 : tv와 vcr 합쳐진 제품 ==> TvVcr 출시
	class TvVcr extends Tv , Vcr (x) : 다중 상속 금지
	x
	1. 계층적 상송 ( 할아버지, 아버지 계층 구조 ...자원(인스턴스멤버)이름 같아요 ...사용불가)
	
	1. class TvVcr 
	2. class TvVcr
	3. class TvVcr
	4. class TvVcr
	5. class TvVcr { Tv tv, Vcr vcr }
	6. class TvVcr extends { Vcr vcr; } 
	
	★부모 클래스는 [상속]하고, 자식 클래스는 [포함관계]로 만든다.
	
	
	
*/

class TvVcr{
	Tv tv;
	Vcr vcr;
	
	public TvVcr() { //초기화 (주소값 할당)
		this.tv = new Tv();
		this.vcr = new Vcr();
	}
	
	
}

class TvVcr2 extends Tv {
	Vcr vcr;
	
	TvVcr2(){
		this.vcr= vcr;
	}

}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr my = new TvVcr();
		my.tv.Power();
		my.vcr.Power();
		System.out.println(my.tv.power);
		System.out.println(my.vcr.power);
		
		//=================================
		
		TvVcr2 tv2 = new TvVcr2();
		tv2.Power();  // tv클래스의 power(); : 상속 : 자식클래스의 주소를 명시안해도 쓸수 있다.
		System.out.println("tv전원:" + tv2.power);
		tv2.vcr.Power(); //vcr클래스의 power(); : 포함관계라 명시를 반드시해줘야된다.
		System.out.println("tv전원:" + tv2.vcr.power);
	}

}
