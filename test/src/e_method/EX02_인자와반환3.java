package e_method;

public class EX02_인자와반환3 {

	public static void main(String[] args) {

		int[] arr = add();
		// 데이타를 넘겨받아 합 구하고 출력
		int sum = arr[0] + arr[1];
		System.out.println("합 : " + sum);
	}

	static int[] add() { // 자료형 [] 
		// 입력 데이타
		int a = 10, b = 20;
		int[] arr = {a, b};
		return arr;
	}

}
// 1. 인자반환
// 2. 인수 선언
// 3. 제어문 반환
// 4. 반환된 제어문에 데이터 입력
// 5. 값을 계산
// 6. 출력값

