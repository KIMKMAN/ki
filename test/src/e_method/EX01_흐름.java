package e_method;

public class EX01_흐름 {

	static void method () { // 메인함수에 static 붙어있으므로 똑같이 작성필요.
		System.out.println("method 실행"); 
		
	}
	public static void main(String[] args) { // 자바 머신에 기본 main // 자바에 main static 메인함수
		System.out.println("main 시작"); // jvm 머신
		method(); // method 호출 -> 호출된 메소드 11 라인으로 입력-> 12 출력 -> 반드시 원래자리로 돌아옴 7라인 리턴 -> 9라인 종료
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
