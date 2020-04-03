package e_method;

public class Ex03_2CallByRef { 
	/**
	 * 메소드의 인자가 참조형인 경우 -> 주소 복사됨 call by reference
	 */

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		add(a, b);
		System.out.println("A=" + a + ", B=" + b);
	}

	static void add(StringBuffer a,StringBuffer b) {
		//a+=b;
		a.append(b); // 
		System.out.println("A=" + a + ", B=" + b); // 참조형을 인자로 보낸경우 주소값에의해  원본이 수정이 됨
		}
}


// String 별종을 띄어라 클래스로 call by reference