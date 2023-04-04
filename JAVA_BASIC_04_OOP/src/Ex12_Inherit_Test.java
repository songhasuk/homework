//
//class Product{
//	int price;
//	int bonusPoint;
//	
//	//final ;
//	
//	Product(int price){
//		this.price = price;
//		this.bonusPoint = (int)(this.price/10.0);
//	}
//}
//
//class KtTv extends Product{
//	public KtTv() {
//		super(5000);
//	}
//	@Override
//	public String toString() {
//		return "KtTv";
//	}
//}
//class Audio extends Product{
//	public Audio() {
//		super(6000);
//	}
//	@Override
//	public String toString() {
//		return "Audio";
//	}
//}
//
//class NoteBook extends Product{
//	public NoteBook() {
//		super(7000);
//	}
//	@Override
//	public String toString() {
//		return "NoteBook";
//	}
//}
////구매자
//class Buyer{
//	int Momey;
//	int bonusPoint;
//	
//	
//	
//	
//	
//	
//	Buyer(){
//		this.Momey = 50000;
//		
//	}
//	
//	//[구매기능]
//	//제품을 구매 할 수 있는 기능 (제품 3개 구매기능)
//	//내 잔액에서 - price  , 포인트 갱신 +
//	void kttvBuy(KtTv n) {
//		//함수의 매개변수로 제품객체를 받아서(가격, 포인트)
//		if(this.Momey < n.price) {
//			System.out.println("고객님 잔액이 부족합니다"+this.Momey);
//			return; // 메소드만 강제종료
//		}
//		
//		//실 구매행위
//		this.Momey-=n.price;
//		this.bonusPoint+=n.bonusPoint;
//		System.out.println("현재 잔액:"+this.Momey);
//		System.out.println("구매한 물품은 :"+n.toString());
//		
//	}
//	void audio(Audio n) {
//		//함수의 매개변수로 제품객체를 받아서(가격, 포인트)
//		if(this.Momey < n.price) {
//			System.out.println("고객님 잔액이 부족합니다"+this.Momey);
//			return; // 메소드만 강제종료
//		}
//		
//		//실 구매행위
//		this.Momey-=n.price;
//		this.bonusPoint+=n.bonusPoint;
//		System.out.println("현재 잔액:"+this.Momey);
//		System.out.println("구매한 물품은 :"+n.toString());
//		
//	}
//	void NoteBookBuy(NoteBook n) {
//		//함수의 매개변수로 제품객체를 받아서(가격, 포인트)
//		if(this.Momey < n.price) {
//			System.out.println("고객님 잔액이 부족합니다"+this.Momey);
//			return; // 메소드만 강제종료
//		}
//		
//		//실 구매행위
//		this.Momey-=n.price;
//		this.bonusPoint+=n.bonusPoint;
//		System.out.println("현재 잔액:"+this.Momey);
//		System.out.println("구매한 물품은 :"+n.toString());
//		
//	}
//	
//	
//	
//}
//
///*
// 
// 1차 오픈 ... 팀장 >> 하와이 휴가
// 
// 매장에 제품 더 구매 1000개 제품 추가(마우스, 토스트키, 청소기 ...) 
// pos기로 자동 등록됨
// 업체 전단지 주말 오픈세일...
// 
// 1. 오픈날 ==> 3개만 구매 기능을 만들어서 ==> 997제품은 구매가 안된다.
// 팀장 >> 하와이 >> pc방 >> 국내 전산망 >> 개발 서버 접속 >> 이틀 밤새워 >> 구매함수 997개 추가
// 
// */
//
//public class Ex12_Inherit_Test {
//
//	public static void main(String[] args) {
//		
//		//가오픈 생각하고 
//
//		KtTv ktTv = new KtTv();
//		Audio audio = new Audio();
//		NoteBook noteBook = new NoteBook();
//		
//		Buyer buyer = new Buyer();
//		
//		buyer.kttvBuy(ktTv);
//		buyer.kttvBuy(ktTv);
//		buyer.kttvBuy(ktTv);
//		buyer.kttvBuy(ktTv);
//		buyer.audio(audio);
//		buyer.NoteBookBuy(noteBook);
//		
//		
//		
//		
//	}
//
//}
