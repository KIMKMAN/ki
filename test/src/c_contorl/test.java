package c_contorl;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		System.out.println("A의 정수를 입력하세요");
		int A = 0;//input.nextInt();
		System.out.println("B의 정수를 입력하세요");
		int B = //input.nextInt();
		System.out.println("C의 정수를 입력하세요");
		int C = //input.nextInt();
		int mid = 0;
		if (A > B) {
			if (B > C) {
				mid = B;
			} else if (C >= B) {
				if (A > C) {
					mid = C;
				} else if (A <= C) {
					mid = A;
				}
			}
		} else if (A <= B) {
			if (A > C) {
				mid = A;
			} else if (A <= C) {
				if (B > C) {
					mid = C;
				} else if (B <= C) {
					mid = B;
				}
			}
		}
		System.out.println("mid = " + mid );
	}
}

/*
 * 문제 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 첫째 줄에 세 정수 A,B,C,가 공백으로 구분되어 주어진다.(1<=A,B,C<=100)
 * 
 * 출력 두 번째로 큰 정수를 출력한다. 예제 입력 복사 예제 출력 복사 20 30 10 20 30 30 10 30 40 40 40 40 20
 * 10 10 10
 */