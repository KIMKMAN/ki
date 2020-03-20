package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		// 학생 점수를 입력받아 80점 이상아이면"합격" 출력하고 그렇지 않으면 "불합격" 출력
		// -> 삼항연산지 이용
	Scanner input = new Scanner(System.in);
	System.out.println("점수를 입력해주세요 -> ");
	int score = input.nextInt(); 
	
	
	String result = (score>=80) ? "합격":"불합격"; 
	// 문자로 표현시 "" 항상 작성, 문자열 String result ex)문자열이기 때문에 int로 표현 안됨!!
	System.out.println("결과  " + result);
	
	
	
	}

}
