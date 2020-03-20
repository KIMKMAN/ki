package d_array;

public class Ex01_성적 {

	public static void main(String[] args) { // 배열 사용시 for문 항상작성
//		int [] kor;
//		kor = new int[5];
//		int [] kor = new int[5];
//		kor[0] = 90;
//		kor[1] = 88;
//		kor[2] = 89;
//		kor[3] = 70;
//		kor[4] = 77;
		//kor[5] = 99; //에러 0~5 0부터 시작 
		
		//배열 초기화
		// int[] kor = new int[] {90, 88, 89 ,70 ,77};// 배열 값을 초기화 해서 사용할수있다 //
		int []kor = {90, 88, 80, 70, 77}; //배열을 초기화
		
		
		int total = 0;
		for(int i=0; i<kor.length; i++) { // 
				total += kor[i];
				// 총점구하기
				// total = kor[0] + kor[1] + kor[2] + ...... //stack에서 초기화안됨, heap에서 자동 초기화됨
			}
		System.out.println("총점" + total);
		
		
		
		
		
		
		
		
		
		
		
	}

}
