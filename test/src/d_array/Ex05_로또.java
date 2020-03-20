package d_array;

public class Ex05_로또 {
	public static void main(String[] args) {

		// 변수명 로또

		int[] Lotto = new int[6]; // int temp = int // 임시변수로 비교
		
		//비교대상찾기
		for (int i=0; i<Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45+1); // 0부터 1미만 수를 랜덤으로 뽑느다. math.random
		}											
		for (int i = Lotto.length -1; i>0 ; i--) { // 값이 중복되지 않기 위해 포문을 추가
			int temp = 0;							
				if (Lotto[j] > Lotto[j + 1]) {			
					temp = Lotto[j];
					Lotto[j] = Lotto[j+1];
					Lotto[j+1] = temp;
				}
			}
		}
		for(int j=0; j<Lotto.length; j++) {
			System.out.print(Lotto[j]+"/");
		}
		}	
}


// int temp = ()