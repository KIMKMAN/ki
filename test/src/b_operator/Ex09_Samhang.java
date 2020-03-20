package b_operator;

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력   삼항 연산자 간략히 사용 가능하고 문자에 
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		
		// 만일 a가 b보다 크다면
		int max = (a > b)? a:b; // 삼항연산자를 저장할 변수를 선언한다. a가 크면 뒤의 a 를 출력 그렇치 않으면 b를 출력
		System.out.println(max +"이 큰 수");
	}

}
