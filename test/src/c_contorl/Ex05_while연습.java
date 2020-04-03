package c_contorl;

public class Ex05_while연습 {

	public static void main(String[] args) {
		// 구구단 3 6 9
		// 1~9 까지 출력
//		for (int i=1; i<=10; i++) 
//		{
//			int su = i;
//			boolean su369 = false;
//
//			while(su != 0) {
//				int na= su %10;
//				if(na == 3 || na==6 || na==9 ) { // 숫자가 3이거나 6이거나 9라면?
//					System.out.print("짝");
//					su369 = true;
//				}
//				su/=10; // su / 10;
//			}
//			//su369값???
//			if(su369) System.out.println();
//			else System.out.println(i);
//		}
		// 몫 나머지 값 10으로 나눠서 나오는 나머지 값으로 구구단을 알 수 있다.
		// 위의 for 문은 10이상의 숫자가 나오는 3 6 9를 할 수없다.

		//	         문제가 어려운 것이 아니라 구글입사시험이라는 편견이 있었다.
		//		 문제  : 8의 숫자 세기(구글입사문제)
		//		 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		//		 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
		//		 (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
		//		 결과 : 4000
		int n8 = 0;
		for(int i = 0; i<10000; i++) {
			int su = 0;
			while (su != 0) {
			int na= su%10;
			if(na == 8) {
				n8++;
			}
			na/=10;
					}
			System.out.println("8의 갯수는 ? "+n8);
		}
		
	}
}
