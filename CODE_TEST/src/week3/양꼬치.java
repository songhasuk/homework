package week3;

class Solution {
	 public int solution(int n, int k) {
         int answer = 0;
   int yang = n * 12000;
   int drink = k * 2000;
   //n = 양꼬치 12000, k = 음료수 2000
   int total = (yang + drink)  ;
   int result = (n / 10)*2000 ;
   
   
  
   
   return total-result;
	 }
}
public class 양꼬치 {

	public static void main(String[] args) {

		Solution solution = new Solution();
		solution.solution(10, 3);
	}

}
