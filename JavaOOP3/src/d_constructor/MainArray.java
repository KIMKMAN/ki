package d_constructor;

import java.util.Scanner;

public class MainArray {
	
	/**
	 * 	3명의 학생 정보를 입력받아 각 학생별 총점 평균을 구한다면
	 */
	
	public static void main(String[] args) {
	
		Student[] s = new Student[3];
		Scanner in = new Scanner(System.in);
		//
		for(int i =0; i<s.length; i++) {
			s[i] = new Student();
			
			System.out.println(i + 1);
			s[i].setName()
		}
				
		// 추가적으로 각 과목별 총점을 구한다면?
				
	}

}
