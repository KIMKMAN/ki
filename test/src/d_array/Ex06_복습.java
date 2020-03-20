package d_array;

public class Ex06_복습 {

	public static void main(String[] args) {
		// 1. 3 *4 2차원배열
		// 2.  char ch 선언
		// 3. ABC
		char[][] ch = new char[3][4];
		char a = 'A';
		
		// 2. 값입력
		for (int i = 0; i < ch.length; i++) { // 값을 모를 때 length 적용 (문자의 길이를 알수있다)

			for (int j = 0; j < 4; j++) {
				ch[i][j] = a++; //알파벳 ABC 값을 출력하기 위헤 char 변수선언 알파벳 순으로 하기위해 증가시킨다
			}
		}
		for (int i = 0; i < ch.length; i++) { 

			for (int j = 0; j < 4; j++) {

				System.out.print(ch[i][j] + " ");
			}
			System.out.println(); // 영역구분
		}

	}

}
