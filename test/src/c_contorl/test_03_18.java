package c_contorl;

import java.util.Scanner;

public class test_03_18 {

	public static void main(String[] args) {
//		문제 1
//		 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같이 숫사자로 된 정사각형 형태로
//		출력하는 프로그램을 작성하시오. <처리조건> 숫자의 진행 순서는 처음에 왼쪽
//		위에서 아래쪽으로 n 만큼 진행 한 후 바로 오른쪽 위에서 다시 아래쪽으로 진행하는
//		방법으로 정사각형이 될 때까지 반복한다.
//		
//		입력형식
//		정사각형 한 변의 길이 n(n의 범위는 100이하의 자연수)을 입력 받는다.
//		
//		출력형식
//		위의 형식과 같이 한 변의 길이가 n인 숫자 사각형을 출력한다. 숫자 사이는 공백으로
//		구분하여 출력한다.
//	
//		입력예                       출력예
//		4				1 5  9 13
//						2 6 10 14
//						3 7 11 15
//						4 8 12 16

//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//	
//		for (int i = 0; i < n; i++) {
//			int o=i+1;
//			for (int j = 0; j < n; j++) {
////				System.out.printf("%d " ,o);
//				System.out.print(o+" "); //자바식 표현
//				o+= n;
//			}
//			System.out.println(" ");
//		}
	
//		문제 2 숫자사각형 2
//		사각형의 높이 n과 너비 m을 입력받은 후 사각형 내부에 지그재그 형태로 1 부터
//		n*m 번까지 숫자가 차레대로 출력되는 프로그램을 작성하시요. <처리조건> 숫자의
//		진행 순서는 처음에  왼쪽에서 오른쪽으로 너비 m 만큼 진행 한 후 방향을 바꾸어서 이를
//		반복한다.
//		 1  2  3  4  5
//		10  9  8  7  6
//		11 12 13 14 15
//		20 19 18 17 16
//		높이가 4, 너비가 5인 경우
//		
//		입력형식
//		사각형의 높이 n와 너비m (n과 m의 범위는 100이하의 정수)을 입력받는다.
//		
//		출력형식
//		위에서 형태의 직사각형을 입력에서 들어온 높이 n과 너비 m에 맞춰서 출력한다. 숫자
//		사이는 공백으로 구분한다.
//		
//		입력예		출력예
//		4 5			 1  2  3  4  5
//					10  9  8  7  6
//					11 12 13 14 15
//					20 19 18 17 16
//	
	Scanner input = new Scanner(System.in);
	System.out.println("높이 n을 입력 해주세요 ->");
	int n = input.nextInt();
	System.out.println("너비 m을 입력 해주세요 ->");
	int m = input.nextInt();
	int 짝=0;
	int 홀=0;

	
	/*
	for (int i =0; i<n; i++){
		if( i%2 == 1) {	//행이 홀수일때
			for(int j=0; j<m; j++) {
				홀=홀+1;
				System.out.print( n);
			}
		}else if(i%2 == 0) { //행이 짝수일때
			for(int j=0; j<m; j++) {
				짝=짝-1;
				System.out.print(m);
			}
		}
		System.out.println();
	}
	*/
	
	
	
	
	
	
	
	}

}
