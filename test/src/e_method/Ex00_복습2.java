package e_method;

import java.util.Scanner;

public class Ex00_복습2 {
	static int jumsu;

	public static void main(String[] args) {
		String result = func();
		// 여기서 합격 여부를 출력하려면?
		System.out.println("결과: " + result);
		//method();
		switch(jumsu/10){
		case 10: 
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		default : System.out.println("F학점"); 
		
		}
	}

	/**
	 * method1 - 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static String func() {
		Scanner in = new Scanner(System.in);
		jumsu = in.nextInt();
		if (jumsu >= 80) // {} 생략된 이유는 실행문이 한 줄 이기때문에 작성가능 // if(jumsu > =80) return "합격"; 동일
			return "합격";
		else
			return "불합격";
	}
	

	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
//	static void method() {
//		if (jumsu >= 90) {
//			System.out.println("A학점");
//		} else if (jumsu >= 80) {
//			System.out.println("B학점");
//		} else if (jumsu >= 70) {
//			System.out.println("C학점");
//		}else { //else : 그 외 마지막을 나타냄.   70점 미만
//			System.out.println("D학점");
//		}

	

}
