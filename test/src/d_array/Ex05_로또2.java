package d_array;

public class Ex05_로또2 {

	public static void main(String[] args) {

		int[][] lotto = new int[5][6]; // 선언
		// 행 두번째는 행에 번호 /선언 배열은 앞에 사용 권장
		//값대입 ##동일 숫자 배제
		for(int i=0; i<5; i++) { //줄
			for (int j = 0; j < 6; j++) {
				lotto[i][j] = (int) (Math.random() * 45) + 1; // i번에 줄에다가 j를 넣어주세요
			}

		}
		// 정렬 
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0 ; j<lotto[i].length-1; j++)
			{
				if (lotto[i][j] > lotto[i][j+1]) {
					// swapping 
					int c = 0; 
					c = lotto[i][j];
					lotto[i][j] = lotto[i][j + 1];
					lotto[i][j + 1] = c;
				}
			}


		}
		// 출력
		for(int i= 0; i<5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(lotto[i][j] + "/");
			}
			System.out.println();
		}
	}
}