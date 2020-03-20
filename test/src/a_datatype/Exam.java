package a_datatype;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 나이와 키를 입력받아서 출력
		// int 나이 = 0; 
		// double 키 = 0;
		// Scanner 변수명 상관없음
		Scanner input = new Scanner(System.in); // 입력받을 수 있는 가상의 통로를 만든다. // 변수 명은 관련이 있는걸로 하는게 좋다.
		System.out.print("나이 ->");
		int 나이 = input.nextInt();
		System.out.print("키 ->");
		double 키 = input.nextDouble();

		System.out.print("이름 -> ");
		input.nextLine();
		String 이름 = input.nextLine(); // nextLine 라인을 쓰는 이유 정수가 띄어쓰기 할 때 안 사라지게 역할을 하지만 엔터키를 누르면 종료되므로 위에
										// 변수+nextLine(); 해주면 종료없이 됨
		
		// 변수가 잘 받아 졌는지 확인.
		System.out.println("이름 " + 이름 + "\n" + "나이 : " + 나이 +"키 : " + 키);
		
	}
}
