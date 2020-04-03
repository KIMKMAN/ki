package e_method;

public class EX01_흐름2 { //Class 명과 똑같이

	 void method () { 
		System.out.println("method 실행"); 
	}
	
	 public static void main(String[] args) {
		System.out.println("main 시작"); // jvm 머신
		EX01_흐름2 ex= new EX01_흐름2(); //Class 메모리를 불러오고  메모리를 새로 만든다..호출이 가능
		ex.method(); //
		System.out.println("main 끝");
	}
		
		
		
// jvm 실행시  메인부터 찾고 실행 
//void  = 아무것도 없다
//	명명 규칙
//	1. 문자+숫자+_+$조합
//	2.길이제한없음
//	3.첫글자에 숫자만 아닌면 됨
//	4. 대소문자구별
//	5. 예약어(key word)는 안됨
//	권장사항
//	- 클래스(명사)명의 첫글자는 대문자시작
//	- 변수(명사)와 메소드(동사)명의 첫글자는 소문자
//	- LARBALE 명은 전부 대문자
//	- 패키지명은 전부 소문자
}
