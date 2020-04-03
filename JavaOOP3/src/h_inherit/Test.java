package h_inherit;

/*
 *  overloading : 동일한 함수명으로 인자의 자료형과 객수 다른 함수들
 * 
 *	overriding : 상속관계에서 인자와 반환값까지 동일한 함수들
 */

public class Test {

	public static void main(String[] args) {

		//1. 각각의 클래스 생성
//		Umma u = new Umma(); // 무조건 new생성
//		u.gene();
//		u.job();
		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		
//		//*
//		d.job(); // Ddal 클래스에는 없지만 Umma 클래스가 상위로 메모리에 속해져 있어 생성되어 무조건 실행된다.
	
		// 2. 부모 변수에 자식 객체 생성 
//		Umma dal = new Ddal(); //
//		//dal.study(); // 변수가 부모이기때문에 dal있는 변수 사용 안됨
//		dal.job();
//		//*
//		dal.gene();// 메소드명이 같은면 변수를 찾아 Umma, Ddal을 출력한다.
		
		//3. 객체임을 확인
//		Ddal d = new Ddal();
//		if(d instanceof Ddal) {
//			System.out.println("딸 객체");
//		}
//		if(d instanceof Umma) { // 이미 Ddal 객체 를 생성했어도 상속 관계임으로 Umma객체 생성됨
//			System.out.println("부모 객체");
//		}
		
		//4. 형변환
		// (cating) : 기본형/상속관계의 클래스 사용가능
		
		//Umma a= new Umma();
		//Ddal b = a; // 컴파일에서 오류는 안나오지만 실질적으로 에러가나옴 
	
		Ddal c = new Ddal();
		Umma d = (Umma) c; // up-casting
		Ddal e = (Ddal) d; // down-casting
	}
}