package c_contorl;

import java.util.Scanner;

public class test_03_17 { // for문 첫번째 명령어 행, 두번째 열 

	public static void main(String[] args) {

//문제.1
//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시요.
//주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//입력 예			출력 예
//
// 3	            1
//			      1 2
//			    1 2 3
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("출력 : ");

		for (int i = 0; i < n; i++) { // 첫번째 행은 고정되는 항
			for (int j = 0; j < n-i-(1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) { // 이중포문형 j에 값이 거짓이 되면 행에 값이 거짓이 될 때까지  이중포문을 반복한다.
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i<10; i++) {
			for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
//-----------------------------------------------------------------------------------
//문제2
//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시요.
//주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다. //for 밖에 변수 작성
//입력 예			출력 예
//
// 3	       1 2 3
//			     4 5
//			       6
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		for(int i =1; i<n; i++ ) {
//			
//		for(int j = 1; j<n; j++) {
//			System.out.print(j);
//		}
//		}
//		System.out.println();
	

		
			
//	
//문제3 : 숫자사각형1 (정올-1303)
//
//사각형의 높이 n과 너비 m 을 입력받은 후 n행 m 열의 사각형 형태로 1부터 n*m번까지
//숫자가 차례대로 출력된느 프로그램을 작성하시오.
//
//<처리조건>
//숫자의 진행 순서는 처음에 맨 윗줄의 왼쪽에서 오른쪽으로 1 부터 차례대로 너비
//만큼 출력한 후 다음 줄로 바꾸어서 다시 왼쪽에서 오른쪽으로 1 씩 증가하면서
//출력하는 방법으로 n번 줄까지 반복한다.
//입력형식
//사각형의 높이 n와 너비 m(n과 m의 범의는 100이하의 정수)을 입력받는다.
//출려형식
//위에서 형태의 지사각형을 입력에서 들어온 높이 n과 너비 m에 맞춰서 출력한다.
//
//입력 예			출력 예
//
//4 5		 1 2 3 4 5
//			 6 7 8 9 10
//			11 12 13 14 15
//			16 17 18 19 20

	}
	}


