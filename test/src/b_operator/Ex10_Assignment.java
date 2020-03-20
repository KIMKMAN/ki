package b_operator;

/*
 *  연산자와 대입연산자를 합치기 // 연산자는 모든 언어가 비슷
 *  	- 산술, 이진논리, 쉬프트 
 *  	- += -+ *= /= %=
 *  	- &= |= ^=
 *  	- <<= >>= >>>=
 */
public class Ex10_Assignment {

	public static void main(String[] args) {
		
		int  a = 10;
		int  b = 7;

		a+= b; // a = a+b; (10+7) 17 // 마지막 출력값으로 계산 (a에 저장 값)
		System.out.println("+= 결과 : " + a );
		a-= b; // a = a-b; (17-7) 10 
		System.out.println("-= 결과 : " + a );
		a*= b; // a = a*b; (10*7) 70
		System.out.println("*= 결과 : " + a );
		a/= b; // a = a/b; (70/7) 10
		System.out.println("/= 결과 : " + a );
		a%= b; // a = a%b; (10%7) 3 
		System.out.println("%= 결과 : " + a );
	
	}
}
