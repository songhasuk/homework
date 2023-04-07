package Library;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	
	
	Map<String, Book> blist = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	//도서 추가
	public void bookInsert() {
		
		
		
		System.out.println("추가할 도서 ISBN:");
		String bookno = sc.nextLine();
		System.out.println("도서이름:");
		String bookname = sc.nextLine();
		System.out.println("가격:");
		int price = Integer.parseInt(sc.nextLine());
		
		if(!blist.containsKey("ISBN:"+bookno)) {
			blist.put("ISBN:"+bookno, new Book("ISBN:"+bookno, bookname, price));
			
		}else {
			System.out.println("이미 있는 책 입니다.");
		}
		
	}
	//도서 삭제
	public void bookDelete() {
		System.out.println("삭제 할 도서 ISBN:");
		String isbn = sc.nextLine();
		if(blist.containsKey("ISBN:"+isbn)) {
			blist.remove("ISBN:"+isbn);
			System.out.println("삭제 완료!");
		}else {
			System.out.println("등록되지 않는 책입니다.");
		}
	
		
		
	}
	//도서 검색(
	public void bookSearch() {
		System.out.println("도서 검색 ISBN:");
		String isbn = sc.nextLine();
		
		Set set = blist.entrySet();
		Iterator<Book> ib = set.iterator();
		
//		while(ib.hasNext()) {
//			if(blist.containsKey("ISBN:"+isbn))
//			Book bool2=  ib.next();
//			System.out.println(ib.next());
//		}
		if(blist.containsKey("ISBN:"+isbn)) {
			Book book =  blist.get("ISBN:"+isbn);
			System.out.println("이름:"+book.getBookName());
		}else {
			System.out.println("등록되지 않는 책입니다.");
		}
		
	}
	//도서 목록
	public void bookList() { //★
		System.out.println("도서 수:"+blist.size());
		Set set = blist.entrySet();
		Iterator<Map.Entry<String, Book>>  ib = set.iterator();
		
		
		while(ib.hasNext()) {
			Book book = ib.next().getValue();  //Map의 데이터쪽 값을 저장
			System.out.println("ISBN:"+book.getBookNo()+"이름"+book.getBookName());
		}
		
	}
	
	//ISBN 목록
	public void bookIbmList() {
		System.out.println("ISBN 목록"+blist.size());
		Set set = blist.keySet();
		Iterator<Book> ib = set.iterator();
		
		
		while(ib.hasNext()) {
			System.out.println(ib.next());
		}
	}
	

	
	//실행
	public void Run() {
		blist.put("ISBN:1234", new Book("ISBN:1234", "조선시대", 30000));
		
		while(true) {
			System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");
			int chiose = Integer.parseInt(sc.nextLine()); 
			switch (chiose) {
			case 1: {
				bookInsert();
				break;
			}case 2: {
				bookDelete();
				break;
			}
			case 3: {
				bookSearch();
				break;
			}
			case 4: {
				bookList();
				break;
			}
			case 5: {
				bookIbmList();
				break;
			}case 0: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
	

}
