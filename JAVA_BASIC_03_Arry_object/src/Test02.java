import java.util.Arrays;
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
	
	
//		int[] array = new int[6];
//		int min = array[0];
//		
//		
//		
//		for(int i = 0 ; i < array.length; i++) {
//			 array[i] = (int) (Math.random() * 45)+1;
//			 for(int j = 0 ; j < i; j++) {
//				 if(array[i] == array[j]) {
//					  
//					 System.out.println(array[j]);
//					 array[j] = (int) (Math.random() * 45)+1;
//					 j--;
//				 }
//			 }
//			
//			System.out.print(array[i]+"," );
//		}
		
		
		
		
			
			
//		for(int i = 0 ; i < array.length ; i++) {
//			 
//			for(int j = 1 ; j < array.length; j++) {
//			 if(array[i] > array[j]) {
//				
//				array[i] = array[j];
//			 	}
//			}
//		}
//		
//		for(int value : array) {
//			System.out.println(value);
//		}
//		

		  Random random = new Random();
	        int[] arr = new int[6];
	        
	        // 중복 없는 6개의 난수 생성
	        int i = 0;
	        while(i < 6) {
	            int num = random.nextInt(45) + 1;
	            boolean isDuplicate = false;
	            for(int j = 0; j < i; j++) {
	                if(arr[j] == num) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if(!isDuplicate) {
	                arr[i++] = num;
	            }
	        }
	        
	        
	        System.out.println(Arrays.toString(arr));
		
	}

}
