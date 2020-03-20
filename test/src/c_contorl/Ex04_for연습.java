package c_contorl;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); // 변수 N은 문자열이기 때문에 Scanner 입력 후 출력값 N으로 수정
		 * int N = input.nextInt();
		 */	
	
		/*
		 * for(int i=1; i<=N; i++) { // 정수 입력후 N이 마지막 변수이기 때문에 처음 입력한 정수 부터 내려가는 숫자 까지 전체 입력됨.
		 * System.out.print(i+" "); // \t 한탭으로 나누어짐 if (i%5 == 0) { // 나머지 같이 동일 할 때 대입( == n값) // 5의 배수로 계산 때문에 5단위 까지 나눠서 적용
		 *  System.out.println(); } }
		 */
		Scanner input = new Scanner(System.in); // N문자열 가상통로 입력
		System.out.println("문자를 입력 해주세요 -> ");
		char N = input.nextLine().charAt(0); //문자 하나를 뜻함 charAt(N)으로 입력해준다
				// 변수.nextLine() 하나의 문자열
		if (N<='A'&& N<='Z') { // 문자''항상 표시  N의 대문자 a-z 범위 지정 
			for(char ch = N; N<= 'Z'; N++)
		{
			System.out.print(N);
		} else if(N>='a'&& N<='z') { //N범위가 a-z 라면.. 여기에 else가 없다면 대문자 B를 입력 했다고 했을 때 위에서 이미 참이라서
									   // 이 코드를 실행 할 필요가 없지만 실행이 되게된다. 따라서 효율적으로 코드를 구성하려면 이 부분에 else가
									   // 들어가는 것이 맞게 되는 것이다.
			for(char ch = 'a'; N<= 'z'; ch++) {// a부터 z보다 작을 때까지 ch가 1씩 증가하며 프린트.
			System.out.println(ch);	 
							}
		}
		else {
			System.out.println(ch);
		}
		}
	}
}


/* 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
 * 
 * 1 2 3 4 5 
 * 6 7 8 9 10 
 * 11 12 13 14 15

문제2)  문자열처리하기
문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
N이 대문자이면 문자 N부터  Z까지 출력하라
그 밖의 문자가 입력되면 Error 를 출력하라

입력               출력
f       abcdef
X       XYZ
6       Error


 */