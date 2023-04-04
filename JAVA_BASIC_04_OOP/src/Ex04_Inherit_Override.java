/*
 
 [상속관계에서의 override] : 상속관계에서 자식이 부모의 함수의 내용을 재정의
 
 1.상속관계에서 자식클래스가 부모클래스의 메서드를 재정의(내용을 바꿈)
 2.★재정의를 했을 시에 [강제성]에 의해서 재정의된 메소드가 우선적으로 실행됨 
 
 [재정의] = 틀의 변화가 없고 (함수의 이름, 타입)[변화x] (내용만 : 중괄호 안에 실행코드)[변화○]  
 
 [문법]
 1. 부모함수 [이름] 동일
 2. 부모함수 [매개변수] 동일
 3. 부모함수 [리턴값 타입] 동일 
 4. 결국 { 실행블록의 [논리 조작]하는 코드만 변경 }
 
 [super]
 =자식 클래스에서 ==> 부모 클래스의 멤버를 사용하는 방법
 
 
 
 
 오버로딩 = 하나의 이름으로 여러가지의 기능을 쓰는것
 오버라이딩 = 상속관계에서의 메소드 재정의
 */

class Point2 {
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x +  " / " + this.y;
	}

}

class Point3D extends Point2{
	int z = 6;
	
	@Override
	String getPosition() {
		return this.x +  " / " + this.y + "/" + this.z;
	}
	//z가 포함된 함수를 만들기 ==> override해서
	//새로운 함수를 생성한 것이 아니라 ... 부모 함수 그대로 ... 의미(내용)를 ... 재정의
	//내가 함수가 정말 재정의 한 것인지 아닌지 검증하고 싶을 땐 : @override [어노테이션] 사용
	
}

public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		
		String result = p.getPosition();
		System.out.println(result); //자식클래스에서 제정의한 메소드가 호출
		
		
		
		
	

	}

}
