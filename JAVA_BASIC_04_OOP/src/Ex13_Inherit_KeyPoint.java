class produc{
	int price;
	int bonuspoint;
	
	public produc(int price) {
		this.price = price;
		this.bonuspoint = (price/10);
	}
}
class Lgtv extends produc{
	
	Lgtv(int price){
		super(price);
	}
	public String toString() {
		return "lgtv";
	}
}

class Phone extends produc{
	Phone(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "Phone";
	}
}
class Book extends produc{
	Book(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Buyer2 {
	int momey;
	produc[] cart ;
	int index;
	Buyer2(){
		this(50000, 0);  // 첫 초기화
	}
	
	Buyer2(int momey, int index){
		this.momey = momey;
		this.index = index;
		cart = new produc[10];
		
	}
	
	void buy(produc n) {
		cart[index++] = n;
	}

	void summary() {
		int totelmomey = 0;
		int totelbonuspoint =  0;
		String totelstr = "";
		
		for(int i = 0; i <index ; i++) {
			totelmomey += cart[i].price;
			totelbonuspoint += cart[i].bonuspoint;
			totelstr += cart[i].toString() + " ";
		}
		System.out.println(totelmomey);
		System.out.println(totelbonuspoint);
		System.out.println(totelstr);
	}
	
}

public class Ex13_Inherit_KeyPoint {

	public static void main(String[] args) {
		produc produc = new produc(0);
		Lgtv lgtv = new Lgtv(200);
		Phone phone = new Phone(300);
		Book book = new Book(100);
		
		Buyer2 buyer2 = new Buyer2();
		buyer2.buy(phone);
		buyer2.buy(lgtv);
		buyer2.buy(book);
		buyer2.summary();
	}
}
