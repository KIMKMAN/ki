package study;

import java.util.Scanner;

public class 연습04_02 {

	public static void main(String[] args) {
		// 변수 a,b를 입력하여 키보드로 입력받고
		// a가 b보다 크면은 "a가 더큼"으로 출력하고
		// a가 b보다 작으면 "b가 더큼"으로 출력해라.
		
//		int a = 0;
//		Scanner input = new Scanner(System.in);
//		a = input.nextInt();
//		int b = input.nextInt();
//		
//		if(a>b) {
//			System.out.println("\""+a+"가 더큼\""); 
//		}else if(a<b) {
//			System.out.println("\""+b+"가 더큼\"");// 출력값에 "를 하기위해 \"를 해주면 출력값에 " 표시
//		}
//		System.out.println();
		
//		// 크기가 5인  정수인 배열을 1로 초기화 하고
//		// 배열을 전부 출력하라
//	int []a = new int[5];
//	int b = 3;
//	
//	//a[0]=1; 작은수는 중첩되서 사용할수있지만 큰수인경우에는 효율성이 떨어져 반복문을 사용한다.
//	for (int i = 0; i < 5; i++) {
//		a[i]=1;
//	}
//	
//	
//	for(int i =0; i<5; i++) {
//		System.out.println(a[i]);
//	}
//	System.out.println();
		
		
		
		// 학생의 점수를 입력하고 점수를  받아서  총점과 평균을 구해라 
		// 국어 점수 80 , 영어 점수 80, 수학 점수 80
		Scanner input = new Scanner(System.in);
		System.out.println("학생의 점수를 입력해주세요!");
		int []score = new int[3];
		int total =0;
		double avg = 0;
		for(int i=0; i<score.length; i++) {
			score[i]= input.nextInt();
			total+=score[i];
		}
		
		avg = (double)total / score.length;
	
				
		System.out.print("총점 " +total+ "평균" + avg);
			System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
