package c_contorl;

public class Exsam_01 {

	public static void main(String[] args) {
		// 1부터 3까지 출력
//		for (int i = 1; i < 4; i++) { // 자바에서는 출력값이 가로 안에 있어야하는 이유는 반복문에 계산이 되므로 
//			System.out.println(i);
//		}
		//3행 2열 행렬을 가상하고 번호붙이기
		for (int i = 0; i<3; i++) { // i<=2  동일
			for (int j = 0; j<2; j++) {
				System.out.printf("<%d , %d>", i, j);// 총 실행횟수 5
			}
			System.out.println();
		}
	}

}
