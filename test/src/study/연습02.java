package study;

public class 연습02 {

	public static void main(String[] args) {
		// (1) 문자형에 정수를 대입하면?
			char a = 97;
				System.out.println(a);
				char c = 'a';
				System.out.println(c);
				
				// (2) 정수형에 문자를 대입하면?
					int i = 'j';
				System.out.println(i);
					int l = 3;
					System.out.println(l);
				// (3) 실수형 float에 실수를 대입하면?
				//float b = 2.6;
				//System.out.println(b);
				float f = 2.6f;
				System.out.println(f);
				// (4) 실수형에 정수를 대입하면?
				double d = 3;
				System.out.println(d);
				double x = 3.0;
				System.out.println(x);
				// (5) 정수형에 실수를 대입하면?****casting 형변환(강제적으로 바꿔줘야 하기때문에 값에(데이터) 입력)
				int o = (int)2.4;
				System.out.println(o);
				// (6) 정수형에 10억 숫자를  대입하면?
				//int k = 1000000000;
				//System.out.println(k);
				long z = 1000000000L;
				System.out.println(z);

	}

}
