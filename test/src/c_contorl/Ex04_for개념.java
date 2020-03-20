package c_contorl;

public class Ex04_for개념 { // for 대표적인 반복문

	public static void main(String[] args) {

		/*
		 * for (초기치; 조건식; 증가치) { 반복구문 }
		 */

		// 0. 인사말 5번 출력하기
		/*
		 * for (int i = 0; i <5; i++) { // 정수 0부터 계산으로 생각하자 //i<=4 값이 맞지만 차이점이 있다.
		 * System.out.println("안녕하세요"); // 변수 0으로 만드는 것으로 시작 -> 조건을 비교를 하고 증가하고 비교한 수만큼
		 * 반복증가 }
		 */
		
		/* // 1. 1~10까지의 합을 구하기
		 * 
		 * int hap = 0; for(int i = 1; i<=100; i++) { //i<11 동일 hap+=i; // hap = hap +
		 * i; // hap +i; (+= 띄어스면 오류) //hap의 최종값이 더해지고 반복해서 계산하기 때문에 증가된다. }
		 * System.out.println("합 = " + hap); //디버깅시 식
		 */		
		
		//2. 1 ~ 100 까지 홀수의 합과 짝수의 합 구하기
		int even = 0, odd=0;
		for(int i=1; i<=100; i++) {
			
			// 숫자 i가 홀수라면 odd에 합구하기
			if (i%2 == 1) { // 홀 짝  이므로 때문에 나머지로 계산해준다.
				odd+=i;//odd=odd+i 
			}else  {
				even+= i;
			// 그렇지 안으면 even 합구하기
		}
	}
		System.out.println("짝수의 합 = " + even);
		System.out.println("홀수의 합 = " + odd);
		//3. A~Z 출력
		
		/*
		 * for(char ch='A'; ch<='Z'; ch++) { System.out.print(ch); }
		 * System.out.println(); //4 A~Z 출력 (2개씩 건너뛰기) for(char ch='A'; ch<='Z'; ch+=2)
		 * { System.out.print(ch); } System.out.println(); // 5. Z~A 출력 for (char
		 * ch='Z'; ch>='A'; ch--) { System.out.print(ch); }
		 */
	}
}
