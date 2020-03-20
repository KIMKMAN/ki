package b_operator;

/**
 * 	not : 결과를 반대로 하는 연산자
 * 			- 일반논리 not :  !
 * 					true -> false /false -> ture
 * 			- 이진논리 not : ~
 * 				각 비트의 값이 0 -> 1 /1 -> 0
 */
public class Ex02_Not {

	public static void main(String[] args) {
	
		boolean result = 3 > 4;
		System.out.println(result);  // false
		System.out.println(!result); // ture !에 의해
		
		int a = 15;
		// System.out.println(!a); // 정수가 참거짓으로 정의 안됨
		System.out.println(~a); // 양수부호에서 1로 바뀌기 때문에 음수부호가 나온다
		// a 15 : 00000000 00000000 00000000 00001111
		// ~a : 11111111 11111111 11111111 111100000

	}

}
