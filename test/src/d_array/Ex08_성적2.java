package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {
		// 학생수를 입력받으세요
		// 점수를 저장할 변수를 학생수만큼 선언     score
		// 학생  과목이 3개
//		입력할 학생수를 입력하세요. 4
//		4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
//		1째 학생의 성적을 입력 -> 88/77/66
//		2째 학생의 성적을 입력 -> 50/40/70
//		3째 학생의 성적을 입력 -> 44/33/22
//		4째 학생의 성적을 입력 -> 55/50/70



		// 우선은 각각의 점수만 출력하세요
		System.out.println("우리반 학생은? ");
		Scanner input = new Scanner(System.in);
		int su = input.nextInt();
		int [][]score = new int[su][3]; // [][]선언시만  [5][3] 행렬의 범위까지 
		for (int i =0; i<score.length; i++ ) { // 조건식을 구할때 [][]은 인덱스까지 포함되기때문에  length 길이를 구하자.
			
			System.out.println("학생의 성적은? ");
			StringTokenizer sc = new StringTokenizer(su, "/" ); // 토큰에 갯수
		int a = sc.countTokens(); // 토큰의 갯수로 처리(점수)
		for(int i=0; sc.hasMoreTokens(); i++ ) {// 
			String token = sc.nextToken(); // nextToken 갯수가 줌
			score[i] = Integer.parseInt(token); 
		for(int i=0; i<4; i++) {
			for(int =j 0; j<4; j++) {
				
			} System.out.print();
			
		} System.out.println();
		
		}
		
		
		
		}
		
	}

}
