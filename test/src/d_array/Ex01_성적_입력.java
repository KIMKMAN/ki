package d_array;

import java.util.*;

/**
 *  학생 점수를 입력받아 평균과 총점을 출력
 * 
 *  입력형식 : 80/88/77
 *
 * 출력형식 : 
 * 		총점 : xxxx
 * 		평균 : xxxx
 */
 




public class Ex01_성적_입력 {
public static void main(String[] args) {
	// 성적의 총첨, 평균
	
	int[] score = new int[3];
	
	int total = 0;
	
	System.out.println("성적를 입력해주세요 (80/88/77)");
	Scanner input = new Scanner(System.in);
	String temp = input.nextLine(); 
	StringTokenizer sc = new StringTokenizer(temp, "/" ); 

	int a = sc.countTokens(); 
	for(int i=0; sc.hasMoreTokens(); i++ ) {
		String token = sc.nextToken();
		score[i] = Integer.parseInt(token); 
	
		total+=score[i];
	}
	System.out.print(total);
		System.out.println(total/a); 
	
	
	
	
	
}
}
/*
int[] score = new int[3];
int total = 0;
// 1. 입력받아 score 변수에 저장
System.out.println("성적를 입력해주세요 (80/88/77)");
Scanner input = new Scanner(System.in); // 입력할 변수 선언
String temp = input.nextLine(); //문자열 변수 입력하기때문에 변수 정의
StringTokenizer sc = new StringTokenizer(temp, "/" ); // 저장한 주소를 불러온다.
// 3. 총점과 평균 출력	
int a = sc.countTokens(); //countTokens 토큰에 갯 수를 셈
for(int i=0; sc.hasMoreTokens(); i++ ) {
	String token = sc.nextToken();
	score[i] = Integer.parseInt(token); // Integer.parsenInt 10진수 변환
	// 2. 총점구하기
	total+=score[i];
}
System.out.print(total);
	System.out.println(total/a); // 평균을 구할때 총점

*/