package b_operator;

import java.util.Scanner;

/**
 * 두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

public class Ex03_Arithmetic {

	public static void main(String[] args) {

		/*
		 * Scanner input = new Scanner(System.in); 
		 * System.out.println("수를 입력해주세요");
		 * int a = input.nextInt(); 
		 * System.out.println("수를 입력해주세요"); 
		 * int b = input.nextInt();
		 
		 * int sum = a + b; 
		 * int min = a - b; 
		 * int mul = a * b; 
		 * double div = (double)a/b;
		 * double temp = a % b;
		 * System.out.println("합 :" + sum); 
		 * System.out.println("차 :" + min);
		 * System.out.println("곱 :" + mul); 
		 * System.out.println("나누기 :" + div);
		 * System.out.println("나머지 :" + temp);
		 *
		 */
		// 나머지 연산자 활용 - 홀/짝수 구하기
		// (1)정수형 변수 su 선원
		int su = 0;
		// (2)Scannner 선언
		Scanner in = new Scanner(System.in);
		// (3)화면에 "정수를 입력하세요" 추력
		System.out.println("정수를 입력하세요");
		// (4)입려갇 정수를 su 변수에 정장
		su = in.nextInt();
		// (5) 입력받은 수가 홀/짝수 구하기
		//		if (su % 2 == 0) {
		//			System.out.println("짝수");
		//		} else {
		//			System.out.println("홀수");
		// (6) 입력받은 수가 3의 배수인지 아닌지 확인
		if (su % 3 == 0) {
			System.out.println("3의 배수 입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");

		}
	}
}
