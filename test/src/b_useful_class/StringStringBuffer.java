package b_useful_class;

public class StringStringBuffer {

	public static void main(String[] args) {
		
		//	0.기본형
		int a= 10;
		a += 5;
		System.out.println(a);
	
		// 1. String : 참조형
		String s = new String("안녕"); 
//		String s = "안녕";
		s= s + "하세요"; //String 을 기본형으로 사용 
		System.out.println(s); //메모리 
	
		// StringBuffer //쓰레기관리 // String이 출력한 경우 기존 주소를 버리지 않고 새주소로 출력값이 계산된다.
		StringBuffer sb = new StringBuffer("행복한"); // 변형된 문자열을 사용하는데 효율적
		// StringBuffer sb2 = "행복한"; //에러가 나오는 이유 String을 제외한 나머지는 new 작성
		// sb = sb + "목요일"; // 위와 동일, 연산 X 
		sb.append("목요일"); // 기존에 주소를 합해서 출력된다. //연산자 역할
		System.out.println(sb);
	
	}
	

}
