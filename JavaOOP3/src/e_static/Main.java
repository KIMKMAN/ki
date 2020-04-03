package e_static;

/**
 * 단 하나로 공유 : static
 * 
 * - 객체 명이 아닌 클래스 명이 접근이 가능
 * 
 * static 이 붙으면 메모리가 생기고 객체 없이 만들고 영역이 만들어지면  명을 각각 나누어짐
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) { 
		// 이름이 main이고 인자로 arg라는 String[] 을 가지고 리턴값이 없고 어디서든 접근이 가능하다
		// 메인에 static을 하는 이유는 클래스명으로 바로 접근을 하기 위해서 이다. 
		// static이 없으면 객체를 생성해야하는데, jvm이 객체를 만들고 초기화시켜서 다시 그 클래스의 변수명으로 
		// main 메소드를 부르는 것 보다 효율적이기 때문에, 객체 생성을 하지 않고도 main 메소드를 얻기 위해서 main에 static을 붙였다.
		
		Book b1 = new Book(); // 메인 함수 호출 후 ++연산자에 의해 증가
		Book b2 = new Book();	// 
		Book b3 = new Book();
		
		System.out.println("총 갯수" + Book.getCount()); //count 
//		System.out.println("총 갯수" + b2.count);
//		System.out.println("총 갯수" + b3.count);
		

	}

}
