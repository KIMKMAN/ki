package c_contorl;

public class Ex07_break_continue {

	public static void main(String[] args) {
		
		
		HERE: // 라벨 대문자 사용 프로그래머 약식
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				// if(j==1) break; // 블럭 벗어나는 문장(반복 벗어나기)
				// if(j==1) continue; // 블럭 끝으로 가기 (반복은 수행함)
				// continue에 조건식은 종료가 되지않고 영역 끝으로 가서 조건식 을 반복하고 참일 경우 출력하지 않는다
				// 하지만 종료되지 않고 조건식이 만족할때까지 반복 계산
				
				// if(j==1) break HERE;
				// 중첩된 반복문의 조건식 만족 후 break HERE;에 가까운 for에 종료

				if (j == 1)
					continue HERE;
				// 조건식 참이 아니기 때문에 종료하지 않고 영역 끝에서 반복 계산하고 라벨이 붙었기 때문에 가까운 폼에서 종료
				// 조건식이 참일 경우 종료지만 continue에 의해 종료되지않고 조건식 영역끝으로 간다.
				System.out.printf("%d , %d\n", i, j);
			}
			System.out.println("데이타");
		}

	}
}
