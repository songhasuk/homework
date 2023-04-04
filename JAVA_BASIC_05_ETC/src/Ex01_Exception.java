
/*
 [오류]
 1. 에러(error) : 네트워크 장애, 메모리, 하드웨어 ==> 개발자가 코드적으로 해결 불가
 2. 예외(exception) : 개발자가 코드적 실수로 발생 ==> 문제 발생 코드 찾아서 ==> 수정 ==> 배포

 2.1 컴파일시 : 실행파일 생성 안되요(무조건 해결)
 2.2 런타임시 ; 실행도중에 문제가 발생 ==> 강제 종료 ==> 문제가 생기는 시점 .==> 나머지 코드 실행 안됨
 
 [예외처리] : 프로그램이 안정적으로 종료되게 하는것 ==> 원인 분석 후 ==> 코드 수정 ==> 다시 배포
 
 try{
 	//문제가 의심되는 코드를 작성
 	//문제가 발행 되면 ==> [예외가 발생한 정보를 담을 수 있는] ==> 객체 자동생성
 	//[0][1][2] ==> Car[3] ==> ArrayInddex...Exception(생성) 발생 ==> 예외담기 ==>
 }catch(Exception e){
    // Exception ==> 모든 예외의 부모타입이 된다.
    // 문제파악 ==> 처리(이 블록에서는 ==> 코드는 수정되지 않는다) ==> 보고
    // 1.관리자 email
    // 2. 로그기록(장애 발생 기록)
    // 3. 강제 종료는 막는다
 }finally{
 	//문제가 발생되던, 발생하지 않던  ==> 무조건 강제적으로 실행하는 코드
 	//메소드에서 return 만나면 메소드 종료되지만 ... return을 만나도 finally 강제 실행 [강제성이 높음]
 	//DB작업 ... DB자원 종료(해제)
 }
   
 
 */
public class Ex01_Exception {

	public static void main(String[] args) {
	
//		System.out.println("main start");
//		System.out.println(0/0);
//		//문제가 발행하는 구간 코드가 있으면 ==> 그 구간 코드 뒤에 있는 코드는 실행안된다.
//		System.out.println("main end");
		
		
		//////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("main start");
		
		try {
			System.out.println(0/0);
		}catch(Exception e) { //부모타입 변수는 자식타이븨 주소값을 받을 수 있다(다형성)
			//문제를 파악하고 ... 전달
			System.out.println("문제 발생"+e.getMessage());
			e.printStackTrace();
			//오류 원인과, 오류가 나는 코드 라인 구간도 알려준다.
		}
		
		System.out.println("main end");
		
	}

}
