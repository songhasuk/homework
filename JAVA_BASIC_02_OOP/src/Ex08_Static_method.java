/*
  static 멤버필드 : 객체간 공유자원
  static 메소드 : 
  
  [★static 멤버의 사용의도]
  1. 객체 생성 없이 사용할려고
  2. 사용빈도가 높은 멤버를 → 빠르고 편하게 사용할려고 → new 없이 사용하게
  
  설계도 관점 : 자원을 빈번히 사용 → 그러니 편하게 쓰게 해주자  → new 없이  → static 설계
  
  
  
 */



class StaticClass{
	int iv; 
	
	static int cv;
	
	static void porintCv () {
		//★static 함수는 일반(인스턴스 멤버:int iv) 자원을 사용할 수가 없다.
		//★생성 시점의 문제 이슈로(static 자원이 일반 자원보다 우선되서)
		
	}
	
	void printIv() {
		
		//일반함수는 static변수를 사용가능하다.
		//static 자원은 객체 생성 이전에 클래스메모리에 로드되서
		
		cv = 100;
		
	}
	
}

// 공존의 관계는 : 생성시점에 대해 해결 제시해야됨

public class Ex08_Static_method {

	public static void main(String[] args) {
		StaticClass.porintCv(); // 이게 편하게 쓰게 해준다는거 : new 객체 생성 없이 
			
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv);
		
		
	}

}
