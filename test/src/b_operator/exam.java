package b_operator;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// 100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		 /*(1) 학생점수 변수 선언
		  (2) Scanner 선언
		  (3) 화면에 "점수 입력->" 문장 출력
		  (4) 입력값을 변수에 저장
		  (5) 입력값이 80보다 크고 90보다 작다면
		   (6) '평균' 출력 */  
		int score; // 변수 정의 할 때 한글이 안 될 수 있으니 영어사용, 다른 언어 같은 경우 사용안됨.
		Scanner input = new Scanner(System.in);
		System.out.println("점수 입력 ->");
		score = input.nextInt();
		if (score <= 90 && score >80 ) { // 변수에 참을 표현시 반복해서 변수 작성!
			System.out.println("평균");
		
		}
		

	}

}
