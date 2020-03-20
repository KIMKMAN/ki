package study;

public class 연습03 {

	public static void main(String[] args) {
		// 국어 80 20 30 20 
		// 국어점수와 수학 점수 바뀌고 영어점수를 사회점수와 바꾸고
		// 네개의 점수에 총점과 평균을 구하라
		int[] kor = new int[] { 80, 20, 30, 20 };
		int total = kor[0] + kor[1] + kor[2]+kor[3];
		double avg = (double) total/4;

		for (int i = 0; i < 4; i++) {

			
			int temp = 0;
			if (i <2 ) {
				temp = kor[0];
				
			} else if (i > 2) {
				int bin = 0;
				bin = kor[2];
				kor[2] = kor[3];
				kor[3] = bin;
			}
		}
		System.out.println("변경된 점수는 ? " + kor[0] + " " + kor[1] + " " + kor[2] + " " + kor[3]);
		System.out.println("총 점수는 ?" + total);
		System.out.println("평균은 ?" + avg);

			// 국어점수를 저장할  변수 선언 - 값 대입
			
//			int kor;
//			kor = 90;
//			
//			// 초기화 : 변수 선언시 값 대입
//			int eng = 88;
		// -- 원하는 만큼 주석을 하면 crtl shift c
			
					
			//  kor와 eng 두개 이상의 변수를 한 번에 선언
//			int kor=90 , eng=90;
//			System.out.print("국어:" + kor + " , 영어:" +eng +"\n"); //println의 ln 온라인이라는 뜻 한 줄이 띄어지고 안 띄어지고의 차이 이다.
//			System.out.printf("국어: %d, 영어 : %d", kor, eng); // 또는  "\n" 로 줄을 한 줄 뗄 수 있다.


			
			//---------------------------------------------------
			// 점수바꾸기 - swap 맞바꾸기. 
			// 반드시 임시 변수가 필요하다. 임시 변수에 값 하나를 옮기고 값이 옮겨진 곳에 나머지 하나를 저장 그리고 임시변수를 나머지 하나로 가져오면 된다.
//			int temp;
//			temp = kor; //1
//			kor = eng; //2
//			eng = temp; //3
//			System.out.print("\n" + "국어:" + kor + " , 영어:" + eng +"\n");
//			
//			if ( kor == eng ) { //같다는 연산은 == 두개다
//				System.out.println("동일한 점수");
//			}else {
//				System.out.println("다른점수");
//				
//			}// 비교
//			System.out.println(i);
//		}
//		System.out.println();
//			


		
		

	}

}
