package c_contorl;

import java.util.Scanner;

public class Ex03_switch_성적 {

	public static void main(String[] args) {
		// 국, 영, 수 점수 입력받아서 총점, 평균 출력  //출력 될 수 있는 변수를 정의하자
		// 1. 평균에 따른 학점(A~F)출력
		// *** swtich 문 이용
		int kor=0, eng=0, math=0;
		int sum = 0;
		double avg =0;
		Scanner input = new Scanner (System.in);
		System.out.println("국어 점수는 -> ");
		kor = input.nextInt();
		System.out.println("영어 점수는 ->"  );
		eng = input.nextInt();
		System.out.println("수학 점수는 ->" );
		math = input.nextInt();
		sum = kor + eng + math;
		avg = sum / 3.0;
		String score="";
		

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		switch ((int) avg / 10) {

		case 10:
		case 9:
			score = "A학점";
			break;
		case 8:
			score = "B학점";
			break;
		case 7:
			score = "C학점";
			break;
		case 6:
			score = "D학점";
			break;
		case 5:
			score = "E학점";
			break;
		case 4: // 결과 값이 같기 때문에 생략
			
		case 3:
		case 2:
		case 1:
		case 0:score = "F학점"; break;

		}
	System.out.println("나의 학점은 " + score );
	}
	/*
	 * 90 이상 A / 80부터 90미만 B / 70부터 80미만 C
	 */

}
