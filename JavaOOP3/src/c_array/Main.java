package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) { // 객체 생성 2개 필요 Class, 배열
		Scanner in = new Scanner(System.in);

		Student[] s = new Student[3]; // 학생 수 3은 배열의 갯수를 의미한다. -> 클래스를 배열로
		// 이 경우에 스튜던트라는 배열은 3개가 만들어지지만 각 배열의 요소 값이 null로 되어있다. -> 배열만 만들어진다.

		// 입력부
		for (int i = 0; i < s.length; i++) // 반복문을 통해서 이 빈 공간에 Student class 의 객체ㅔ를 생성해야한다.
			s[i] = new Student(); // Student Class 의미

		// 학생의 이름과 국영수점수를 입력받아 이름과 총점, 평균 출력

		for (int o = 0; o < s.length; o++) {
			s[o].setName(in.next());
			s[o].setKor(in.nextInt());
			s[o].setEng(in.nextInt());
			s[o].setMath(in.nextInt());
		}
		for (int j = 0; j < s.length; j++) {

			// Student stu = new Student(name,k,e,m)
			System.out.println("번째 학생" + s[j].getName());
			System.out.println("총점은 " + s[j].calTotal());
			System.out.println("평균은 " + s[j].calAverage());

		}

	}

}
