import java.util.Set;

public class Ex09_Array_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		
		for(int i = 0 ; i <seat.length ; i++) {
			for(int j =0 ; j < seat[i].length ; j++) {
				seat[i][j] = "__" ; //빈의자 표현
			}
		}
	
		
		seat[2][1] = "홍길동";
		seat[0][0] = "김유신";
		
		for(int i = 0 ; i <seat.length ; i++) {
			for(int j =0 ; j < seat[i].length ; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "좌석":"예매됨");
			}
			System.out.println();
		}
		
		//예매 ... 어떤 좌석 선택 [행][열] 예매 가능 여부 확인하기
		//좌석 정보를 입력해 주세요
		
		int row, col;
		row = 1;

	}

}
