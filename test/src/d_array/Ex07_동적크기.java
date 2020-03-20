package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args) {
		// 5*5 2차원배열 데이터타입 문자형
		// 변수명은 STAR
		// *
		//동적크기배열 
		// *
		// **
		// ***
		//****
		//*****

		char[][] star = new char[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) { //5*5 출력 하고 열의 값을 증가 하거나 감소할때 조건식을 바꾼다.
				star[i][j] = '*'; // 문자 입력시 ''항상 입력
			}
			
		}
		for (int i = 0; i < 5; i++) { // 
			for (int j = 0; j < star[i].length; j++) { // 0 1 2 3 4

				System.out.print(star[i][j] + "");
			}
			System.out.println();
		}

	}

}
