package e_method;

import java.util.Scanner;

public class Ex02_연습 {
//(문제 1) 영문자를 입력하여 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오.
//함수명 : checkLower
//인자 : char
//리턴(반환) : boolean

	public static void main(String[] args) {
		// 문자 입력
		Scanner input = new Scanner(System.in);
		System.out.println("문자입력-> ");
		char ch = input.next().charAt(0); //charAt(0)인덱스 받은 문자열에  (괄호)번째 한 문자를 불러옴
		boolean a = chekLower(ch); //인자 ch //저장된 데이터가 없다 항상 호출한 데이터와 동일하게 선언하면 저장됨
		// 소문자인지 대문자인지 출력
		if (a == true)System.out.println("소문자"); //if(a) == if(a== ture)// 결과값이 true 이기 때문에 이와 같이 동일하게 작성해도 상관없다.
		else System.out.println("소문자 아님");
	}

	static boolean chekLower(char ch) { //ch 인수 ch
		// 넘겨받은 인자 ch 값이 소문자라면 return true;
		if ('a' <= ch && ch <= 'z') {
			return true;
			// 그렇치 않은면 retrun false;
		} else {
			return false;

		}
	}

}