import ko.or.kosa.Singleton;

public class Ex15_Singleton_main {

	public static void main(String[] args) {
		//Singleton s = new 
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		
		System.out.println((s == s2));
		System.out.println((s2 == s3));
	}

}
