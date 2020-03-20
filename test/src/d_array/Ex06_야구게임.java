package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_야구게임 { 
	public static void main(String[] args) {
		//야구게임 3개의 변수로 strike,  ball을 구현 
		int[] baseball = new int[3];
		int[] answer = new int[3];
		int strike = 0, ball = 0;

		// 1. 임의의 수 3개를 baseball에 저장
		for (int i = 0; i < baseball.length; i++) {
			baseball[i] = (int) (Math.random() * 10);
			System.out.print(baseball[i]);
		}
		for(int l=0; l<5; l++) {
			
		// 2. 사용자 입력값 받아서 answer 에 각각의 숫자를 저장
		System.out.println("숫자입력 - >");
		Scanner input = new Scanner(System.in);
		String b = input.nextLine();
		StringTokenizer base = new StringTokenizer(b, "/"); // 오타 잘확인하자
		int a = base.countTokens();
		for (int k = 0; base.hasMoreTokens(); k++) {
			String Token = base.nextToken();
			answer[k] = Integer.parseInt(Token);
		}
		}
		// 3. 값비교
		BASEBALL:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (baseball[i] == answer[j]) {
					if (i == j) {
						strike++;
						break BASEBALL;
					} else {
						ball++;
					}
				}
			} // end for-j
			int = t;
			for(int g = 0; g<3; g++) {
				if(basebll[i] == answer[j-i]) {
					t = baseball[i];
					i = answer[j]-1;
					answer[j] = t;
				}
			}
		} // end for-i
			// 4. strike와 ball 출력
		System.out.println("스트라이크: " + strike + "/를" + ball);

	}

}
