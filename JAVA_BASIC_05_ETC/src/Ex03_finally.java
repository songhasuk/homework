import java.io.IOException;

/*
 		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
		
		}
 	
 	1.예외가 발생하던, 예외가 발생하지 않던  ==> [강제적으로 실행] 되어야 하는 구문을 가지고 있다.
 	2.이 [강제적 실행]은 return도 무시한다.
 	
 	예외가 발생 ... 정말 0/0 , index 범위
 	"홍길동" 입력되는 예외 ... 개발자가 필요에 의해서 어떤 상황을 예외적인 상황이라고 정의가능
 	[사용자 정의 에외 처리]
 	throw new IOException
 	
 	
 	throw로 예외를 의도적으로 발생시켜 ==> catch문이 실행하게 한다.
 	
 */

public class Ex03_finally {
	
	static void copyFiles() {
		System.out.println("copy files");
	}
	
	static void startInstall() {
		System.out.println("Install......");
	}
	static void fileDelete() {
		System.out.println("file Delete");
	}

	public static void main(String[] args) {
		 
//		 copyFiles();
//		 startInstall();
//		 fileDelete();
		 
		 
		 
		 try {
			 copyFiles();
			 startInstall();
			 throw new IOException("Install 도움에 문제 발생....");
		} catch (Exception e) {
			System.out.println("예외가 발생 : "+e.getMessage());
		} finally {
			//강제 실행 블록
			//정상, 비정상 상관없이 무조건 실행되는 블록
			//** 메소드가 가지는 return을 만나도 finally의 강제석으로 인해 먼저 실행된다.
			fileDelete();
		}
		 
	}

}
