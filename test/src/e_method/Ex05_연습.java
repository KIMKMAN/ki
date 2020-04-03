package e_method;

import java.util.Scanner;

public class Ex05_연습 {

	public static void main(String[] args) {
		char[][] result = input();
		output(result);

	}

	/*
	 * 두 정수와 알파벳 문자 하나를 입력받기 예) 3 4 F
	 */

	static char[][] input() { // 자바만 동일하게 앞에 메인 함수 적어야함
		Scanner input = new Scanner(System.in);
		System.out.println("두 정수와 알파벳 문자 하나를입력");
		int first = input.nextInt();
		int second = input.nextInt();
		char alpha = input.next().charAt(0);

		char[][] result = makeSquare(first, second, alpha);
		return result;
	}

	/*
	 * 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어 입력받은 문자로 시작하는 알파벳으로 저장하세요
	 * 
	 * F G H I J K L M N O P Q
	 * 
	 */

	static char[][] makeSquare(int first, int second, char alpha) {//  보내는부분//인자는 받는부분
		char[][] ch = new char[first][second];
		for (int i = 0; i < first; i++) {
			for (int j = 0; j < second; j++) {
				ch[i][j] = alpha; // alpha++
				alpha++;
			}

		}
		return ch; // return 선언시 해당하는 입력데이타에 메인함수 동일하게 수정
	}

	static void output(char[][] ch) {
		// 출력
		for (int i = 0; i < ch.length; i++) { // ch 행의 길이
			for (int j = 0; j < ch[i].length; j++) { // ch[i] 열의 길이
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}
}