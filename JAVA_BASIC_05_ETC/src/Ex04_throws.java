import java.io.IOException;

import kr.ko.kosa.utils.ExClass;

public class Ex04_throws {

	public static void main(String[] args){
		
		
//		try {
//			ExClass ex = new ExClass("temp");
//		} catch (Exception e | NullPointerException) {
//			e.printStackTrace();
//		}finally {
//			
//		}
		
		try {
			ExClass ex = new ExClass("temp");
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			
		}

	}

}
