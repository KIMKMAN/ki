package e_method;

public class EX02_인자와반환2 {

	public static void main(String[] args) {

		int sum = add(); // 값만 받았기에 정수 데이터가 선언되지 않았으므로 선언 꼭필요
		// 출력
		System.out.println("출력" + sum);
	}

	static int add() { // void 아무것도 가지않는 자료형 ->데이터값이 int형이므로 int형 정수로 바꿔줘야해야한다
		// 데이타 입력
		int a = 10, b = 20;
		// 계산
		int sum = a + b;
		return sum; //제어권
	}

}
/*
 * return : 프로그램 흐름 반환
 * 			단 하나의 변수를 반환 있음
 */