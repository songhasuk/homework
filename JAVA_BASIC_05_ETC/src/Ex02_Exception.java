
public class Ex02_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		int num = 100;
		int result = 0;
		
		
		//개바자가 코드 오류를 의심되면 ... 문제가
		
		try {
			for(int i =0; i<100 ; i++) {
				result = num / (int) (Math.random() *10);  //0~9까지의 난수 발생기
				System.out.println("result :" + result + "1 : "+i);
			}
		}catch(ArithmeticException e) { // Exception e라고 적어놓으면 ==> 다른 사람이 [유지보수(가독성)]하기 힘들다.
			System.out.println("문제 발생 했다, 관리자에게 알려주삼");
			System.out.println("뭔 상황?: "+e.getMessage());
		}
		
		System.out.println("main end");
		
	}

}
