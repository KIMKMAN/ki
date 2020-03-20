package d_array;

public class Ex04_정렬 {
	public static void main(String[] args) {

		int[] score = { 88, 61, 92, 35, 56 };
		for (int i = score.length - 1; i > 0; i--) { // i=4
			for (int j = 0; j < i; j++) {
				if (score[j] > score[j + 1]) {
					// swapping // 자바 프로그램은 대입식으로 바꿔서 계산할 때 반대로 되기때문에 거꾸로 써준다.
					int c = 0; //
					c = score[j];
					score[j] = score[j + 1];
					score[j + 1] = c;

				}

			}
		}

		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "/");
		}

	}
}