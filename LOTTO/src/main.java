import kr.or.kosa.dto.Lotto;

public class main {

	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.run();
		
		
		//[개선점]
		//기존에 몇개 구매한 로또의 번호가 저장이 안되고 
		//1 2 1 했을 때 ==> 기존 로또 번호는 삭제된다.
		
	}

}