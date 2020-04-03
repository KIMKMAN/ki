package a_basic;

public class Main {

	public static void main(String[] args) {
		//student에서 만든 코드를 불러오고 싶다면 메모리에 올려야 한다.
		// 변수 선언
		Student s;
		// 객체 생성 (메모리에 넣어놓는다. 확보) - > 내가 만든것의 틀만 가져와서 쓰는것이다.
		// s = new Student();
		s = new Student();
		s.kor = 70;
		s.eng = 88;
		s.math = 99;
		System.out.println("총점" + s.calTotal()); // s안에 이쓴 calTotal을 불러서 계산하고 값이 나올것이다.
		
		//이런 멤버들의 문제는 어디서든 접근해서 수정 할 수 있다는 것이다.
		// 접근 할 수 있는 경로를 정해주는것이 보안에 더 좋다.
		// 보안이 필요한 상황이 된다.
		// s.total = 100;// 인위적으로 안됨 
		
		//ctrl를 누르고 함수를 누르면 그 함ㅁ수가 있는 곳으로 간다.
		System.out.println("평균" + s.calAve()); // 마찬가지
	}

}
