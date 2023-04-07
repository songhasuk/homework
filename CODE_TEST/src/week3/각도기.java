package week3;
class gran{
	public int solution(int angle) {
        
		int answer = 0;
		
		if(angle == 180 ) {
			answer = 4;
		}else if(90 < angle && angle < 180) {
			answer = 3;
		}else if(angle == 90) {
			answer = 2;
		}else if(angle > 0 && angle < 90) {
			answer = 1;
		}
	
		
        
        return answer;
    }
}


public class 각도기 {

	public static void main(String[] args) {
		gran gran = new gran();
		
		System.out.println(gran.solution(70));
	}

}
