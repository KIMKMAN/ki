package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest { //클래스명과 자바 파일명은 동일. 우리는 항상 그렇게..

	public static void main(String[] args) {
		
		// 인스턴스 생성. 우리가 설계한 클래스는 그저 글씨일 뿐이다.
		CalculatorExpr expr = new CalculatorExpr();
		// 입력받고 설정.
		Scanner input = new Scanner(System.in);
		String answer = "";
		do{
			System.out.println();
		int first = input.nextInt();
		int second = input.nextInt();
		// 입력값들 멤버변수에 저장하기
		expr.setNum1(first);
		expr.setNum2(second);

		// 사칙연산 메소드 호출하여서 출력
		System.out.println("덧셈 = " + expr.getAddition());
		System.out.println("뺄셈 = " + expr.getSubtraction());
		System.out.println("곱셈 = " + expr.getMultiplication());
		System.out.println("나눗셈 = " + expr.getDivision());
		
		System.out.println("다시?");
		answer = input.next();
		// 나머지도
		} 
		
		while (answer.equals("Y") | answer.equals("y"));
			
	}

}
