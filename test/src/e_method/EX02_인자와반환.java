package e_method;

public class EX02_인자와반환 {

	public static void main(String[] args) {
	// 데이타 입력
		int a = 10,	b = 20;
		add(a,b); //a,b 데이타 를 보냄 (인수) parameter
	}

	static void add(int a, int b) { // 분산작업 계산 더하기 // 선언된 변수는 범위 영역안에서만 사용가능 // 받은 데이터값과 변수을 저장해주자. (인자)argument
		// 변수명의해 값이 되는게 아니고 순서대로 값으로 바뀐다. ex>넘어온 값 1, 2 = 받은 값 1, 2
		
		//입력 받은 데이터 합을 구해서 여기서 출력하라.
		int sum = a+b;
		System.out.println("합: "+ sum);
	}
	
	
}
