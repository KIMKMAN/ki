package b_operator;

/**
 *  증가(++)/감소(--) 연산자 -> 파이썬 같은 언어는 안 쓴다.
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		
		/*
		// [1]
		System.out.println("a =" + a + ",b=" + b); // a= 5, a= 7 //문자열이기 때문에 정해진 값 그대로 나옴 
		System.out.println("a =" + a+1 + ",b=" + b+1); // a= 51, b=71 // 문자와 뒤에 숫자와 그대로 나열
		System.out.println("a =" + (a+1) + ",b=" + (b+1) ); // a=6 , b=8 // 캐스팅이 들어가면 계산이 가능
		// 그냥 a+1 을 하면 수를 문자 취급하기 때문에 머저 계산을 한다는 의미로 괄호 안에서 계산을 해 준다.
		
		// [2]
		a++; //a = a + 1; //5 // 연산가능 언어  원래 있던 a 에 1을 더해서 저장한다는 뜻이다.
		b--; //b = b - 1; //6 // 위와 동일
		System.out.println("a=" + a + ",b=" + b ); // a= 5, b=7 문자열 변화 없으므로 정해진 숫자로 나옴.
		
		// 이것의 축약형이
		++a; //a = a + 1; //6 // 연산가능 언어 
		--b; //b = b - 1; //7 // 위와 동일
		System.out.println("a=" + a + ",b=" + b ); // a= 6, b=7 문자열 변화 없으므로 정해진 숫자로 나옴.

		// [3] 중가감소연산자는 위치 중요
		int result = ++a;
		System.out.println("결과" + result); // 6
		
		int result2 = b--;
		System.out.println("결과" + result2); // 7
		System.out.println("b"+ b);
		// -- 연산자가 뒤에 있으므로 b를 먼저 대입하고 그  뒤에 뺀다. -> 대입한 결과는7이 되지만 그 뒤에 b가 1 감소 한채로 저장 되어 있어서 이 뒤부터 b는 6이 된다.
		
		// [4]
		System.out.println("a=" + ++a + ",b=" + --b); //a=6, b=6
		System.out.println("a=" + a++ + ",b=" + b--); // a=7, b=5
		System.out.println("a=" + a + ",b=" +b);// a=7 , b=5
		 */
		
		
	}

}
