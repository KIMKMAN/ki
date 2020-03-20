package c_contorl;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념 {

	public static void main(String[] args) {
		
//		//1~10 까지의 합을 출력
//		int hap = 0;
//		int i =1;
//		//for ( ; i<=10; ) {
//		while( i<=10) 
//		{
//			hap = hap +i; // hap +i;
//			i++;
//		}
//		System.out.println("합 " + hap);

//		// 숫자 하나 입력받기 // for문 갯 수가 명확히 정해질때 사용// while문 갯 수 명확하지 않을 때 사용
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력해 주세요");
//		int su = input.nextInt();
//		int i=1;
//		while(i<=9) {
//			System.out.printf(" %d * %d = %d \n", su, i, su*i);
//			i++;
//		}
//	
		//문장을 입력받아  단어로 나눠서 출력
		// "빨리 코로나 끝났으면 좋겠습니다"
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("문자열을 입력해 주세요(ex. 90/80/70/60)"); 
//		String line= input.nextLine();
//		StringTokenizer st = new StringTokenizer(line,"/"); // line이 없으면 출력값이 없다.
//		// StringTokenizer 내가 입력한 토큰이 뭐가 있는지 불러오겠다/.
//		while(st.hasMoreTokens()) { //ex)// 빨리// 코로나// 끝났으면// 좋겠습니다
//			// 불러온 토큰이 없을 때까지 while문을 반복하겠다
//			
//			String temp = st.nextToken(); // 볼러온 토큰을 한단위로 저장
//			int su = Integer.parseInt(temp); // String -> int 
//			// Integer.parseInt 숫자형을 10진수로 변환 // 
//						
//			System.out.println(++su); // 정수로 인식해서 증가
//			
//		}
		
		
		// 문제 2)
		// 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시요.
		//입력
		// 10 20 30 55 66 77 88 99 100 15
		
		// 출력
		// 짝수 : 6개
		// 홀수 : 4개
		int 홀=0;
		int 짝=0;
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		
		StringTokenizer gh = new StringTokenizer(line);
		
		while (gh.hasMoreTokens()) {
			String temp = gh.nextToken();
			int su = Integer.parseInt(temp);
			if (su % 2 == 0) { // 짝수 의미
				짝=짝+1; // 짝수 갯 수를 1를 추가해준다
			} else if (su % 2 == 1) {
				홀=홀+1;
				}
		}
		System.out.println("짝수"+ 짝 +" 개");
		System.out.println("홀수"+ 홀 +" 개");
	}

}
