import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;

public class Ex04_Modifier {

	public static void main(String[] args) {
//		NoteBook noteBook = new NoteBook();
//		noteBook.color = "blue";
//		noteBook.year = -2023; // public접근자로 직접할당
//		
//		System.out.println("년도 : "+noteBook.year);
		
		
		NoteBook noteBook = new NoteBook();
		noteBook.setColor("blue");
		noteBook.setYear(-100); //
		noteBook.noteBookInfo();
		System.out.println(noteBook.getColor());
		System.out.println(noteBook.getYear());
		
		//==================================================
		
		NoteBook mynote = new NoteBook();
		Mouse mouse = new Mouse();
	
		//마우스를 필요해 연걸 해 줄게
		mynote.handLeMouse(mouse); //마우스의 참조주소값을 전달
	}

}
