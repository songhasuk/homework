import java.util.Iterator;

/*
    
  다차원 배열(2차원) 
  [행][열]
  영화관 좌석, pc방 좌석, 지도 좌표값()
  
  [★★개선된 for문 [다차원 배열]로 출력하기]
  
  for(타입형[] 변수명1 : 배열명) {
			for(타입형 변수명2 : 변수명1) {  //행은 열의 주소값을 참조해서 값을 가져오니까 변수명1이 들어간다. 
				System.out.println(변수명2);
		}
			
	}
  
 */
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		
		int[][] score = new int[3][2];
		//3행 2열 배열
		//첨자 0
		
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		for(int i =0 ; i < score.length ; i++) {
			for(int j=0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d][%d]\t",i,j,score[i][j]);
				System.out.println();
			}
		}
		
		int[][] scrore2 = new int[][] {{11,12}, {13,14}, {15,16}}; // 3행 2열 배열
		
		for(int[] value : scrore2) {
			for(int num : value) {
				System.out.println(num);
			}
			
		}
		
		
	}

}
