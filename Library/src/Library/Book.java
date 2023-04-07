package Library;

public class Book {
	private String bookNo;	//도서번호
	private String bookName; //도서제목
	private int price;		//도서가격
	
	
	public Book(String bookNo, String bookName, int price) {
		
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.price = price;
	}
	
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
	

}
