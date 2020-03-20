package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		
	//	Stirng a = new String("홍길동"); 참조형
	//	String b = new String("홍길동");
		String a = new String("홍길동"); // new 가 붙을 경우 주소가 같지만 객체가 다르다
		String b = new String("홍길동");
		//String a = "홍길동"; // 주소가 동일하기 때문에 동일하거나 같다.
		//String b = "홍길동";
		
		
		if( a==b ) // == 주소 값 비교
		{
			System.out.println("동일");
		} else 
		{
			System.out.println("다르다");
		}
		
		if( a.equals(b) ) { // equals 객체의 내용을 비교
			System.out.println("같다");
		} else {
			System.out.println("달라");
		}
		// new 를 사용하지 않고 축약형을 사용하면 a 에서 홍길동이 있으므로 b 도 a를 참조하게 된다.
		// 따라서 동일한 값을 같게 된다.
		
		
	}

}
