package b_operator;

public class Ex08_ShortCircuitLogic { // 2진 논리 연산으로 바꿀 경우 앞 항의 결과값과 상관없이 모든 문장이 실행됨.

	public static void main(String[] args) {
		// Sohrt Circuit Logic // 일반논리에서만 적용
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		int a = 3;
		if (a > 3 & ++a > 3) { // 논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음 //78쪽 참조
			System.out.println("조건만족");
		}
		// 이런 경우에 단락회로평가에 의해 if 절의 ++a는 실행 되지 않는다. Shor Circuit Logic ->
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않는다.
		
		System.out.println("A=" + a ); // 이것 역시 단락회로 평가에 의해 뒤의 ++a 가 실행 되지 않는다.

		//SCL 은 일반놀리에서만 발현된다.
		// 원래 이진논리연산자는 트루 풀스를 해주는 연산자가 아닌데, 요즘에는 헷갈려 하는 사람들이 많아서 이진 논리 연산자로 Short Criuit Logic을
		// 무시하고 모든 항을 실행 시킬 수 있다.
		if (a >1 | ++a >3) { // 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않음 
			System.out.println("조건만족2"); 
			
		}
		System.out.println("A=" + a); 

	}

}
