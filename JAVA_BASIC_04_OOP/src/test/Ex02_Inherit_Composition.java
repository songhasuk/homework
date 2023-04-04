package test;
/*

현업 개발 ==> 한개의 클래스로 모두 설계 경우 (x) ==> 한개의 설계도로 모든 업무 구현은 불가능
각각의 업무별로 ==> 설계도를 여러개로 나눈다 ==> 

쇼핑몰 : 결재관리, 배송관리, 재고관리, 회원관리, 판매처 관리, 카드 관리 ...

[분리 기준]
여러개의 설계도가 있을 때 관게 ... 만들어주는 기준

1.[상속] : is -a  : ~은(는) ~이다.			==> 상속의 관계(부모를 뒤에)
2.[포함] : has ~a : ~은(는) ~가지고 있다.   ==> 포함의 괌계(클래스가 객체를 가지고 있는지)(부품데이터)

원은 도형이다(O) : is ~a
결찰은 권총이다.(X)
경찰은 권총을 가지고 있다(O) : has -~

원은 도형이다 : 원 extends 도형
삼각형은 도형이다 : 삼각형 extends 도형

[원, 점 관계]
원은 점이다(x)
원은 점을 가지고 있다(O)

[has ~a]
1.부품데이터를 클래스가 가지고 있는지
2. class 원 { 점이라는 부품이 member field 구현 }
3. class 점 { x, y } 

[경찰 권총]
결찰은 권총이다.(X)
경찰은 권총을 가지고 있다(O) 

class 권총 {}
class 경찰 { 권총 member field }   : 객체타입형 메소드 선언 : 내가 원할때 가져와서 쓸수 있게만드는

[분모] == 도형 == [공통적인 자원을 가졌냐] == [추상화] , [일반화] ==> 그리다, 색상,
[분자] == 원, 삼각형, 사각형 == [구체화] , [특수화] == 자신만이 가지는 특징 ==> 반지름, 한점 
원은 도형이다.
삼각형은 도형이다.
사각형은 도형이다.

[점] = 좌표값 (x, y)
원은 점을 가지고 있다.
삼각형은 점을 가지고 있다.
사각형은 점을 가지고 있다.

======================================================

class Shape{ 그리다 , 생상 } ==> 상속관계에서 부모 역활 ==> 원, 삼각형, 사각형의 부모가 된다.
class Point{ 좌표값 }  ==> [포함관계] ==> [부품데이터]로 간주함

[구체화, 특수화] = Circle(원), Triangle(삼각형)


*/

class Shape { //도형
	String color ="gold";
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point { //점 
	int x;
	int y;
	
	public Point() { //default 생성자
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	public Point(int x, int y){ //명시적 생성자
		this.x = x;
		this.y = y;
	}
}
	
//원의 정의 : 원은 한점과 반지름을 가지고 있다
//1.원은 도형이다(is ~a) : Shape
//2.원은 점을 가지고 있다.(has ~a) : Point
//3.원은 특수화되고 구체화된 내용은 : 반지름

//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10, 15)를 가진다.
//초기값을 설정하지 않으면 ==> 반지름과 점의 값을 입력받을 수 있다.

class Circle extends Shape { //상속

	
	Point point; //포함 == 부품
	public int radius=10; //구체화
	
	public Circle () {
		//this.point = new Point(10,15);  // ★★★ 참조주소
		//this.radius = 10;
		
		this(10, new Point(10,15));
	}
	Circle(int radius, Point point){
		this.radius = radius;
		this.point = point;  //참조주소
	}

	
}
class Triangle extends Shape{
	
//	Point point;
//	Point point2;
//	Point point3;

	Point[] points = new Point[3];
	
	public Triangle() {
//		this.point = new Point(10,20);
//		this.point2 = new Point(20,30);
//		this.point3 = new Point(30,40);
		this(new Point[] { new Point(10,20), new Point(10,20), new Point(10,20) });
	}

//	public Triangle(Point point, Point point2, Point point3) {
//		this.points[0]=point;
//		this.points[1]=point2;
//		this.points[2]=point3;
	public Triangle(Point[] points) {
			this.points = points;	
	}
	void trianglePoint() {
		for(Point point : this.points) {
			System.out.printf("x :(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}

}


public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		System.out.println(circle.radius);
		System.out.println(circle.color);
		System.out.println(circle.point.x); //주소값.주소값.필드명
		System.out.println(circle.point.y);
		circle.draw();
		
		//반지름, 점의 값을 자유롭게 입력하고 싶다.
		// Circle(int radius, Point point){}  ==> 이 생성자가 사용되는 코드
		Point point = new Point(10, 20);
		Circle circle2 = new Circle(100, point);
		
		Circle circle3 = new Circle(100, new Point(30, 40)); //이게 더 자주 쓰임
		
		
		////////////////////////////////////////
		
		Point point2 = new Point(10, 20);
		Point point3 = new Point(10, 20);
		
		Point[] pos = new Point[3];
		for(int i = 0 ; i < 3 ; i++) {
			pos[i] = new Point();
			pos[i].x = 1;
			pos[i].y = 1;
		}
		
		
//		Triangle triangle = new Triangle();
//		
//		Triangle triangle2 = new Triangle(new Point(100,200), new Point(100,200), new Point(100,200));
//		
//		Triangle triangle3 = new Triangle(point, point2, point3);
		
		//Triangle triangle4 = new Triangle(pos[0],pos[1],pos[2]);
//		triangle.draw();
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
		System.out.println();
		
		Triangle tri2 = new Triangle(new Point[] { new Point(1,2), new Point(3,4),new Point(5,6)});
		tri2.trianglePoint();
		System.out.println();
		
		//Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};
		Triangle tri3 = new Triangle(new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)});
		tri3.trianglePoint();
		// new Point[] :: Point[] parray = new Point[] 와 같은 의미
		//
		
		//[포함관계 : 객체타입 배열] 타클래스에서 필드로 선언하고 ==> 생성자 생성하고 ==> 생성자 호출하고 값 인력하는 방법
		//포함클래스명[] 참조변수명 = new 포함클래스명[정수값];
		
		//○디폴트 초기화 생성자○
		//생성자명(포함클래스명[] 참조변수명){
		// this.참조변수명 = 참조변수명(인수에서)

		//○main메소드에서 생성자에서 인수값 넘겨줘서 초기화○
		//자식클래스명 참조변수명 = new 클래스명(new 포함클래스명[] {new 포함클래스명(초기화값들...) ... })
		//										↑ new 포함클래스명[]	 new Point[] :: Point[] parray = new Point[] 와 같은 의미
		//↑ 객체 배열크기만큼 new 포함클래스명 해서 생성해줘야된다.
		
		
		//○[호출 : 객체타입 배열]○
		//public void print() {
		//	for(Car value : car) {
		//		System.out.println(value.speed);
		//	}
		//}
		// for(타입형 참조변수명 : 객체타입배열의 참조변수명){
		//			System.out.println(참조변수명.멤버명);
		//}
	}


}
