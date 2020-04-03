package c_contorl;

import java.util.Scanner;

public class Ex06_do_while {
	public static void main(String[] args) {

		String result = "";
		do { // 조건과 상관없이 한 번 실행 후 그 다음 조건을 대입 후 맞으면 반복
			Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력해 주세요");
			int su = input.nextInt();
			for (int i=1 ; i<=9; i++) {
				System.out.printf(" %d * %d = %d \n", su, i, su*i);
			}
			System.out.println();
			input.hasNext("구구단 다시 할까요?");
			result = input.next();
		}while(result.equals("Y")|result.equals("y")); 
		
	}

}
