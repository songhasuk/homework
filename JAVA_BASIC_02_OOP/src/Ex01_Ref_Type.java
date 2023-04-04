import kr.or.kosa.Person;

class Test{
	int i;
	int j;
	void print() {
		System.out.println(i);
	}
	
}

public class Ex01_Ref_Type {

	public static void main(String[] args) {
	
		Person person = new Person();
		person.personPrint();
		
		Person person1 = new Person();
		
		person1.name = "김유신";
		person1.age = 100;
		person1.power = true;
		
		person1.personPrint();
		
		
		Person person2 = person1;
		if(person2 == person1) {
			System.out.println("서로 같은 주소를 가졌다");
		}
	}

}
