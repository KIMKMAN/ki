package c_contorl;

import java.util.Scanner;

public class Ex03_if_성적 {

	public static void main(String[] args) {
		// 국, 영, 수 점수 입력받아서 총점, 평균 출력
		// 1. 평균에 따른 학점(A~F)출력
		// *** if 문 이용 
		int kor = 0, eng = 0, math = 0;

		Scanner input = new Scanner(System.in);
		System.out.println( "국어점수 -> ");
		kor = input.nextInt();
		System.out.println( "영어점수 -> ");
		eng = input.nextInt();
		System.out.println( "수학점수 -> ");
		math = input.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println("총점: " +  total ); 
		System.out.println("평균: " +  avg ); 	


		/*
		 * 90 이상 A / 80부터 90미만 B / 70부터 80미만 C
		 */
		if(avg>=90) {
			System.out.println("A학점");
		} else if (avg>=80) {
			System.out.println("B학점");
		} else if (avg>=70) {
			System.out.println("C학점");
		} else if (avg>=60) {
			System.out.println("D학점");
		} else if (avg>=50) {
			System.out.println("E학점");
		} else if (avg<50) { // F학점 50점 점수 이하는 F학점
		
			System.out.println("F학점");
	}

	}
}