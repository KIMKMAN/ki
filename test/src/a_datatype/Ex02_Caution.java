package a_datatype;

public class Ex02_Caution {

	public static void main(String[] args) {
		
		// (1) 문자형에 정수를 대입하면?
		char ch = 97;
		System.out.println("ch 값 : " + ch);
		// 이 경우에 ch = A 로 출력된다. 메모리를 작게 잡아놓고 그걸 넘는 걸 넣었는데..? 왜?
		
		// (2) 정수형에 문자를 대입하면?
		int su = 'B';
		System.out.println("su 값: " + su); 
		// 메모리를ㄹ 크게 잡고 작은 값을 넣는 것은 문제가 되지 않는다. 하지만 위 같은경우 아스키 코드에 따라서 숫자가 표기 된다.
		
		// (3) 실수형 float에 실수를 대입하면?
		float f = 3.6F; //float 은 4 바이트 이기 때문에 3.6은  8 바이트 이기 때문에 들어가지 않는다.
		System.out.println("f 값 :" + f); // 해결법은 2가지 이다. 1) float 을 double 로 , 2) 3.5뒤에 f( 대모숨 구분없음) 룰 붙인다.
		
		// (4) 실수형에 정수를 대입하면?
		double d = 100; //아무 문제 없다. 8바이트 공간에 4바이트 데이터를 넣는것은 아무 무리가 없다.
		System.out.println("d 값 :" +d); // 하지만 실수형이기 때문에 100,0이 출력된다.
		
		// (5) 정수형에 실수를 대입하면?****casting 형변환
		int i = (int)3.6;
		System.out.println("i 값 :" + i);
		//int는 4바이트 이기때문에 9바이트 실수가 들어 갈 수 없다. f를 붙인다고 해도 들어 갈 수 없다. 둘의 구성 형식이 다르다.
		// 어쩔 수 없이 3.6을 넣고 싶다면 앞에(int)를 붙혀 주면 되지만 정수형으로 casting 되기 때문에 3이 출력 되는 것을 볼 수 있다.
		// double 같은 경우는 casting 을 잘 하지 않는다.
		
		// (6) 정수형에 10억 숫자를  대입하면?
		double Ch = 4.1;
		long ab = 100000000L;
		
		
		
		System.out.println(Ch );
		System.out.println(ab + Ch );
		
	}

}
