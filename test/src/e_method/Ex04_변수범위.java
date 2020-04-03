package e_method;

public class Ex04_변수범위 {
	// 멤버변수,전역변수 //클래스안에 있고 모든 범위를 사용
	static int a, b; //메인 함수가 static이기 때문에 영역안 , 밖에도  동일하게 메인함수설정
	static int sum;  // 자동 초기화 a b sum =0 메모리에 heap잡힘 멤버변수는 heap잡힘
	
	public static void main(String[] args) {
		// 영역안에 있는 변수는 지역변수 : 영역안에만 사용
		int a = 10; // 메모리 한번더 작성 stack. 지역변수는 stack잡힙 // 우선순위 는 지역변수가 높기때문에 변수가 새로 만들어짐
		b = 20;		// 실수많이 하기 때문에 멤버변수와 지역변수를 잘확인하자
		add();
		System.out.println("합: " + sum);
	}

	static void add() { 
		sum = a + b; //int sum 변수가 새로 선언되기 지역변수가 우선순위로 바뀌기 때문에 값이 0된다.
	}
}
