package e_method;

public class Ex03_3CallByString {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "하이";
		add(a, b);
		System.out.println("A=" + a + ", B=" + b);
	}

	static void add(String a, String b) {
		a += b;
		System.out.println("A=" + a + ", B=" + b); 
	}

}

// String 을 기본형으로 쓰고싶어서 별종으로 만들었다. (String은 call by reference이다 하지만 메인을  변경하지 않는다.)
// 내용이 변경되기 때문에 메모리가 새로 만들어진다.